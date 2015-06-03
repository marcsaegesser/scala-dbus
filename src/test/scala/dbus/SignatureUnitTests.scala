package dbus

import org.scalatest._

class SignatureUnitTests extends WordSpec with ShouldMatchers {
  import DBus._

  "DBus" should {
    "parse valid basic signatures" in {
      "nib".toSignature_.toString should equal ("nib")
      "iii".toSignature_.toString should equal ("iii")
      "byqutnixdhsgo".toSignature_.toString should equal("byqutnixdhsgo")
      "".padTo(255, 'i').toSignatureO should be ('defined)
    }

    "not parse invalid basic signatures" in {
      "".padTo(256, 'i').toSignatureO should not be ('defined)
    }

    "parse valid array signatures" in {
      "ai".toSignature_.toString should equal ("ai")
      "aiai".toSignature_.toString should equal("aiai")
      "aav".toSignature_.toString should equal("aav")
    }

    "parse structure signatures" in {
      "(is)".toSignature_.toString should equal("(is)")
      "a(is)".toSignature_.toString should equal("a(is)")
      "(is(xxd))".toSignature_.toString should equal("(is(xxd))")
    }

    "not parse invalid structure signatures" in {
      "(iiss))".toSignatureO should not be ('defined)
    }
  }
}
