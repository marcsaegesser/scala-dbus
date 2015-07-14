package dbus

import scodec.bits.BitVector
import scalaz._,Scalaz._

trait DBusMessageCodec {
  import DBus._

  def encode(msg: DBusMessage): Throwable \/ BitVector =
    for {
      b <- marshal(msg.body)
      flags = msg.flags.foldLeft(0.toByte)((a, f) => (a | f.flag).toByte)
      h = Vector[Field](
        FieldWord8('B'.toByte),
        FieldWord8(msg.msgType.code),
        FieldWord8(flags),
        FieldWord8(1.toByte),
        FieldWord32((b.length / 8).toInt),
        FieldWord32(1),
        FieldArray(TypeStructure(List(TypeWord8, TypeVariant)), msg.headers.map(_.f).toVector)
      )
      hb <- marshal(h)
      p = BitVector.fill(padBytesNeeded(hb.size / 8)*8)(false)
    } yield hb ++ p ++ b

  def decode(headerBits: BitVector, bodyBits: BitVector): Message = {
    for {
      s <- "yyyyuua(yv)".toSignature
      h <- unmarshal(s, headerBits)
    } ???

    ???
  }

  def padBytesNeeded(length: Long): Long = {
    val m = length % 8
    val result =
      if (m > 0)
        (8 - m)
      else
        0
    result
  }
}

object DBusMessageCodec extends DBusMessageCodec
