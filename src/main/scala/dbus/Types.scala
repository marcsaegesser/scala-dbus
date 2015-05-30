package dbus

import scala.annotation.tailrec
import scala.util.control.NonFatal
import scala.collection.mutable.StringBuilder
import scalaz._,Scalaz._
import DBus._

trait Types {
  sealed trait Type { val code: String; val align: Int }
  sealed trait AtomicType extends Type

  // Atomic Types
  case object TypeBoolean    extends AtomicType { val code = "b"; val align = 4 }
  case object TypeWord8      extends AtomicType { val code = "y"; val align = 1 }
  case object TypeWord16     extends AtomicType { val code = "q"; val align = 2 }
  case object TypeWord32     extends AtomicType { val code = "u"; val align = 4 }
  case object TypeWord64     extends AtomicType { val code = "t"; val align = 8 }
  case object TypeInt16      extends AtomicType { val code = "n"; val align = 2 }
  case object TypeInt32      extends AtomicType { val code = "i"; val align = 4 }
  case object TypeInt64      extends AtomicType { val code = "x"; val align = 8 }
  case object TypeDouble     extends AtomicType { val code = "d"; val align = 8 }
  case object TypeUnixFD     extends AtomicType { val code = "h"; val align = 4 }
  case object TypeString     extends AtomicType { val code = "s"; val align = 4 }
  case object TypeSignature  extends AtomicType { val code = "g"; val align = 4 }
  case object TypeObjectPath extends AtomicType { val code = "o"; val align = 4 }
  // Container Types
  case object TypeVariant       extends Type { val code = "v"; val align = 1 }
  case class TypeArray(t: Type) extends Type { val code = s"a${t.code}"; val align = 4 }
  case class TypeDictionary(k: AtomicType, v: Type) extends Type { val code = s"a{${k.code}${v.code}}"; val align = 8 }
  case class TypeStructure(ts: List[Type]) extends Type { val code = ts map (_.code) mkString ("(", "", ")"); val align = 8 }

  /* Represents a *valid* D-Bus type signature */
  trait Signature {
    val types: List[Type]

    override def toString() =
      (types.foldLeft(new StringBuilder()){ (a, t) => a.append(t.code) }).toString
  }

  implicit class ListOps[T <: Type](val ts: List[T]) {
    def toSignature: Throwable \/ Signature =
      if(sumLength(ts) > 255) new Exception("Signature exceeds 255 bytes").left
      else (new Signature{ val types = ts }).right

    def toSignatureO: Option[Signature] = toSignature.toOption
    def toSignature_ : Signature = toSignature fold (throw _, identity)
  }

  implicit class StringOps[T <: Type](val sig: String) {
    def toSignature: Throwable \/ Signature =
      if(sig.length > 255) new Exception("Signature exceeds 255 bytes").left
      else parseSignature(sig)

    def toSignatureO: Option[Signature] = toSignature.toOption
    def toSignature_ : Signature = toSignature fold (throw _, identity)
  }

  def typeLength[T <: Type](t: T): Int =
    t match {
      case TypeArray(tt)        => 1 + typeLength(tt)
      case TypeDictionary(k, v) => 3 + typeLength(k) + typeLength(v)
      case TypeStructure(ts)    => 2 + sumLength(ts)
      case _                    => 1
    }

  def sumLength[T <: Type](ts: List[T]): Int = (ts map (typeLength)).sum

  def typeDepth[T <: Type](t: T): Int =
    t match {
      case TypeArray(tt)        => 1 + typeDepth(tt)
      case TypeDictionary(k, v) => 1 + typeDepth(v)
      case TypeStructure(ts)    => 1 + maxDepth(ts)
      case _                    => 1
    }

  def maxDepth[T <: Type](ts: List[T]): Int =
    ts.foldLeft(0){ (a, t) => Math.max(a, typeDepth(t)) }

  def parseSignature(s: String): Throwable \/ Signature =
    parseSignature(s.getBytes("UTF-8").toList)

  def parseSignature(s: List[Byte]): Throwable \/ Signature =
    try {
      sigParser(s, List()).toSignature
    } catch {
      case NonFatal(e) => e.left
    }

  @tailrec
  private def sigParser(bytes: List[Byte], accum: List[Type]): List[Type] =
    bytes match {
      case Nil => accum.reverse
      case 0x76 :: bs => sigParser(bs, TypeVariant :: accum)  // v
      case 0x61 :: bs =>                                      // a
        val (remaining, t) = parseArray(bs)
        sigParser(remaining, t :: accum)
      case 0x28 :: bs =>                                      // (
        val (remaining, t) = parseStructure(bs)
        sigParser(remaining, t :: accum)
      case b :: bs    => sigParser(bs, atomic(b) :: accum)
    }

  private def parseOne(bytes: List[Byte]): (List[Byte], Type) =
    bytes match {
      case Nil        => throw new Exception("malformed signature")
      case 0x76 :: bs => (bs, TypeVariant)     // v
      case 0x61 :: bs => parseArray(bs)        // a
      case 0x28 :: bs => parseStructure(bs)    // (
      case b :: bs    => (bs, atomic(b))
    }

  private def parseUntil(bytes: List[Byte], term: Byte): (List[Byte], List[Type]) = {
    def helper(input: List[Byte], accum: List[Type]): (List[Byte], List[Type]) =
      input match {
        case Nil => throw new Exception("malformed signature")
        case b :: bs if b == term =>
          (bs, accum.reverse)
        case b :: bs =>
          val (remaining, t) = parseOne(input)
          helper(remaining, t :: accum)
      }

    helper(bytes, List())
  }

  private def parseArray(bytes: List[Byte]): (List[Byte], Type) = {
    bytes match {
      case Nil => throw new Exception("malformed signature")
      case b :: bs if b == 0x7B =>
        val (remaining, t) = parseDict(bs)
        (remaining, t)
      case _ =>
        val (remaining, t) = parseOne(bytes)
        (remaining, TypeArray(t))
    }
  }

  private def parseStructure(bytes: List[Byte]): (List[Byte], Type) = {
    val (remaining, ts) = parseUntil(bytes, ')')
    (remaining, TypeStructure(ts))
  }

  private def parseDict(bytes: List[Byte]): (List[Byte], Type) = {
    val (r, kt) = parseAtom(bytes)
    val (rr, vt) = parseUntil(r, '}')

    vt match {
      case t :: Nil => (rr, TypeDictionary(kt, t))
      case _ => throw new Exception(s"malformed signature: Invalid DictEntry value type '${vt.mkString("(", ",", ")")}'")
    }

  }

  private def parseAtom(bytes: List[Byte]): (List[Byte], AtomicType) = {
    bytes match {
      case Nil => throw new Exception("malformed signature")
      case b :: bs => (bs, atomic(b))
    }
  }

  private def atomic(c: Byte): AtomicType =
    c match {
      case 'b' => TypeBoolean
      case 'y' => TypeWord8
      case 'q' => TypeWord16
      case 'u' => TypeWord32
      case 't' => TypeWord64
      case 'n' => TypeInt16
      case 'i' => TypeInt32
      case 'x' => TypeInt64
      case 'd' => TypeDouble
      case 'h' => TypeUnixFD
      case 's' => TypeString
      case 'g' => TypeSignature
      case 'o' => TypeObjectPath
      case '{' => throw new Exception("'{' encountered outside of an array")
      case _   => throw new Exception(f"Unknown type code '$c%c'")
    }


}
