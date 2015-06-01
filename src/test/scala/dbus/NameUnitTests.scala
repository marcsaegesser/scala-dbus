package dbus

import org.scalatest._

class NameUnitTests extends WordSpec with ShouldMatchers {
  import DBus._

  "DBus" should {
    "parse valid ObjectPaths" in {
      "/".toObjectPathO should be ('defined)
      "/com".toObjectPathO should be ('defined)
      "/com/fubar".toObjectPathO should be ('defined)
      "/com/fubar2".toObjectPathO should be ('defined)
      "/com/2fubar".toObjectPathO should be ('defined)
      "/com/_fubar".toObjectPathO should be ('defined)
      "/com/fu_bar".toObjectPathO should be ('defined)
    }

    "not parse invalid ObjectPaths" in {
      "".toObjectPathO should not be ('defined)
      "//".toObjectPathO should not be ('defined)
      "/com/fu-bar".toObjectPathO should not be ('defined)
      "/com/fubar/".toObjectPathO should not be ('defined)
    }

    "parse valid InterfaceNames" in {
      "com.fubar".toInterfaceNameO should be ('defined)
      "com.fubar2".toInterfaceNameO should be ('defined)
      "com.fuBar2".toInterfaceNameO should be ('defined)
      "com.fu_bar".toInterfaceNameO should be ('defined)
      "com._fubar".toInterfaceNameO should be ('defined)
    }

    "not parse invalid InterfaceNames" in {
      "".toInterfaceNameO should not be ('defined)
      "com".toInterfaceNameO should not be ('defined)
      "com.2fubar".toInterfaceNameO should not be ('defined)
      "com.fu-bar".toInterfaceNameO should not be ('defined)
      "com.fu:bar".toInterfaceNameO should not be ('defined)
    }

    "parse valid MethodNames" in {
      "method".toMemberNameO should be ('defined)
      "method123".toMemberNameO should be ('defined)
      "METHOD".toMemberNameO should be ('defined)
      "method_".toMemberNameO should be ('defined)
      "method_fubar".toMemberNameO should be ('defined)
      "_method".toMemberNameO should be ('defined)
    }

    "not parse invalid MemberNames" in {
      "".toMemberNameO should not be ('defined)
      "method.abc".toMemberNameO should not be ('defined)
      "123method".toMemberNameO should not be ('defined)
    }

    "parse valid BusNames" in {
      "com.fubar".toBusNameO should be ('defined)
      "com.fubar2".toBusNameO should be ('defined)
      "com.fu_bar".toBusNameO should be ('defined)
      "com.fu-bar".toBusNameO should be ('defined)
      "com._fu-bar".toBusNameO should be ('defined)
      ":1.0".toBusNameO should be ('defined)
      ":1.0.0".toBusNameO should be ('defined)
      ":0f.0".toBusNameO should be ('defined)
      ":fubar.0.0".toBusNameO should be ('defined)
      ":1.fubar".toBusNameO should be ('defined)
    }

    "not parse invalid BusNames" in {
      "".toBusNameO should not be ('defined)
      "com".toBusNameO should not be ('defined)
      "com.1fubar".toBusNameO should not be ('defined)
      ":1".toBusNameO should not be ('defined)
    }
  }
}
