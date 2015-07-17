package dbus

import scala.util.control.NonFatal
import scalaz._,Scalaz._

trait Message {
  import DBus._
  import FieldOps._

  sealed trait MessageType { val code: Byte }
  case object InvalidType      extends MessageType { val code = 0.toByte }
  case object MethodCallType   extends MessageType { val code = 1.toByte }
  case object MethodReturnType extends MessageType { val code = 2.toByte }
  case object ErrorType        extends MessageType { val code = 3.toByte }
  case object SignalType       extends MessageType { val code = 4.toByte }

  sealed trait MessageFlag { val flag: Byte }
  case object NoReplyExpected      extends MessageFlag { val flag = 0x01.toByte }
  case object NoAutoStart          extends MessageFlag { val flag = 0x02.toByte }
  case object AllowInteractiveAuth extends MessageFlag { val flag = 0x04.toByte }

  sealed trait HeaderType { val code: Byte }
  case object HeaderPathType        extends HeaderType { val code = 1.toByte }
  case object HeaderInterfaceType   extends HeaderType { val code = 2.toByte }
  case object HeaderMemberType      extends HeaderType { val code = 3.toByte }
  case object HeaderErrorType       extends HeaderType { val code = 4.toByte }
  case object HeaderReplySerialType extends HeaderType { val code = 5.toByte }
  case object HeaderDestinationType extends HeaderType { val code = 6.toByte }
  case object HeaderSenderType      extends HeaderType { val code = 7.toByte }
  case object HeaderSignatureType   extends HeaderType { val code = 8.toByte }
  case object HeaderUnixFDsType     extends HeaderType { val code = 9.toByte }

  sealed trait MessageHeader extends Product with Serializable {
    val code: Byte
    val f: Field
    def toField = new FieldStructure("yv".toSignature_, Vector(code.toField, f))
  }
  case class HeaderPath(path: ObjectPath)              extends MessageHeader { val code: Byte = 1; val f: Field = FieldVariant(path) }
  case class HeaderInterface(interface: InterfaceName) extends MessageHeader { val code: Byte = 2; val f: Field = FieldVariant(interface.name)}
  case class HeaderMember(member: MemberName)          extends MessageHeader { val code: Byte = 3; val f: Field = FieldVariant(member.name)}
  case class HeaderError(error: String)                extends MessageHeader { val code: Byte = 4; val f: Field = FieldVariant(error)}
  case class HeaderReplySerial(serial: Int)            extends MessageHeader { val code: Byte = 5; val f: Field = FieldVariant(serial)}
  case class HeaderDestination(destination: BusName)   extends MessageHeader { val code: Byte = 6; val f: Field = FieldVariant(destination.name)}
  case class HeaderSender(sender: BusName)             extends MessageHeader { val code: Byte = 7; val f: Field = FieldVariant(sender.name)}
  case class HeaderSignature(signature: Signature)     extends MessageHeader { val code: Byte = 8; val f: Field = FieldVariant(signature)}
  case class HeaderUnixFDs(numFDs: Int)                extends MessageHeader { val code: Byte = 9; val f: Field = FieldVariant(numFDs)}


  trait DBusMessage{val msgType: MessageType; val flags: List[MessageFlag]; val headers: List[MessageHeader]; val body: Vector[Field]}

  case class MethodCall(
    path: ObjectPath,
    interface: Option[InterfaceName],
    member: MemberName,
    sender: Option[BusName],
    destination: Option[BusName],
    replyExpected: Boolean,
    autoStart: Boolean,
    body: Vector[Field]
  ) extends DBusMessage {
    val msgType = MethodCallType
    val flags = List(if(replyExpected) none else NoReplyExpected.some, if(autoStart) none else NoAutoStart.some) filter (_.isDefined) map (_.get)
    val headers = List(HeaderPath(path).some, HeaderMember(member).some, messageSignature(body).toOption map (HeaderSignature(_)), interface map (HeaderInterface(_)), sender map (HeaderSender(_)), destination map (HeaderDestination(_))) filter (_.isDefined) map (_.get)
  }

  case class MethodReturn(
    replySerial: Int,
    sender: Option[BusName],
    destination: Option[BusName],
    body: Vector[Field]
  ) extends DBusMessage {
    val msgType = MethodReturnType
    val flags = List()
    val headers = List(HeaderReplySerial(replySerial).some, sender map (HeaderSender(_)), destination map (HeaderDestination(_))) filter (_.isDefined) map (_.get)
  }

  case class Error(
    error: String,
    interface: Option[InterfaceName],
    replySerial: Int,
    sender: Option[BusName],
    destination: Option[BusName],
    body: Vector[Field]
  ) extends DBusMessage {
    val msgType = ErrorType
    val flags = List()
    val headers = List(HeaderError(error).some, HeaderReplySerial(replySerial).some, sender map (HeaderSender(_)), interface map (HeaderInterface(_)), destination map (HeaderDestination(_))) filter (_.isDefined) map (_.get)
  }

  case class Signal(
    path: ObjectPath,
    member: MemberName,
    interface: Option[InterfaceName],
    serial: Int,
    sender: Option[BusName],
    destination: Option[BusName],
    body: Vector[Field]
  ) extends DBusMessage {
    val msgType = ErrorType
    val flags = List()
    val headers = List(HeaderPath(path).some, HeaderMember(member).some, interface map (HeaderInterface(_)), sender map (HeaderSender(_)), destination map (HeaderDestination(_))) filter (_.isDefined) map (_.get)
  }
}
