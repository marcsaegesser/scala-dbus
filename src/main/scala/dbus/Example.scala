package dbus

import scala.util.control.NonFatal
import com.typesafe.scalalogging._

import DBus._

class Example extends StrictLogging {
  def echo(msg: String): String = {
    logger.debug(s"echo:  IN - msg=$msg")
    s"Echo:  $msg"
  }
}

class ExportedExample(underlying: Example) extends ExportedObject with StrictLogging {
  def methods = List("echo")
  // def interfaces: List[Interface] = List (
  //   new Interface("org.saegesser.example", List(Method("echo", List("msg", TypeString, ArgIn))), List.empty[Sig], List.empty[Property])
  // )
  val docHeader = """<!DOCTYPE node PUBLIC "-//freedesktop//DTD D-BUS Object Introspection 1.0//EN"
         "http://www.freedesktop.org/standards/dbus/1.0/introspect.dtd">"""
  val introspectData = """
        <node name="/org/saegesser/echo">
          <interface name="org.saegesser.Example">
            <method name="echo">
              <arg name="msg" type="s" direction="in"/>
              <arg name="result" type="s" direction="out"/>
            </method>
          </interface>
          <interface name="org.freedesktop.DBus.Introspectable.Introspect">
             <method name="introspect">
               <arg name="xml_data" type="s" direction="out"/>
             </method>
          </interface>
       </node>
"""
  def introspect() = ReplyReturn(Vector(FieldString(docHeader + "\n" + introspectData)))

  def invoke(method: MemberName, args: Vector[Field]): Reply =
    method match {
      case MemberName("echo")       => invoke_echo(args)
      case MemberName("introspect") => introspect()
      case _                        => ReplyError("org.freedesktop.dbus.Error", Vector(FieldString(s"Unknown method $method")))
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
