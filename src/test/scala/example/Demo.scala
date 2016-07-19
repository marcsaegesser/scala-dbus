package example

import scala.io.StdIn
import scalaz._,Scalaz._
import dbus._,DBus._


object Demo extends App {
  val c = Connection.connect_(SessionBus)
  c.requestName("example.echo", List())
  implicit def exportEcho = ExportedObject.derive[Echo]
  val echo = new Example()

  c.export("/example/echo", echo)

  val _ = StdIn.readLine("Press enter to exit...")

  c.disconnect()
}
