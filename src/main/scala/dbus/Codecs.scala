package dbus

import java.nio.charset.Charset
import scodec._
import scodec.codecs._
import scodec.bits.BitVector

object DBusCodecs {
  def string32L(implicit charset: Charset): Codec[String] =
    variableSizeBytes(int32L, string(charset)).withToString(s"string32(${charset.displayName})")
  val utf8_32L = string32L(Charset.forName("UTF-8"))

  def variableSizeBytesSmall[A](size: Codec[Byte], value: Codec[A], sizePadding: Int = 0): Codec[A] =
    variableSizeBytesLong(widenByteToLong(size), value, sizePadding.toLong)

  private def widenByteToLong(c: Codec[Byte]): Codec[Long] =
    c.widen[Long](i => i.toLong, l => if (l > Byte.MaxValue || l < Byte.MinValue) Attempt.failure(Err(s"$l cannot be converted to an integer")) else Attempt.successful(l.toByte)).withToString(c.toString)

  def string8(implicit charset: Charset): Codec[String] =
    variableSizeBytesSmall(byte, string(charset)).withToString(s"string32(${charset.displayName})")
  val utf8_8 = string8(Charset.forName("UTF-8"))

  val nullByte = constant(BitVector(0))
  val dbusStringCodec = utf8_32 ~ nullByte
  val dbusStringCodecL = utf8_32L ~ nullByte
  val dbusStringCodecSmall = utf8_8 ~ nullByte
}
