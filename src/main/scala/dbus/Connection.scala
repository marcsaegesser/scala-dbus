package dbus

import java.util.concurrent.atomic.AtomicInteger
import com.typesafe.scalalogging._
import atto._,Atto._
import scala.concurrent._
import scala.concurrent.stm._
import scala.concurrent.duration._
import scala.util.control.NonFatal
import scalaz._,Scalaz._
import DBus._

case class SignalMatchSpec(
  sender: Option[BusName] = None,
  destination: Option[BusName] = None,
  path: Option[ObjectPath] = None,
  interface: Option[InterfaceName] = None,
  member: Option[MemberName] = None) {

  def format(typ: String): String = {
    List(
      List(s"type='$typ'"),
      sender.toList.map(s => s"sender='${s.name}'"),
      destination.toList.map(d => s"destination='${d.name}'"),
      path.toList.map(p => s"path='${p.path}'"),
      interface.toList.map(i => s"interface='${i.name}'"),
      member.toList.map(m => s"member='${m.name}'")
    ).flatten.mkString(",")
  }

  def matchesSignal(signal: Signal): Boolean =
    List(
      sender.map(s => signal.sender == s).getOrElse(true),
      destination.map(d => signal.destination == d).getOrElse(true),
      path.map(p => signal.path == p).getOrElse(true),
      interface.map(i => signal.interface == i).getOrElse(true),
      member.map(m => signal.member == m).getOrElse(true)
    ).reduce( _ && _ )
}

sealed trait Connection extends StrictLogging {
  type SignalHandler

  import Connection._

  val transport: Transport

  def disconnect(): Unit

  def subscribe(matcher: SignalMatchSpec, cb: Signal => Unit): Throwable \/ SignalHandler

  def unsubscribe(handler: SignalHandler): Throwable \/ Unit

  def call(path: ObjectPath, member: MemberName, dest: BusName, body: Vector[Field]/* = Vector.empty[Field]*/): Throwable \/ Vector[Field]

  def call(path: ObjectPath, interface: InterfaceName, member: MemberName, dest: BusName, body: Vector[Field] = Vector.empty[Field]): Throwable \/ Vector[Field]

  def call(path: ObjectPath, member: MemberName, interface: Option[InterfaceName], dest: Option[BusName], autoStart: Boolean, body: Vector[Field]/* = Vector.empty[Field]*/): Throwable \/ Vector[Field]

  def call(method: MethodCall): Throwable \/ Vector[Field]

  def callNoReply(method: MethodCall): Unit

  protected def authenticate(): Throwable \/ Boolean

  protected def startReadLoop(): Unit

  protected def onMessage(msg: DBusMessage): Unit
}

object Connection extends StrictLogging {
  val DBusName = "org.freedesktop.DBus".toBusName_
  val DBusPath = "/org/freedesktop/DBus".toObjectPath_
  val DBusInterface = "org.freedesktop.DBus".toInterfaceName_

  def parseAddresses(addresses: String): Throwable \/ NonEmptyList[BusAddress] =
    busAddrsP.parseOnly(addresses).either.leftMap(es => new Exception(s"Error parsing BusAddress: $es"))


  def connect(busType: BusType): Throwable \/ Connection =
    for {
      c <- busType match {
        case SessionBus => connectSession()
        case SystemBus  => ???
      }
      _ <- c.authenticate()
      _ = c.startReadLoop()
      _ = c.call(DBusPath, DBusInterface, "Hello", DBusName)
    } yield c

  def connect_(busType: BusType): Connection =
    connect(busType) fold (throw _, identity)

  private def connectSession(): Throwable \/ Connection = {
    val env = System.getenv()
    for {
      as <- parseAddresses(env.get("DBUS_SESSION_BUS_ADDRESS"))
      t <- Transport.connect(as)
    } yield new ConnectionImpl(t)

  }

  case class BusAddress(transportType: String, parameters: Map[String, String])

  def notSep(c: Char) = c != ',' && c != '=' && c != ';'
  val notSepP = elem(notSep)
  val transportTypeP = choice(string("unix"), string("tcp"))
  val keyP = stringOf1(notSepP)
  val valueP = stringOf1(notSepP)
  val kvpP = pairBy(keyP, Atto.char('='), valueP)
  val kvpsP = sepBy1(kvpP, Atto.char(',')).map(_.toList.toMap)
  val busAddrP = (transportTypeP <~ Atto.char(':') |@| kvpsP)(BusAddress.apply)
  val busAddrsP = sepBy1(busAddrP, Atto.char(';'))

}

