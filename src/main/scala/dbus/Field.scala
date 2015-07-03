package dbus

import dbus._

trait Fields {
  import DBus._

  sealed trait Field {
    val t: Type
    def asBoolean: Boolean = throw new Exception(s"Not a Boolean field")
    def asByte: Byte = throw new Exception(s"Not a Byte field")
    def asShort: Short = throw new Exception(s"Not a Short field")
    def asInt: Int = throw new Exception(s"Not an Int field")
    def asLong: Long = throw new Exception(s"Not an Long field")
    def asDouble: Double = throw new Exception(s"Not a Double field")
    def asUnixFD: Int = throw new Exception(s"Not an UnixFD field")
    def asString: String = throw new Exception(s"Not a String field")
    def asObjectPath: ObjectPath = throw new Exception(s"Not an ObjectPath field")
    def asSignature: Signature = throw new Exception(s"Not a Signature field")

  }

  sealed trait AtomicField extends Field

  case class FieldBoolean(v: Boolean) extends AtomicField {
    val t = TypeBoolean
    override def asBoolean = v
  }

  case class FieldWord8(v: Byte) extends AtomicField {
    val t = TypeWord8
    override def asByte = v
  }

  case class FieldWord16(v: Short) extends AtomicField {
    val t = TypeWord16
    override def asShort = v
  }

  case class FieldWord32(v: Int) extends AtomicField {
    val t = TypeWord32
    override def asInt = v
  }

  case class FieldWord64(v: Long) extends AtomicField {
    val t = TypeWord64
    override def asLong = v
  }

  case class FieldInt16(v: Short) extends AtomicField {
    val t = TypeInt16
    override def asShort = v
  }

  case class FieldInt32(v: Int) extends AtomicField {
    val t = TypeInt32
    override def asInt = v
  }

  case class FieldInt64(v: Long) extends AtomicField {
    val t = TypeInt64
    override def asLong = v
  }

  case class FieldDouble(v: Double) extends AtomicField {
    val t = TypeDouble
    override def asDouble = v
  }

  case class FieldUnixFD(v: Int) extends AtomicField {
    val t = TypeUnixFD
    override def asUnixFD = v
  }

  case class FieldString(v: String) extends AtomicField {
    val t = TypeString
    override def asString = v
  }

  case class FieldObjectPath(v: ObjectPath) extends AtomicField {
    val t = TypeObjectPath
    override def asObjectPath = v
  }

  case class FieldSignature(v: Signature) extends AtomicField {
    val t = TypeSignature
    override def asSignature = v
  }

  case class FieldArray(b: Type, v: Vector[Field]) extends Field {
    val t = TypeArray(b)
  }

  case class FieldStructure(s: Signature, v: Vector[Field]) extends Field {
    val t = TypeStructure(s.types)
  }

  case class FieldVariant(v: Field) extends Field {
    val t = TypeVariant
  }

  case class FieldDictionary(t: TypeDictionary, v: Vector[(Field, Field)]) extends Field

  // type Message = Vector[Field]

  implicit class FieldSeqOps[F <: Field](val fs: Seq[F]) {
    def toFields: Vector[Field] = fs.toVector
  }
}
