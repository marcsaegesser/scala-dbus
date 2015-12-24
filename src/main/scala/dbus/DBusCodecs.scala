package dbus

import scalaz._,Scalaz._
import DBus._

trait DBusCodec[T] {
  def encode(t: T): String \/ Field
  def decode(f: Field): String \/ T
}

object DBusCodec {
  def fubar[T]: Option[T] = macro macros.Macros.fubar[T]
  def derive[T]: DBusCodec[T] = macro macros.Macros.materializeDBusCodecImpl[T]
}

trait DBusCodecs {
  implicit val dbusBooleanCodec = new DBusCodec[Boolean] {
    def encode(t: Boolean): String \/ Field = FieldBoolean(t).right
    def decode(f: Field): String \/ Boolean =
      f match {
        case FieldBoolean(b) => b.right
        case _ => s"$f is not a Boolean field".left
      }
  }

  implicit val debusByteCodec = new DBusCodec[Byte] {
    def encode(t: Byte): String \/ Field = FieldWord8(t).right
    def decode(f: Field): String \/ Byte =
      f match {
        case FieldWord8(b) => b.right
        case _ => s"$f is not a Byte field".left
      }
  }

  implicit val dbusShortCodec = new DBusCodec[Short] {
    def encode(t: Short): String \/ Field = FieldInt16(t).right
    def decode(f: Field): String \/ Short =
      f match {
        case FieldInt16(i) => i.right
        case _ => s"$f is not a Short field".left
      }
  }

  implicit val dbusIntCodec = new DBusCodec[Int] {
    def encode(t: Int): String \/ Field = FieldInt32(t).right
    def decode(f: Field): String \/ Int =
      f match {
        case FieldInt32(i) => i.right
        case _ => s"$f is not an Int field".left
      }
  }

  implicit val dbusLongCodec = new DBusCodec[Long] {
    def encode(t: Long): String \/ Field = FieldInt64(t).right
    def decode(f: Field): String \/ Long =
      f match {
        case FieldInt64(i) => i.right
        case _ => s"$f is not a Long field".left
      }
  }

  implicit val dbusDoubleCodec = new DBusCodec[Double] {
    def encode(t: Double): String \/ Field = FieldDouble(t).right
    def decode(f: Field): String \/ Double = f.asDouble.right
  }

  implicit val dbusStringCodec = new DBusCodec[String] {
    def encode(t: String): String \/ Field = FieldString(t).right
    def decode(f: Field): String \/ String =
      f match {
        case FieldString(s) => s.right
        case _ => s"$f is not a String field".left
      }
  }

  implicit val dbusSignatureCodec = new DBusCodec[Signature] {
    def encode(t: Signature): String \/ Field = FieldSignature(t).right
    def decode(f: Field): String \/ Signature =
      f match {
        case FieldSignature(s) => s.right
        case _ => s"$f is not a Signature field".left
      }
  }

  implicit val dbusObjectPathCodec = new DBusCodec[ObjectPath] {
    def encode(t: ObjectPath): String \/ Field = FieldObjectPath(t).right
    def decode(f: Field): String \/ ObjectPath =
      f match {
        case FieldObjectPath(p) => p.right
        case _ => s"$f is not an ObjectPath field".left
      }
  }
}
