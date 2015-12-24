package dbus

import scalaz._,Scalaz._
import org.scalacheck._
import org.scalacheck.Arbitrary._
import org.scalacheck.Prop._
import dbus._

object DBusCodecSpecification extends Properties("DBusCodec") {
  import Gen._
  import DBus._

  case class TestExample(i: Int, s: String)
  implicit def TestExampleCodec = DBusCodec.derive[TestExample]

  val genAtomic = oneOf("b", "y", "q", "u", "t", "n", "i", "x", "d", "h", "s", "g", "o")
  val genSig = nonEmptyListOf(genAtomic) suchThat (_.length <= 255) map (_.mkString.toSignature_)
  implicit def arbSig: Arbitrary[Signature] = Arbitrary { genSig }

  val alphaNumStr = nonEmptyListOf(alphaNumChar) map (_.mkString)
  val genObjectPath = listOf(alphaNumStr) map (_.mkString("/", "/", "").toObjectPath_)
  implicit val arbObjPath: Arbitrary[ObjectPath] = Arbitrary { genObjectPath }

  def roundTrip[A: Arbitrary](implicit codec: DBusCodec[A]) =
    forAll { a: A => codec.decode(codec.encode(a)) == a }

  property("roundTrip Boolean") = roundTrip[Boolean]
  property("roundTrip Byte") = roundTrip[Byte]
  property("roundTrip Short") = roundTrip[Short]
  property("roundTrip Int") = roundTrip[Int]
  property("roundTrip Long") = roundTrip[Long]
  property("roundTrip Double") = roundTrip[Double]
  property("roundTrip String") = roundTrip[String]
  property("roundTrip Signature") = roundTrip[Signature]
  property("roundTrip ObjectPath") = roundTrip[ObjectPath]
}

// object Asdf {
//   import DBus._
//   case class TestExample(i: Int, s: String)
//   implicit def TestExampleCodec = DBusCodec.derive[TestExample]
// }
