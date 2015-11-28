package dbus

import scalaz._,Scalaz._
import DBus._

trait Introspect {
  case class DBusInterface() extends scala.annotation.StaticAnnotation

  sealed trait ArgDirection
  case object ArgIn  extends ArgDirection { override def toString = "in" }
  case object ArgOut extends ArgDirection { override def toString = "out"}

  sealed trait PropAccess
  case object PropRead      extends PropAccess { override def toString = "read" }
  case object PropWrite     extends PropAccess { override def toString = "write" }
  case object PropReadWrite extends PropAccess { override def toString = "readwrite" }

  case class Object(path: ObjectPath, interfaces: List[Interface]) {
    def toXML = s"""${interfaces map { _.toXML }}"""
  }

  case class Interface(name: InterfaceName, methods: List[Method], signals: List[Sig], properties: List[Property]) {
    def toXML = s"""<interface name="${name.name}">${methods.map(_.toXML).mkString("\n", "\n", "")}${signals.map(_.toXML).mkString("\n", "\n", "")}${properties.map(_.toXML).mkString("\n", "\n", "")}</interface>"""
  }

  case class Method(name: MemberName, args: List[MethodArg]) {
    def toXML = s"""  <method name="${name.name}">${args.map(_.toXML).mkString("\n", "\n", "\n")}  </method>"""
  }

  case class MethodArg(name: String, argType: Type, direction: ArgDirection) {
    def toXML = s"""    <arg name="${name}" type="${argType.code}" direction="$direction"/>"""
  }

  case class Property(name: String, propType: Type, access: PropAccess) {
    def toXML: String = s"""  <property name="$name" type="${propType.code}" access="$access"/>"""
  }

  case class Sig(name: MemberName, args: List[SigArg]) {
    def toXML: String = s"""  <signal name="${name.name}">${args.map(_.toXML).mkString("\n", "\n", "\n")}  </signal>"""
  }

  case class SigArg(name: String, argType: Type) {
    def toXML = s"""    <arg name="${name}" type="${argType.code}"/>"""
  }
}

object IntrospectHierarchy {
  type IntrospectTree = Tree[Node]
  type IntrospectionData = String

  sealed trait Node { val name: String }
  case class PathNode(name: String) extends Node
  case class ObjectNode(data: IntrospectionData) extends Node { val name = ""}

  val Empty: IntrospectTree = Tree.leaf(PathNode(""))

  implicit val nodeShow = new Show[Node] {
    override def show(node: Node) =
      node match {
        case PathNode(n) => s"""<node name="$n"/>"""
        case ObjectNode(d) => s"""$d"""
      }
  }

  def findLoc(loc: Option[TreeLoc[Node]], p: List[String]): Option[TreeLoc[Node]] =
    (loc, p) match {
      case (None, _)          => None
      case (_, Nil)           => loc
      case (Some(l), p :: ps) => findLoc(l.findChild(_.rootLabel.name == p), ps)
    }

  def lookupNode(nodeTree: Tree[Node], objectPath: ObjectPath): Option[List[Node]] = {
    val ps = objectPath.path.split("/").toList.drop(1)
    findLoc(Some(nodeTree.loc), ps) map ( _.tree.subForest.map(_.rootLabel).toList)
  }

  def addObject(nodeTree: Tree[Node], objectPath: ObjectPath, data: String): Tree[Node] = {
    def helper(loc: Option[TreeLoc[Node]], p: List[String]): Tree[Node] =
      (loc, p) match {
        case (None, _)          => nodeTree
        case (Some(l), Nil)     => l.insertDownFirst(Tree.leaf(ObjectNode(data))).toTree
        case (Some(l), p :: ps) =>
          l.findChild(_.rootLabel.name == p) match {
            case None        => helper(Some(l.insertDownFirst(Tree.leaf(PathNode(p)))), ps)
            case c @ Some(_) => helper(c, ps)
          }
      }

    val ps = objectPath.path.split("/").toList.drop(1)
    helper(some(nodeTree.loc), ps)
  }

  def removeObject(nodeTree: Tree[Node], objectPath: ObjectPath): Tree[Node] = {
    def removeLoc(loc: Option[TreeLoc[Node]]): Tree[Node] =
      loc match {
        case None                      => nodeTree
        case Some(l) if !l.hasChildren => removeLoc(l.delete)
        case Some(l)                   => l.toTree
      }

    val ps = objectPath.path.split("/").toList.drop(1)
    val loc = findLoc(Some(nodeTree.loc), ps)
    loc match {
      case None => nodeTree
      case Some(l) => removeLoc(l.findChild(_.rootLabel.name == ""))
    }
  }

  val t: Tree[Node] =
    Tree.node(PathNode(""),
         Stream(Tree.leaf(ObjectNode("""<interface name="org.fubar.TopLevel"></interface""")), Tree.node(PathNode("org"),
          Stream(Tree.node(PathNode("pulseaudio"),
            Stream(Tree.node(PathNode("server_lookup1"), Stream(Tree.leaf(ObjectNode("<interface></interface>")))),
              Tree.node(PathNode("fubar"), Stream(Tree.node(PathNode("rabuf"), Stream(Tree.leaf(ObjectNode("<interface></interface>")))))))),
            Tree.node(PathNode("freedesktop"),
              Stream(Tree.node(PathNode("ReserveDevice1"),
                Stream(
                  Tree.node(PathNode("Audio0"), Stream(Tree.leaf(ObjectNode("<interface></interface>")))),
                  Tree.node(PathNode("Audio1"), Stream(Tree.leaf(ObjectNode("<interface></interface>")))),
                  Tree.node(PathNode("Audio2"), Stream(Tree.leaf(ObjectNode("<interface></interface>")))))))
            )
          )
        ))
      )
 }
