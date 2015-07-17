package dbus

import scalaz._,Scalaz._
import org.scalatest._

class ConnectionUnitTests extends WordSpec with ShouldMatchers {
  import DBus._
  import Connection._

  "SignalMatchSpec" should {
    "generated a formatted string" in {
      SignalMatchSpec().format("signal") should equal("type='signal'")
      SignalMatchSpec(path="/path/to/object".toObjectPath_.some).format("signal") should equal("type='signal',path='/path/to/object'")
      SignalMatchSpec(sender="org.sender.Name".toBusName_.some, path="/path/to/object".toObjectPath_.some).format("signal") should equal("type='signal',sender='org.sender.Name',path='/path/to/object'")
    }

    "match signals" in {
      val m1 = SignalMatchSpec()
      val m2 = SignalMatchSpec(path="/path/to/object".toObjectPath_.some)
      val m3 = SignalMatchSpec(sender="org.sender.Name".toBusName_.some, path="/path/to/object".toObjectPath_.some)

      val s1 = Signal("/path/to/object".toObjectPath_, "member", None, 1, "org.fubar.Fubar".toBusName_.some, None, Vector.empty[Field])
      val s2 = Signal("/path/to/object2".toObjectPath_, "member", None, 1, "org.fubar.Fubar".toBusName_.some, None, Vector.empty[Field])

      m1.matchesSignal(s1) should be (true)
      m1.matchesSignal(s2) should be (true)
      m2.matchesSignal(s1) should be (true)
      m2.matchesSignal(s2) should be (false)
    }
  }

}
