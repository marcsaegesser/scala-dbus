package example

import scalaz._,Scalaz._
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
trait RandomInt {
  def nextInt(): Int
}

class Rand extends RandomInt {
  def nextInt(): Int = util.Random.nextInt()
}

@DBusInterface
trait Fubar {
  val m: Map[Int, String]
}

class AFubar extends Fubar {
  val m = Map(1 -> "One", 2 -> "Two")
}

case class Structure(i: Int, s: String)

@DBusInterface
trait CreateStructure {
  def newStructure(i: Int, s: String): Structure
}

class StructureFactor extends CreateStructure {
  def newStructure(i: Int, s: String): Structure = Structure(i, s)
}

// object Structure {
//   implicit val structureCodec = new DBusCodec[Structure] {
//     import FieldOps._
//     def encode(t: Structure): String \/ Field = {
//       Vector(implicitly[DBusCodec[Int]].encode(t.i), implicitly[DBusCodec[String]].encode(t.s))
//         .sequenceU
//         .map(fs => FieldStructure(fs.toSignature_, fs))
//     }
//     def decode(f: Field): String \/ Structure =
//       f match {
//         case FieldStructure(s, v) =>
//           ((implicitly[DBusCodec[Int]].decode(v(0)).validation.toValidationNel |@|
//             implicitly[DBusCodec[String]].decode(v(1)).validation.toValidationNel)
//             { Structure.apply }).disjunction.leftMap(_.toString)
//         case _ => s"Field $f is not a Structure".left
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

//       // def liftedEcho = Applicative[\/[String,?]].lift(underlying.echo _)
//       def liftedEcho = Applicative[({type E[A] = \/[String,A]})#E].lift(underlying.echo _)

//       def invoke_echo(args: collection.Seq[Field]): Reply = {
//         try {
//           liftedEcho(implicitly[DBusCodec[String]].decode(args(0)))
//             .flatMap{ r: String => implicitly[DBusCodec[String]].encode(r) }
//             .fold (e => ReplyError("InternalError", Vector(FieldString(e))), r => ReplyReturn(Vector(r)))
//         } catch {
//           case NonFatal(t) => ReplyError(t.getClass.getName, Vector(FieldString(t.getMessage)))
//         }
//       }
//     }
// }
