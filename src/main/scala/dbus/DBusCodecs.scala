package dbus

import scala.language.higherKinds
import scalaz._,Scalaz._
import DBus._

trait DBusCodec[T] {
  def encode(t: T): String \/ Field
  def decode(f: Field): String \/ T
  def dbusType: Type
}

object DBusCodec {
  def derive[T]: DBusCodec[T] = macro macros.Macros.materializeDBusCodecImpl[T]
}

trait DBusCodecs {
  implicit val dbusBooleanCodec = new DBusCodec[Boolean] {
    def dbusType: Type = TypeBoolean
    def encode(t: Boolean): String \/ Field = FieldBoolean(t).right
    def decode(f: Field): String \/ Boolean =
      f match {
        case FieldBoolean(b) => b.right
        case _ => s"$f is not a Boolean field".left
      }
  }

  implicit val dbusByteCodec = new DBusCodec[Byte] {
    def dbusType: Type = TypeWord8
    def encode(t: Byte): String \/ Field = FieldWord8(t).right
    def decode(f: Field): String \/ Byte =
      f match {
        case FieldWord8(b) => b.right
        case _ => s"$f is not a Byte field".left
      }
  }

  implicit val dbusShortCodec = new DBusCodec[Short] {
    def dbusType: Type = TypeInt16
    def encode(t: Short): String \/ Field = FieldInt16(t).right
    def decode(f: Field): String \/ Short =
      f match {
        case FieldInt16(i) => i.right
        case _ => s"$f is not a Short field".left
      }
  }

  implicit val dbusIntCodec = new DBusCodec[Int] {
    def dbusType: Type = TypeInt32
    def encode(t: Int): String \/ Field = FieldInt32(t).right
    def decode(f: Field): String \/ Int =
      f match {
        case FieldInt32(i) => i.right
        case _ => s"$f is not an Int field".left
      }
  }

  implicit val dbusLongCodec = new DBusCodec[Long] {
    def dbusType: Type = TypeInt64
    def encode(t: Long): String \/ Field = FieldInt64(t).right
    def decode(f: Field): String \/ Long =
      f match {
        case FieldInt64(i) => i.right
        case _ => s"$f is not a Long field".left
      }
  }

  implicit val dbusDoubleCodec = new DBusCodec[Double] {
    def dbusType: Type = TypeDouble
    def encode(t: Double): String \/ Field = FieldDouble(t).right
    def decode(f: Field): String \/ Double = f.asDouble.right
  }

  implicit val dbusStringCodec = new DBusCodec[String] {
    def dbusType: Type = TypeString
    def encode(t: String): String \/ Field = FieldString(t).right
    def decode(f: Field): String \/ String =
      f match {
        case FieldString(s) => s.right
        case _ => s"$f is not a String field".left
      }
  }

  implicit val dbusSignatureCodec = new DBusCodec[Signature] {
    def dbusType: Type = TypeSignature
    def encode(t: Signature): String \/ Field = FieldSignature(t).right
    def decode(f: Field): String \/ Signature =
      f match {
        case FieldSignature(s) => s.right
        case _ => s"$f is not a Signature field".left
      }
  }

  implicit val dbusObjectPathCodec = new DBusCodec[ObjectPath] {
    def dbusType: Type = TypeObjectPath
    def encode(t: ObjectPath): String \/ Field = FieldObjectPath(t).right
    def decode(f: Field): String \/ ObjectPath =
      f match {
        case FieldObjectPath(p) => p.right
        case _ => s"$f is not an ObjectPath field".left
      }
  }

  implicit def dbusSeqCodec[T](implicit codec: DBusCodec[T]) = new DBusCodec[List[T]] {
    def dbusType: Type = codec.dbusType
    def encode(t: List[T]): String \/ Field =
      for {
        ts <- t.map(codec.encode).sequenceU
      } yield FieldArray(codec.dbusType, ts.toVector)

    def decode(f: Field): String \/ List[T] =
      f match {
        case FieldArray(t, ts) =>
          for {
            t <- ts.map(codec.decode).sequenceU
          } yield t.toList
        case _ => s"$f is not an Array type".left
      }
  }
}
