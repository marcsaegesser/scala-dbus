package dbus

import java.io._
import scalaz._,Scalaz._
import scodec.bits.{ ByteOrdering }
import com.typesafe.scalalogging._
import org.scalatest._

class DBusMessageCodecUnitTests extends WordSpec with ShouldMatchers with StrictLogging {
  import DBus._

  "DBusMessageCodec" should {
    "roundtrip Hello method call" in {
      val hello = MethodCall("/a/b/c", Some("a.b.c.Name"), "Hello", None, Some("a.b.c"), true, false, Vector.empty[Field])
      val result =
        for {
          bits <- DBusMessageCodec.encode(hello, 1)
          in = new ByteArrayInputStream(bits.toByteArray)
          r <- MessageReader.readMessage(in)
        } yield r
      result should equal((1, hello).right)
    }

    "roundtrip MethodReturn" in {
      val methodReturn = MethodReturn(123, None, Some(BusName(":1.148")), Vector(FieldString("Echo: msg")))
      val result =
        for {
          bits <- DBusMessageCodec.encode(methodReturn, 123)
          _ = logger.debug(s"testMethodReturn: bits=${bits.toHex}")
          in = new ByteArrayInputStream(bits.toByteArray)
          r <- MessageReader.readMessage(in)
        } yield r
      result should equal((123, methodReturn).right)
    }
  }

}
