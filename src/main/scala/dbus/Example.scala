package org.saegesser

import scala.util.control.NonFatal
import com.typesafe.scalalogging._

import dbus._,DBus._

@DBusInterface
trait Echo {
  def echo(msg: String): String
}

class Example extends Echo with StrictLogging {
  def echo(msg: String): String = {
    logger.debug(s"echo:  IN - msg=$msg")
    s"Echo:  $msg"
  }
}

class ExportedExample(underlying: Example) extends ExportedObject with StrictLogging {
  def interfaces = List(Interface("org.saegesser.Example", List(Method("echo", List(MethodArg("msg", TypeString, ArgIn)))), List(), List()))

  def invoke(method: MemberName, args: Vector[Field]): Reply =
    method match {
      case MemberName("echo") => invoke_echo(args)
      case _                  => ReplyError("org.freedesktop.dbus.Error", Vector(FieldString(s"Unknown method $method")))
    }

  def invoke_echo(args: Vector[Field]): Reply = {
    try {
      val result = underlying.echo(args(0).asString)
      ReplyReturn(Vector(FieldString(result)))
    } catch {
      case NonFatal(t) => ReplyError(t.getClass.toString, Vector(FieldString(t.getMessage)))
    }
  }
}
