package dbus

object FieldOps {
  import DBus._

  implicit def bool2Field(b: Boolean) = FieldBoolean(b)
  implicit def short2Field(s: Short) = FieldInt16(s)
  implicit def int2Field(i: Int) = FieldInt32(i)
  implicit def long2Field(l: Long) = FieldInt64(l)
  implicit def string2Field(s: String) = FieldString(s)
  implicit def objectPath2Field(o: ObjectPath) = FieldObjectPath(o)
  implicit def signature2Field(s: Signature) = FieldSignature(s)

  implicit class BooleanFieldOps(val b: Boolean) extends AnyVal {
    def toField = FieldBoolean(b)
  }

  implicit class ByteFieldOps(val b: Byte) extends AnyVal {
    def toField = FieldWord8(b)
  }

  implicit class ShortFieldOps(val s: Short) extends AnyVal {
    def toField = FieldInt16(s)
    def toFieldWord16 = FieldWord16(s)
  }

  implicit class IntFieldOps(val i: Int) extends AnyVal {
    def toField = FieldInt32(i)
    def toFieldWord32 = FieldWord32(i)
    def toFieldUnixFD = FieldUnixFD(i)
  }

  implicit class LongFieldOps(val l: Long) extends AnyVal {
    def toField = FieldInt64(l)
    def toFieldWord64 = FieldWord64(l)
  }

  implicit class StringFieldOps(val s: String) extends AnyVal {
    def toField = FieldString(s)
  }
}
