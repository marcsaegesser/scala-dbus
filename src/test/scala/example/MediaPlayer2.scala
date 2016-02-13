package example

import scalaz._,Scalaz._
import com.typesafe.scalalogging._

import dbus._,DBus._

@DBusInterface
trait Player {
  def CanControl: Boolean
  def CanGoNext: Boolean
  def CanGoPrevious: Boolean
  def CanPause: Boolean
  def CanSeek: Boolean
  var Shuffle: Boolean
  def Metadata: Map[String, FieldVariant]

  def Next(): Unit
  def OpenURI(uri: String): Unit
  def Pause(): Unit
  def Play(): Unit
  def PlayPause(): Unit
  def Previous(): Unit
  def Seek(offset: Long): Unit
  def SetPosition(trackId: ObjectPath, position: Long): Unit
}

class PlayerProxy(connection: Connection, path: ObjectPath, dest: Option[BusName]) extends Player with StrictLogging {
  val interface: Option[InterfaceName] = Some("org.mpris.MediaPlayer2.Player")
  val propertyInterface: Option[InterfaceName] = Some("org.freedesktop.DBus.Properties")

  val CanControl: Boolean =
    connection.call(path, "Get", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("CanControl"))) match {
      case -\/(t) => throw t
      case \/-(Vector(FieldVariant(r))) => r.asBoolean
      case \/-(x) => throw new Exception(s"Unexpected response type $x")
    }

  def CanGoNext: Boolean =
    connection.call(path, "Get", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("CanGoNext"))) match {
      case -\/(t) => throw t
      case \/-(Vector(FieldVariant(r))) => r.asBoolean
      case \/-(x) => throw new Exception(s"Unexpected response type $x")
    }

  def CanGoPrevious: Boolean =
    connection.call(path, "Get", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("CanGoPrevious"))) match {
      case -\/(t) => throw t
      case \/-(Vector(FieldVariant(r))) => r.asBoolean
      case \/-(x) => throw new Exception(s"Unexpected response type $x")
    }

  def CanPause: Boolean =
    connection.call(path, "Get", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("CanPause"))) match {
      case -\/(t) => throw t
      case \/-(Vector(FieldVariant(r))) => r.asBoolean
      case \/-(x) => throw new Exception(s"Unexpected response type $x")
    }

  def CanSeek: Boolean =
    connection.call(path, "Get", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("CanSeek"))) match {
      case -\/(t) => throw t
      case \/-(Vector(FieldVariant(r))) => r.asBoolean
      case \/-(x) => throw new Exception(s"Unexpected response type $x")
    }

  def Shuffle: Boolean =
    connection.call(path, "Get", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("Shuffle"))) match {
      case -\/(t) => throw t
      case \/-(Vector(FieldVariant(r))) => r.asBoolean
      case \/-(x) => throw new Exception(s"Unexpected response type $x")
    }

  def Shuffle_=(v: Boolean) =
    connection.call(path, "Set", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("Shuffle"), FieldVariant(FieldBoolean(v)))) match {
      case -\/(t) => throw t
      case \/-(_) =>
    }

  def Metadata =
    connection.call(path, "Get", propertyInterface, dest, false, Vector(FieldString(interface.get.name), FieldString("Metadata"))) match {
      case -\/(t) => throw t
      case \/-(Vector(FieldVariant(FieldDictionary(t, v)))) =>
        v.map{
          case (k, v: FieldVariant) => (k.asString, v)
          case _ => throw new Exception(s"Unexpected result type $v")
        }.toMap
      case \/-(x) => throw new Exception(s"Unexpected response type $x")
    }

  def Next(): Unit = { val _ = connection.call(path, "Next", interface, dest, false, Vector.empty[Field]) fold (throw _, identity) }
  def OpenURI(uri: String): Unit = { val _ = connection.call(path, "OpenURI", interface, dest, false, Vector(FieldString(uri))) fold (throw _, identity) }
  def Pause(): Unit = { val _ = connection.call(path, "Pause", interface, dest, false, Vector.empty[Field]) fold (throw _, identity) }
  def Play(): Unit = { val _ = connection.call(path, "Play", interface, dest, false, Vector.empty[Field]) fold (throw _, identity) }
  def PlayPause(): Unit = { val _ = connection.call(path, "PlayPause", interface, dest, false, Vector.empty[Field]) fold (throw _, identity) }
  def Previous(): Unit = { val _ = connection.call(path, "Previous", interface, dest, false, Vector.empty[Field]) fold (throw _, identity) }
  def Seek(offset: Long): Unit = { val _ = connection.call(path, "Seek", interface, dest, false, Vector.empty[Field]) fold (throw _, identity) }
  def SetPosition(trackId: ObjectPath, position: Long): Unit = ???
}
