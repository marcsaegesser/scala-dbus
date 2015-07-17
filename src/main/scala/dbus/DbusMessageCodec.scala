package dbus

import scodec.bits.{ BitVector, ByteOrdering }
import scalaz._,Scalaz._
import com.typesafe.scalalogging._

trait DBusMessageCodec extends StrictLogging {
  import DBus._

  val headerEndiannessL = Lens.lensu[Vector[Field], Byte]((v, e) => v.updated(0, FieldWord8(e)), _(0).asByte)
  val HeaderType = TypeStructure(List(TypeWord8, TypeVariant))
  val headerMsgTypeL = Lens.lensu[Vector[Field], Byte]((v, t) => v.updated(1, FieldWord8(t)), _(1).asByte)
  val headerFlagsL = Lens.lensu[Vector[Field], Byte]((v, f) => v.updated(2, FieldWord8(f)), _(2).asByte)
  val headerBodyLengthL = Lens.lensu[Vector[Field], Int]((v, l) => v.updated(4, FieldWord32(l)), _(4).asInt)
  val headerSerialL = Lens.lensu[Vector[Field], Int]((v, s) => v.updated(5, FieldWord32(s)), _(5).asInt)
  val headerFieldsL = Lens.lensu[Vector[Field], FieldArray]((v, h) => v.updated(6, h), _(6).asInstanceOf[FieldArray])

  def encode(msg: DBusMessage, serial: Int): Throwable \/ BitVector =
    for {
      b <- marshal(msg.body)
      flags = msg.flags.foldLeft(0.toByte)((a, f) => (a | f.flag).toByte)
      h = Vector[Field](
        FieldWord8('B'.toByte),
        FieldWord8(msg.msgType.code),
        FieldWord8(flags),
        FieldWord8(1.toByte),
        FieldWord32((b.length / 8).toInt),
        FieldWord32(serial),
        FieldArray(HeaderType, msg.headers.map(_.toField).toVector)
      )
      hb <- marshal(h)
      p = BitVector.fill(padBytesNeeded(hb.size / 8)*8)(false)
    } yield hb ++ p ++ b

  def decode(headerBits: BitVector, bodyBits: BitVector): Throwable \/ DBusMessage =
    for {
      s <- "yyyyuua(yv)".toSignature
      o <- determineByteOrder(headerBits)
      h <- unmarshal(s, headerBits, o)
      m <- decodeMessage(h, bodyBits)
    } yield m

  def decodeHeader(bits: BitVector): Throwable \/ Vector[Field] =
    for {
      s <- "yyyyuua(yv)".toSignature
      o <- determineByteOrder(bits)
      h <- unmarshal(s, bits, o)
    } yield h

  def decodeFixedHeader(bits: BitVector): Throwable \/ Vector[Field] =
    for {
      s <- "yyyyuuu".toSignature
      o <- determineByteOrder(bits)
      h <- unmarshal(s, bits, o)
    } yield h

  def determineByteOrder(bits: BitVector): Throwable \/ ByteOrdering =
    \/.fromTryCatchNonFatal {
      bits.getByte(0) match {
        case 'B' => ByteOrdering.BigEndian
        case 'l' => ByteOrdering.LittleEndian
        case b @ _ => throw new Exception(s"Illegal byte order $b")
      }
    }

  def endiannessToByteOrdering(e: Byte): ByteOrdering =
    e match {
      case 'B' => ByteOrdering.BigEndian
      case 'l' => ByteOrdering.LittleEndian
      case b @ _ => throw new Exception(s"Illegal byte order $b")
    }

  def decodeMessage(header: Vector[Field], bodyBits: BitVector): Throwable \/ DBusMessage = {
    \/.fromTryCatchNonFatal {
      val headerFields = headerFieldsL.get(header).v
        .map {
          case FieldStructure(s, v) => (v(0).asByte, v(1).asInstanceOf[FieldVariant].v)
          case f @ _ => throw new Exception(s"Invalid header field $f")
        }.toMap
      headerMsgTypeL.get(header) match {
        case MethodCallType.code   => decodeMethodCall(header, headerFields, bodyBits)
        case MethodReturnType.code => decodeMethodReturn(header, headerFields, bodyBits)
        case ErrorType.code        => decodeError(header, headerFields, bodyBits)
        case SignalType.code       => decodeSignal(header, headerFields, bodyBits)
      }
    }
  }

