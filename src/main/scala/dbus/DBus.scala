package dbus

trait DBus
    extends dbus.Types
    with dbus.Fields
    with dbus.Marshal

object DBus extends DBus
