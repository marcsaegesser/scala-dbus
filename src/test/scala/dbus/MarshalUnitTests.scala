package dbus

import scalaz._,Scalaz._
import scodec.bits.{ ByteOrdering }
import org.scalatest._

class MarshalUnitTests extends WordSpec with ShouldMatchers {
  import DBus._

  def roundTrip(m: Vector[Field]) = {
    val bits = marshal_(m)
    val s = messageSignature(m).getOrElse(throw new Exception("Invalid signature"))
    unmarshal_(s, bits) should equal(m)
    val bitsL = marshal_(m, ByteOrdering.LittleEndian)
    val sL = messageSignature(m).getOrElse(throw new Exception("Invalid signature"))
    unmarshal_(sL, bitsL, ByteOrdering.LittleEndian) should equal(m)
  }

  "DBus" should {
    "roundtrip simple messages" in {
      roundTrip(Vector(FieldString("abc"), FieldInt32(1), FieldInt32(2), FieldInt64(999L)))
      roundTrip(Vector(FieldString("abc"), FieldInt32(1), FieldWord8(2), FieldUnixFD(0)))
      roundTrip(Vector(FieldSignature("ais".toSignature_), FieldInt32(1), FieldWord8(2), FieldUnixFD(0)))
      roundTrip(Vector(FieldObjectPath("/com/fubar".toObjectPath_), FieldInt32(1), FieldWord8(2), FieldUnixFD(0)))
    }

    "roundtrip array messages" in {
      roundTrip(Vector(FieldInt64(999L), FieldArray(TypeInt16, Vector(FieldInt16(1), FieldInt16(2), FieldInt16(3))), FieldSignature("ais".toSignature_)))
      roundTrip(Vector(FieldString("asdfgh"), FieldArray(TypeInt64, Vector(FieldInt64(123L), FieldInt64(1234L), FieldInt64(12345L))), FieldObjectPath("/com/fubar/fu".toObjectPath_)))
      roundTrip(Vector(FieldArray(TypeArray(TypeInt32), Vector(FieldArray(TypeInt32, Vector(FieldInt32(1), FieldInt32(2), FieldInt32(3))),FieldArray(TypeInt32, Vector(FieldInt32(4), FieldInt32(5), FieldInt32(6)))))))
    }

    "roundtrip structure messages" in {
      roundTrip(Vector(FieldString("abcde"), FieldStructure("ais".toSignature_, Vector(FieldArray(TypeInt32, Vector(FieldInt32(100), FieldInt32(101), FieldInt32(102))), FieldString("fubar")))))
      roundTrip(Vector(FieldArray(TypeString, Vector(FieldString("asdf"), FieldString("fdsa"), FieldString("asdfasf"))), FieldStructure("ais".toSignature_, Vector(FieldArray(TypeInt32, Vector(FieldInt32(100), FieldInt32(101), FieldInt32(102))), FieldString("fubar")))))
      roundTrip(Vector(FieldStructure("i(ys)".toSignature_, Vector(FieldInt32(2), FieldStructure("ys".toSignature_, Vector(FieldWord8(1), FieldString("fubar")))))))
    }

    "roundtrip variant messages" in {
      roundTrip(Vector(FieldVariant(FieldInt32(123))))
      roundTrip(Vector(FieldVariant(FieldStructure("is".toSignature_, Vector(FieldInt32(1), FieldString("asdf"))))))
    }

    "roundtrip dictionary messages" in {
      roundTrip(Vector(FieldDictionary(TypeDictionary(TypeInt32, TypeString), Vector((FieldInt32(1), FieldString("1")), (FieldInt32(2), FieldString("2"))))))
    }
  }
}
