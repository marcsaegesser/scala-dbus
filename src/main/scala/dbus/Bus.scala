package dbus

import com.typesafe.scalalogging._
import atto._,Atto._
import scalaz._,Scalaz._
import DBus._

trait Bus {
  def transport: Transport

  def disconnect(): Unit = transport.disconnect()
}

object Bus extends StrictLogging {
  def parseAddresses(addresses: String): Throwable \/ NonEmptyList[BusAddress] =
    busAddrsP.parseOnly(addresses).either.leftMap(es => new Exception(s"Error parsing BusAddress: $es"))


  def connect(busType: BusType): Throwable \/ Bus = {
    busType match {
      case SessionBus => connectSession()
      case SystemBus  => ???
    }
  }

  private def connectSession(): Throwable \/ Bus = {
    val env = System.getenv()
    for {
      as <- parseAddresses(env.get("DBUS_SESSION_BUS_ADDRESS"))
      t <- Transport.connect(as)
    } yield new Bus { def transport = t }

  }

  case class BusAddress(transportType: String, parameters: Map[String, String])

  def notSep(c: Char) = c != ',' && c != '=' && c != ';'
  val notSepP = elem(notSep)
  val transportTypeP = choice(string("unix"), string("tcp"))
  val keyP = stringOf1(notSepP)
  val valueP = stringOf1(notSepP)
  val kvpP = pairBy(keyP, Atto.char('='), valueP)
  val kvpsP = sepBy1(kvpP, Atto.char(',')).map(_.toList.toMap)
  val busAddrP = (transportTypeP <~ Atto.char(':') |@| kvpsP)(BusAddress.apply)
  val busAddrsP = sepBy1(busAddrP, Atto.char(';'))

}