  def decodeMethodCall(header: Vector[Field], headerFields: Map[Byte, Field], bodyBits: BitVector): DBusMessage = {
    val flags = headerFlagsL.get(header)
    val o = endiannessToByteOrdering(headerEndiannessL.get(header))

    logger.debug(s"decodeMethodCall:  headerFields=$headerFields")
    logger.debug(s"decodeMethodcall:  memberName = ${headerFields.get(HeaderMemberType.code)}")
    MethodCall(
      headerFields.get(HeaderPathType.code).map(_.asObjectPath).getOrElse(throw new Exception("Method call missing Path")),
      headerFields.get(HeaderInterfaceType.code).flatMap(_.asString.toInterfaceName.toOption),
      headerFields.get(HeaderMemberType.code).flatMap(_.asString.toMemberName.toOption).getOrElse(throw new Exception("Method call missing Member")),
      headerFields.get(HeaderSenderType.code).flatMap(_.asString.toBusName.toOption),
      headerFields.get(HeaderDestinationType.code).flatMap(_.asString.toBusName.toOption),
      (flags & NoReplyExpected.flag) == 0.toByte,
      (flags & NoAutoStart.flag) == 0.toByte,
      headerFields.get(HeaderSignatureType.code).map(_.asSignature).flatMap(s => unmarshal(s, bodyBits, o).toOption).getOrElse(Vector.empty[Field])
    )
  }

  def decodeMethodReturn(header: Vector[Field], headerFields: Map[Byte, Field], bodyBits: BitVector): DBusMessage = {
    val flags = headerFlagsL.get(header)
    val o = endiannessToByteOrdering(headerEndiannessL.get(header))
    MethodReturn(
      headerFields.get(HeaderReplySerialType.code).map(_.asInt).getOrElse(throw new Exception("Method return missing Serial")),
      headerFields.get(HeaderSenderType.code).flatMap(_.asString.toBusName.toOption),
      headerFields.get(HeaderDestinationType.code).flatMap(_.asString.toBusName.toOption),
      headerFields.get(HeaderSignatureType.code).map(_.asSignature).map(s => unmarshal(s, bodyBits, o).fold(throw _, identity)).getOrElse(Vector.empty[Field])
    )
  }

  def decodeError(header: Vector[Field], headerFields: Map[Byte, Field], bodyBits: BitVector): DBusMessage = {
    val flags = headerFlagsL.get(header)
    val o = endiannessToByteOrdering(headerEndiannessL.get(header))

    Error(
      headerFields.get(HeaderErrorType.code).map(_.asString).getOrElse(throw new Exception("Error missing Error")),
      headerFields.get(HeaderInterfaceType.code).flatMap(_.asString.toInterfaceName.toOption),
      headerFields.get(HeaderReplySerialType.code).map(_.asInt).getOrElse(throw new Exception("Error missing Serial")),
      headerFields.get(HeaderSenderType.code).flatMap(_.asString.toBusName.toOption),
      headerFields.get(HeaderDestinationType.code).flatMap(_.asString.toBusName.toOption),
      headerFields.get(HeaderSignatureType.code).map(_.asSignature).flatMap(s => unmarshal(s, bodyBits, o).toOption).getOrElse(Vector.empty[Field])
    )
  }

  def decodeSignal(header: Vector[Field], headerFields: Map[Byte, Field], bodyBits: BitVector): DBusMessage = {
    val flags = headerFlagsL.get(header)
    val o = endiannessToByteOrdering(headerEndiannessL.get(header))

    Signal(
      headerFields.get(HeaderPathType.code).map(_.asObjectPath).getOrElse(throw new Exception("Signal missing Path")),
      headerFields.get(HeaderMemberType.code).flatMap(_.asString.toMemberName.toOption).getOrElse(throw new Exception("Signal missing Member")),
      headerFields.get(HeaderInterfaceType.code).flatMap(_.asString.toInterfaceName.toOption),
      headerSerialL.get(header),
      headerFields.get(HeaderSenderType.code).flatMap(_.asString.toBusName.toOption),
      headerFields.get(HeaderDestinationType.code).flatMap(_.asString.toBusName.toOption),
      headerFields.get(HeaderSignatureType.code).map(_.asSignature).map(s => unmarshal(s, bodyBits, o).fold(throw _, identity)).getOrElse(Vector.empty[Field])
    )
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
