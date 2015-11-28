package dbus

import scalaz._,Scalaz._
import org.scalacheck._
import org.scalacheck.Prop.forAll
import dbus._

object DBusMarshalSpecification extends Properties("Marshal") {
  import Gen._
  import DBus._
  import Arbitrary.arbitrary

  val genFieldBoolean: Gen[FieldBoolean] = arbitrary[Boolean] map (FieldBoolean.apply)
  val genFieldWord8: Gen[FieldWord8] = arbitrary[Byte] map (FieldWord8.apply)
  val genFieldWord16: Gen[FieldWord16] = arbitrary[Short] map (FieldWord16.apply)
  val genFieldWord32: Gen[FieldWord32] = arbitrary[Int] map (FieldWord32.apply)
  val genFieldWord64: Gen[FieldWord64] = arbitrary[Long] map (FieldWord64.apply)
  val genFieldInt16: Gen[FieldInt16] = arbitrary[Short] map (FieldInt16.apply)
  val genFieldInt32: Gen[FieldInt32] = arbitrary[Int] map (FieldInt32.apply)
  val genFieldInt64: Gen[FieldInt64] = arbitrary[Long] map (FieldInt64.apply)
  val genFieldDouble: Gen[FieldDouble] = arbitrary[Double] map (FieldDouble.apply)
  val genFieldString: Gen[FieldString] = arbitrary[String] map (FieldString.apply)
  val genFieldUnixFD: Gen[FieldUnixFD] = arbitrary[Int] map (FieldUnixFD.apply)

  val alphaNumStr = nonEmptyListOf(alphaNumChar) map (_.mkString)
  val genObjectPath = listOf(alphaNumStr) map (_.mkString("/", "/", "").toObjectPath_)
  val genFieldObjectPath = genObjectPath map (FieldObjectPath(_))

  // NOTE: We don't really care about the contents of the signature
  val genAtomic = oneOf("b", "y", "q", "u", "t", "n", "i", "x", "d", "h", "s", "g", "o")
  val genSig = nonEmptyListOf(genAtomic) suchThat (_.length <= 255) map (_.mkString.toSignature_)
  val genFieldSignature: Gen[FieldSignature] = genSig map (FieldSignature.apply)

  val genField: Gen[Field] = frequency(
    (10, genFieldBoolean),
    (10, genFieldWord8),
    (10, genFieldWord16),
    (10, genFieldWord32),
    (10, genFieldWord64),
    (10, genFieldInt16),
    (10, genFieldInt32),
    (10, genFieldInt64),
    (10, genFieldDouble),
    (10, genFieldUnixFD),
    (10, genFieldString),
    (10, genFieldObjectPath),
    (10, genFieldSignature),
    (10, genVariant),
    (1, genStructure)
  )

  def genVariant: Gen[FieldVariant] = lzy(genField map (FieldVariant.apply))
  def genStructure: Gen[FieldStructure] = lzy(genMessage map (m => FieldStructure(messageSignature_(m), m)))

  def genMessage: Gen[Vector[Field]] = lzy(nonEmptyContainerOf[Vector, Field](genField) suchThat(m => messageSignature(m).isRight))
  implicit lazy val arbMessage = Arbitrary(genMessage)

  property("roundTrip") = forAll { m: Vector[Field] =>
    val s = messageSignature_(m)
    unmarshal_(s, marshal_(m)) == m
  }
}

