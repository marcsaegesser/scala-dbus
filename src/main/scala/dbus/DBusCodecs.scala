package dbus

import scala.language.higherKinds
import cats._
import cats.implicits._
import DBus._

trait DBusCodec[T] {
  def encode(t: T): Either[String, Field] //String \/ Field
  def decode(f: Field): Either[String, T] //String \/ T
  def dbusType: Type
}

object DBusCodec {
  def derive[T]: DBusCodec[T] = macro macros.Macros.materializeDBusCodecImpl[T]
}

trait DBusCodecs {
  implicit val dbusBooleanCodec = new DBusCodec[Boolean] {
    def dbusType: Type = TypeBoolean
    def encode(t: Boolean): Either[String, Field] = FieldBoolean(t).asRight
    def decode(f: Field): Either[String, Boolean] =
      f match {
        case FieldBoolean(b) => Right(b)
        case _ => Left(s"$f is not a Boolean field")
      }
  }

  implicit val dbusByteCodec = new DBusCodec[Byte] {
    def dbusType: Type = TypeWord8
    def encode(t: Byte): Either[String, Field] = FieldWord8(t).asRight
    def decode(f: Field): Either[String, Byte] =
      f match {
        case FieldWord8(b) => b.asRight
        case _ => s"$f is not a Byte field".asLeft
      }
  }

  implicit val dbusShortCodec = new DBusCodec[Short] {
    def dbusType: Type = TypeInt16
    def encode(t: Short): Either[String, Field] = FieldInt16(t).asRight
    def decode(f: Field): Either[String, Short] =
      f match {
        case FieldInt16(i) => i.asRight
        case _ => s"$f is not a Short field".asLeft
      }
  }

  implicit val dbusIntCodec = new DBusCodec[Int] {
    def dbusType: Type = TypeInt32
    def encode(t: Int): Either[String, Field] = FieldInt32(t).asRight
    def decode(f: Field): Either[String, Int] =
      f match {
        case FieldInt32(i) => i.asRight
        case _ => s"$f is not an Int field".asLeft
      }
  }

  implicit val dbusLongCodec = new DBusCodec[Long] {
    def dbusType: Type = TypeInt64
    def encode(t: Long): Either[String, Field] = FieldInt64(t).asRight
    def decode(f: Field): Either[String, Long] =
      f match {
        case FieldInt64(i) => i.asRight
        case _ => s"$f is not a Long field".asLeft
      }
  }

  implicit val dbusDoubleCodec = new DBusCodec[Double] {
    def dbusType: Type = TypeDouble
    def encode(t: Double): Either[String, Field] = FieldDouble(t).asRight
    def decode(f: Field): Either[String, Double] = f.asDouble.asRight
  }

  implicit val dbusStringCodec = new DBusCodec[String] {
    def dbusType: Type = TypeString
    def encode(t: String): Either[String, Field] = FieldString(t).asRight
    def decode(f: Field): Either[String, String] =
      f match {
        case FieldString(s) => s.asRight
        case _ => s"$f is not a String field".asLeft
      }
  }

  implicit val dbusSignatureCodec = new DBusCodec[Signature] {
    def dbusType: Type = TypeSignature
    def encode(t: Signature): Either[String, Field] = FieldSignature(t).asRight
    def decode(f: Field): Either[String, Signature] =
      f match {
        case FieldSignature(s) => s.asRight
        case _ => s"$f is not a Signature field".asLeft
      }
  }

  implicit val dbusObjectPathCodec = new DBusCodec[ObjectPath] {
    def dbusType: Type = TypeObjectPath
    def encode(t: ObjectPath): Either[String, Field] = FieldObjectPath(t).asRight
    def decode(f: Field): Either[String, ObjectPath] =
      f match {
        case FieldObjectPath(p) => p.asRight
        case _ => s"$f is not an ObjectPath field".asLeft
      }
  }

  implicit def dbusSeqCodec[T](implicit codec: DBusCodec[T]) = new DBusCodec[List[T]] {
    def dbusType: Type = codec.dbusType
    def encode(t: List[T]): Either[String, Field] =
      for {
        ts <- t.map(codec.encode).sequence[Either[String, ?], Field]
      } yield FieldArray(codec.dbusType, ts.toVector)

    def decode(f: Field): Either[String, List[T]] =
      f match {
        case FieldArray(t, ts) =>
          for {
            t <- ts.map(codec.decode).sequence[Either[String, ?], T]
          } yield t.toList
        case _ => s"$f is not an Array type".asLeft
      }
  }
}