class ConnectionImpl(val transport: Transport) extends Connection {
  case class Handler(spec: SignalMatchSpec, cb: Signal => Unit)
  type SignalHandler = Handler

  import Connection._
  val serialNumber = new AtomicInteger(1)

  val outstandingCalls = Ref(Map.empty[Int, Promise[Vector[Field]]]).single
  val subscriptions = Ref(List.empty[Handler]).single


  def disconnect(): Unit = transport.disconnect()

  def subscribe(spec: SignalMatchSpec, cb: Signal => Unit): Throwable \/ SignalHandler = {
    for {
      h <- Handler(spec, cb).right
      _ = subscriptions transform { h :: _}
      _ <- call(DBusPath, DBusInterface, "AddMatch", DBusName, Vector(FieldString(spec.format("signal"))))
    } yield h
  }

  def unsubscribe(handler: SignalHandler): Throwable \/ Unit =
    for {
      _ <- subscriptions.transform(_.filterNot(_ == handler)).right
      _ <- call(DBusPath, DBusInterface, "RemoveMatch", DBusName, Vector(FieldString(handler.spec.format("signal"))))
    } yield ()

  def call(path: ObjectPath, member: MemberName, dest: BusName, body: Vector[Field]/* = Vector.empty[Field]*/): Throwable \/ Vector[Field] =
    call(MethodCall(path, None, member, None, dest.some, true, false, body))

  def call(path: ObjectPath, interface: InterfaceName, member: MemberName, dest: BusName, body: Vector[Field] = Vector.empty[Field]): Throwable \/ Vector[Field] =
    call(MethodCall(path, interface.some, member, None, dest.some, true, false, body))

  def call(path: ObjectPath, member: MemberName, interface: Option[InterfaceName], dest: Option[BusName], autoStart: Boolean, body: Vector[Field]/* = Vector.empty[Field]*/): Throwable \/ Vector[Field] =
    call(MethodCall(path, interface, member, None, dest, true, !autoStart, body))

  def call(method: MethodCall): Throwable \/ Vector[Field] =
    for {
      s <- serialNumber.getAndIncrement().right
      p <- (Promise[Vector[Field]]).right
      _ = outstandingCalls transform { _ + ((s, p)) }
      _ = logger.trace(s"call: s=$s, method=$method")
      b <- DBusMessageCodec.encode(method, s)
      _ <- transport.send(b)
      r <- awaitOrThrowable(p.future, 5.seconds)
    } yield r

  def callNoReply(method: MethodCall): Unit = {
    val _ =
      for {
        s <- serialNumber.getAndIncrement().right
        b <- DBusMessageCodec.encode(method.copy(replyExpected = false), s)
        _ <- transport.send(b)
      } yield ()
  }

  private def awaitOrThrowable[T](f: Future[T], atMost: Duration): Throwable \/ T =
    \/.fromTryCatchNonFatal {
      Await.result(f, atMost)
    }

  private def getErrorMessage(v: Vector[Field]): String =
    try {
      v(0).asString
    } catch {
      case NonFatal(t) => "Unspecified error"
    }

  protected def authenticate(): Throwable \/ Boolean =
    transport.auth()

  protected def startReadLoop(): Unit =
    transport.startReadLoop(onMessage)

  protected def onMessage(msg: DBusMessage): Unit = {
    logger.debug(s"onMessage:  msg=$msg")
    val _ =
      msg match {
        case MethodCall(_, _, _, _, _, _, _, b) =>
          logger.debug(s"MethodCall not supported yet.")
        case MethodReturn(replySerial, _, _, b) =>
          for {
            p <- outstandingCalls().get(replySerial)
            _ = p.success(b)
            _ = outstandingCalls.transform(_ - replySerial)
          } yield ()
        case Error(error, _, replySerial, _, _, b) =>
          for {
            p <- outstandingCalls().get(replySerial)
            _ = p.failure(new Exception(s"$error - ${getErrorMessage(b)}"))
            _ = outstandingCalls.transform(_ - replySerial)
          } yield ()
        case s @ Signal(_, _, _, _, _, _, _) =>
          subscriptions().filter(_.spec.matchesSignal(s)) foreach { h => h.cb(s) }
      }
  }
}
