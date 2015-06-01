package dbus

import org.scalacheck._
import org.scalacheck.Prop.forAll
import dbus._

object DBusTypeSpecification extends Properties("Types") {
  import Gen._
  import DBus._

  type AtomType = String
  type SigType = String

  val genAtomic: Gen[AtomType] = oneOf("b", "y", "q", "u", "t", "n", "i", "x", "d", "h", "s", "g", "o")
  val genArray: Gen[SigType] =
    for {
      t <- genAtomic
    } yield ("a" + t)

  val genCombo: Gen[SigType] =
    for {
      a <- genAtomic
      s <- genSig
    } yield (a + s).mkString("", "", "")

  val genSig: Gen[SigType] = oneOf(genAtomic, genArray, genCombo)
  implicit lazy val arbSig = Arbitrary(genSig)

  property("parse") = forAll { (a: SigType) =>
    parseSignature(a) map (_.toString == a) getOrElse(false)
  }

}
