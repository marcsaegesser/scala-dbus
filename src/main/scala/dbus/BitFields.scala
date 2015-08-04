package dbus

object BitFields {
  trait BitField { val code: Int }

  def encodeBitFieldInt(fields: Seq[BitField]): Int =
    fields.map(_.code).foldLeft(0)(_|_)

  def encodeBitFieldByte(fields: Seq[BitField]): Byte =
    encodeBitFieldInt(fields).toByte
}
