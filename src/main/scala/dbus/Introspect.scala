package dbus

import DBus._

trait Introspect {
  sealed trait ArgDirection
  case object ArgIn extends ArgDirection
  case object ArgOut extends ArgDirection

  case class Object(path: ObjectPath, interfaces: List[Interface], children: List[Object])

  case class Interface(name: InterfaceName, methods: List[Method], signals: List[Sig], properties: List[Property])

  case class Method(name: MemberName, args: List[MethodArg])

  case class MethodArg(name: String, argType: Type, direction: ArgDirection)

  case class Property(name: String, propType: Type, isRead: Boolean, isWrite: Boolean)

  case class Sig(name: MemberName, args: List[SigArg])

  case class SigArg(name: String, argType: Type)

  trait Introspectable {
    def introspect(): String
  }

  // trait Object {
  //   def path: ObjectPath
  //   def interfaces: List[Interface]
  //   def children: List[Object]
  // }

  // trait Interface{
  //   def name: InterfaceName
  //   def methods: List[Method]
  //   def signals: List[Sig]
  //   def properties: List[Property]
  // }

  // trait Method{
  //   def name: MemberName
  //   def args: List[MethodArg]
  // }

  // trait MethodArg{
  //   def name: String
  //   def argType: Type
  //   def direction: ArgDirection
  // }

  // trait Property{
  //   def name: String
  //   def propType: Type
  //   def isRead: Boolean
  //   def isWrite: Boolean
  // }

  // trait Sig{
  //   def name: MemberName
  //   def args: List[SigArg]
  // }

  // trait SigArg {
  //   def name: String
  //   def argType: Type
  // }

  // trait Introspectable {
  //   def introspect(): String
  // }
}
