package dbus

import scalaz._,Scalaz._
import scodec.bits.{ BitVector, ByteVector, ByteOrdering }
import org.scalacheck._
import org.scalacheck.Prop.forAll
import org.scalacheck.Prop.BooleanOperators

object DBusMarshalSpecification extends Properties("Marshal") {
  import Gen._
  import DBus._
  import Arbitrary.arbitrary

  val genFieldBoolean: Gen[FieldBoolean] = arbitrary[Boolean] map (FieldBoolean)
  val genFieldWord8:   Gen[FieldWord8]   = arbitrary[Byte]    map (FieldWord8)
  val genFieldWord16:  Gen[FieldWord16]  = arbitrary[Short]   map (FieldWord16)
  val genFieldWord32:  Gen[FieldWord32]  = arbitrary[Int]     map (FieldWord32)
  val genFieldWord64:  Gen[FieldWord64]  = arbitrary[Long]    map (FieldWord64)
  val genFieldInt16:   Gen[FieldInt16]   = arbitrary[Short]   map (FieldInt16)
  val genFieldInt32:   Gen[FieldInt32]   = arbitrary[Int]     map (FieldInt32)
  val genFieldInt64:   Gen[FieldInt64]   = arbitrary[Long]    map (FieldInt64)
  val genFieldDouble:  Gen[FieldDouble]  = arbitrary[Double]  map (FieldDouble)
  val genFieldString:  Gen[FieldString]  = arbitrary[String]  map (FieldString)
  val genFieldUnixFD:  Gen[FieldUnixFD]  = arbitrary[Int]     map (FieldUnixFD)

  val alphaNumStr = nonEmptyListOf(alphaNumChar) map (_.mkString)
  // val genObjectPath = listOf(alphaNumStr) map (_.mkString("/", "/", "").toObjectPath_)
  val genObjectPath = listOf(identifier) map (_.mkString("/", "/", "").toObjectPath_)
  val genFieldObjectPath = genObjectPath map (FieldObjectPath)

  // NOTE: We don't really care about the contents of the signature
  val genAtomic = oneOf("b", "y", "q", "u", "t", "n", "i", "x", "d", "h", "s", "g", "o")
  val genSig = nonEmptyListOf(genAtomic) suchThat (_.length <= 255) map (_.mkString.toSignature_)
  val genFieldSignature: Gen[FieldSignature] = genSig map (FieldSignature)

  val genListField: Gen[Field] = oneOf(
    listOf(genFieldBoolean) map (l => FieldArray(TypeBoolean, l.toVector)),
    listOf(genFieldWord8) map (l => FieldArray(TypeWord8, l.toVector)),
    listOf(genFieldWord16) map (l => FieldArray(TypeWord16, l.toVector)),
    listOf(genFieldWord32) map (l => FieldArray(TypeWord32, l.toVector)),
    listOf(genFieldWord64) map (l => FieldArray(TypeWord64, l.toVector)),
    listOf(genFieldInt16) map (l => FieldArray(TypeInt16, l.toVector)),
    listOf(genFieldInt32) map (l => FieldArray(TypeInt32, l.toVector)),
    listOf(genFieldInt64) map (l => FieldArray(TypeInt64, l.toVector)),
    listOf(genFieldDouble) map (l => FieldArray(TypeDouble, l.toVector)),
    listOf(genFieldUnixFD) map (l => FieldArray(TypeUnixFD, l.toVector)),
    listOf(genFieldString) map (l => FieldArray(TypeString, l.toVector)),
    listOf(genFieldObjectPath) map (l => FieldArray(TypeObjectPath, l.toVector)),
    listOf(genFieldSignature) map (l => FieldArray(TypeSignature, l.toVector)),
    listOf(genVariant) map (l => FieldArray(TypeVariant, l.toVector))
  )

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
    (1,  genListField),
    (1,  genStructure)
  )

  def genVariant: Gen[FieldVariant] = lzy(genField map (FieldVariant))
  def genStructure: Gen[FieldStructure] = lzy(genMessage map (m => FieldStructure(messageSignature_(m), m)))

  def genMessage: Gen[Vector[Field]] = lzy(nonEmptyContainerOf[Vector, Field](genField) suchThat(m => messageSignature(m).isRight))
  implicit lazy val arbMessage = Arbitrary(genMessage)

  def genBytes(n: Int): Gen[List[Byte]] = Gen.listOfN(n, arbitrary[Byte])

  def addRandomBytes(buffer: ByteVector, bytes: List[Byte]): ByteVector = {
    def helper(byte: Byte): State[ByteVector, Unit] =
      State.modify { b => b.insert(scala.util.Random.nextInt(b.size), byte) }

    bytes traverseS_ (helper) exec (buffer)
  }

  def genInvalidMessage: Gen[(Signature, BitVector)] =
    for {
      m <- genMessage
      s = messageSignature_(m)
      b = marshal_(m)
      n <- choose(1, 10)
      r <- genBytes(n)
    } yield (s, addRandomBytes(b.toByteVector, r).toBitVector)

  property("roundTrip") = forAll { m: Vector[Field] =>
    val s = messageSignature_(m)
    unmarshal_(s, marshal_(m)) == m
  }

  property("invalidMessages") = forAll (genInvalidMessage) { case (s, b) =>
    unmarshal(s, b).isLeft
  }
}

