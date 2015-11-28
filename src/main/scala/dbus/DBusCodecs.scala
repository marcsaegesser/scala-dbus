package dbus

import DBus._

trait DBusCodec[T] {
  def encode(t: T): Field
  def decode(f: Field): T
}

object DBusCodec {
  def derive[T]: DBusCodec[T] = macro macros.Macros.materializeDBusCodecImpl[T]
}

trait DBusCodecs {
  implicit val dbusBooleanCodec = new DBusCodec[Boolean] {
    def encode(t: Boolean): Field = FieldBoolean(t)
    def decode(f: Field): Boolean = f.asBoolean
  }

  implicit val debusByteCodec = new DBusCodec[Byte] {
    def encode(t: Byte): Field = FieldWord8(t)
    def decode(f: Field): Byte = f.asByte
  }

  implicit val dbusShortCodec = new DBusCodec[Short] {
    def encode(t: Short): Field = FieldInt16(t)
    def decode(f: Field): Short = f.asShort
  }

  implicit val dbusIntCodec = new DBusCodec[Int] {
    def encode(t: Int): Field = FieldInt32(t)
    def decode(f: Field): Int = f.asInt
  }

  implicit val dbusLongCodec = new DBusCodec[Long] {
    def encode(t: Long): Field = FieldInt64(t)
    def decode(f: Field): Long = f.asLong
  }

  implicit val dbusDoubleCodec = new DBusCodec[Double] {
    def encode(t: Double): Field = FieldDouble(t)
    def decode(f: Field): Double = f.asDouble
  }

  implicit val dbusStringCodec = new DBusCodec[String] {
    def encode(t: String): Field = FieldString(t)
    def decode(f: Field): String = f.asString
  }

  implicit val dbusSignatureCodec = new DBusCodec[Signature] {
    def encode(t: Signature): Field = FieldSignature(t)
    def decode(f: Field): Signature = f.asSignature
  }

  implicit val dbusObjectPathCodec = new DBusCodec[ObjectPath] {
    def encode(t: ObjectPath): Field = FieldObjectPath(t)
    def decode(f: Field): ObjectPath = f.asObjectPath
  }
}
