package dbus

import scalaz._,Scalaz._
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
