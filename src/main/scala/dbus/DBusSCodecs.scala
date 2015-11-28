package dbus

import java.nio.charset.Charset
import scodec._
import scodec.codecs._
import scodec.bits.BitVector

object DBusSCodecs {
  def string32L(implicit charset: Charset): Codec[String] =
    variableSizeBytes(int32L, string(charset)).withToString(s"string32(${charset.displayName})")
  val utf8_32L = string32L(Charset.forName("UTF-8"))

  def variableSizeBytesSmall[A](size: Codec[Byte], value: Codec[A], sizePadding: Int = 0): Codec[A] =
    variableSizeBytesLong(widenUByteToLong(size), value, sizePadding.toLong)

  private def widenUByteToLong(c: Codec[Byte]): Codec[Long] =
    c.widen[Long](i => i.toLong & 0x00FF, l => if((l & 0xFFFFFFFFFFFFFF00L) != 0) Attempt.failure(Err(s"$l cannot be converted to an 'unsigned' byte")) else Attempt.successful(l.toByte)).withToString(c.toString)

  def string8(implicit charset: Charset): Codec[String] =
    variableSizeBytesSmall(byte, string(charset)).withToString(s"string32(${charset.displayName})")
  val utf8_8 = string8(Charset.forName("UTF-8"))

  val nullByte = constant(BitVector(0))
  val dbusStringCodec = utf8_32 ~ nullByte
  val dbusStringCodecL = utf8_32L ~ nullByte
  val dbusStringCodecSmall = utf8_8 ~ nullByte
}
