package dbus

import java.io._
import scalaz._,Scalaz._
import scodec.bits.{ ByteOrdering }
import org.scalatest._

class DBusMessageCodecUnitTests extends WordSpec with ShouldMatchers {
  import DBus._
  import Connection._

  "DBusMessageCodec" should {
    "roundtrip Hello method call" in {
      val hello = MethodCall(DBusPath, DBusInterface.some, "Hello".toMemberName_, None, DBusName.some, true, false, Vector.empty[Field])
      val result =
        for {
          bits <- DBusMessageCodec.encode(hello, 1)
          in = new ByteArrayInputStream(bits.toByteArray)
          r <- MessageReader.readMessage(in)
        } yield r
      result should equal(hello.right)
    }
  }

}
