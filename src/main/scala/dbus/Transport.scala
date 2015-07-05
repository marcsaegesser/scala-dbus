package dbus

import java.io.{ InputStream, OutputStream }
import com.typesafe.scalalogging._
import scodec.bits.BitVector
import scalaz._,Scalaz._
import cx.ath.matthew.unix._

import DBus._
import Bus._

trait Transport extends StrictLogging {
  val in: InputStream
  val out: OutputStream

  def disconnect(): Unit

  def auth(): Boolean = {
    val buffer = new Array[Byte](512)

    logger.debug("auth:  Sending AUTH EXTERNAL...")
    out.write("AUTH EXTERNAL\r\n".getBytes)
    val n = in.read(buffer)
    logger.debug(s"auth:  Read ${new String(buffer, 0, n)}")
    logger.debug(s"auth:  Writing DATA...")
    out.write("DATA\r\n".getBytes)
    val n1 = in.read(buffer)
    logger.debug(s"auth:  Read ${new String(buffer, 0, n1)}")
    logger.debug(s"auth:  Sending BEGIN")
    out.write("BEGIN\r\n".getBytes)


    true
  }
}

class UnixSocketTransport(socket: UnixSocket) extends Transport {
  val in = socket.getInputStream()
  val out = socket.getOutputStream()

  def disconnect(): Unit = socket.close()
}

object Transport extends StrictLogging {
  import Bus._

  def connect(addresses: NonEmptyList[BusAddress]): Throwable \/ Transport = {
    val t =
      addresses.toList collectFirst { a: BusAddress =>
        a match {
          case a @ BusAddress("unix", params) => connectUnix(a)
          case BusAddress("tcp", params)  => ???
        }
      }
    t.get
  }

  private def connectUnix(address: BusAddress): Throwable \/ Transport =
    \/.fromTryCatchNonFatal {
      val s = new UnixSocket()
      val sockAddr =
        address.parameters.get("abstract").map(new UnixSocketAddress(_, true))
          .orElse(address.parameters.get("path").map(new UnixSocketAddress(_, false))).get

      s.connect(sockAddr)
      s.setPassCred(true)
      s.sendCredentialByte(0.toByte)

      new UnixSocketTransport(s)
    }
}
