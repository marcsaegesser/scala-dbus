package org.saegesser

import scala.util.control.NonFatal
import com.typesafe.scalalogging._

import dbus._,DBus._

@DBusInterface
trait Echo {
  var prefix: String = "Echo:  "
  def echo(msg: String): String
}

class Example extends Echo with StrictLogging {
  def echo(msg: String): String = {
    logger.debug(s"echo:  IN - msg=$msg")
    s"$prefix$msg"
  }
}

@DBusInterface
trait Fubar {
  val m: Map[Int, String]
}

class AFubar extends Fubar {
  val m = Map(1 -> "One", 2 -> "Two")
}

case class Structure(i: Int, s: String)

// object Structure {
//   implicit val structureCodec = new DBusCodec[Structure] {
//     import FieldOps._
//     def encode(t: Structure): Field = {
//       val fields = Vector(implicitly[DBusCodec[Int]].encode(t.i), implicitly[DBusCodec[String]].encode(t.s))
//       FieldStructure(fields.toSignature_, fields)
//     }
//     def decode(f: Field): Structure =
//       f match {
//         case FieldStructure(s, v) => Structure(implicitly[DBusCodec[Int]].decode(v(0)), implicitly[DBusCodec[String]].decode(v(1)))
//         case _ => throw new Exception(s"Field $f is not a Structure")
//       }
//   }
// }

@DBusInterface
trait StructureTransform {
  def transform(s: Structure): Structure
}

class Transformer extends StructureTransform {
  def transform(s: Structure): Structure = Structure(s.i * 2, s.s.toUpperCase)
}

// class ExportedExample(underlying: Example) extends ExportedObject with StrictLogging {
//   def interfaces = List(Interface("org.saegesser.Example", List(Method("echo", List(MethodArg("msg", TypeString, ArgIn)))), List(), List()))

//   def invoke(method: MemberName, args: Vector[Field]): Reply =
//     method match {
//       case MemberName("echo") => invoke_echo(args)
//       case _                  => ReplyError("org.freedesktop.dbus.Error", Vector(FieldString(s"Unknown method $method")))
//     }

//   def invoke_echo(args: Vector[Field]): Reply = {
//     try {
//       val result = underlying.echo(args(0).asString)
//       ReplyReturn(Vector(FieldString(result)))
//     } catch {
//       case NonFatal(t) => ReplyError(t.getClass.toString, Vector(FieldString(t.getMessage)))
//     }
//   }
// }

// object Example {
//   implicit def ExampleExporter(underlying: Example): ExportedObject =
//     new ExportedObject with StrictLogging {
//       def interfaces = List(Interface(InterfaceName("org.saegesser.Echo"),List(Method(MemberName("echo"),List(MethodArg("msg",TypeString,ArgIn), MethodArg("",TypeString,ArgOut)))),List(),List(Property("PREFIX",TypeString,PropReadWrite))))

//       type MethodInvoker = collection.Seq[Field] => Reply
//       case class Invoker(interface: InterfaceName, invoker: MethodInvoker)
//       val invokers = Map[MemberName, List[Invoker]](
//         MemberName("echo") -> List(Invoker(InterfaceName("org.saegesser.Echo"), invoke_echo))
//       )

//       def invoke(method: MemberName, interface: Option[InterfaceName], args: collection.Seq[Field]): Reply = {
//         val is = invokers getOrElse(method, List.empty[Invoker]) filter { i => interface.isEmpty || interface.contains(i.interface) }
//         is match {
//           case h :: Nil => h.invoker(args)
//           case h :: t   => ReplyError("org.freedesktop.dbus.Error", Vector(FieldString(s"Ambiguous method $method")))
//           case Nil      => ReplyError("org.freedesktop.dbus.Error", Vector(FieldString(s"Unknown method $method")))
//         }
//       }

//       def invoke_echo(args: collection.Seq[Field]): Reply = {
//         try {
//           // val result = underlying.echo(args(0).asString)
//           // ReplyReturn(Vector(FieldString(result)))
//           val result = underlying.echo(implicitly[DBusCodec[String]].decode(args(0)))
//           ReplyReturn(Vector(implicitly[DBusCodec[String]].encode(result)))
//         } catch {
//           case NonFatal(t) => ReplyError(t.getClass.getName, Vector(FieldString(t.getMessage)))
//         }
//       }
//     }
// }
