package dbus

trait DBus
    extends dbus.Types
    with dbus.Fields
    with dbus.Marshal
    with dbus.Message
    with dbus.Introspect {
  sealed trait BusType
  case object SystemBus extends BusType
  case object SessionBus extends BusType
}

object DBus extends DBus
