package dbus

import java.io.{ InputStream, OutputStream }
import scala.util.control.NonFatal
import scala.concurrent.stm._
import com.typesafe.scalalogging._
import scodec.bits.BitVector
import scalaz._,Scalaz._
import cx.ath.matthew.unix._

import DBus._
import Connection._

trait Transport extends StrictLogging {
  val in: InputStream
  val out: OutputStream

  val running = Ref(false).single

  import MessageReader._

  def disconnect(): Unit

  def auth(): Throwable \/ Boolean = {
    \/.fromTryCatchNonFatal {
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
      logger.debug(s"Auth complete. available=${in.available()}")

      true
    }
  }

  def startReadLoop(cb: DBusMessage => Unit): Unit = {
    val readerThread = new Thread {
      override def run() = {
        try {
          while(running()) {
            readMessage(in) match {
              case \/-(m) => cb(m)
              case -\/(t) => throw t
            }
          }
        } catch {
          case NonFatal(t: Throwable) =>
            if(!running()) logger.debug(s"readLoop:  Stopped.")
            else logger.error("readLoop:  ", t)
        }
      }
    }

    running() = true
    readerThread.setDaemon(true)
    readerThread.start()
  }

  def stopReadLoop(): Unit = {
    running() = false
  }

  def send(bits: BitVector): Throwable \/ Unit =
    \/.fromTryCatchNonFatal {
      out.write(bits.toByteArray)
    }



}

class UnixSocketTransport(socket: UnixSocket) extends Transport {
  val in = socket.getInputStream()
  val out = socket.getOutputStream()

  def disconnect(): Unit = {
    stopReadLoop()
    socket.close()
  }
}

object Transport extends StrictLogging {
  import Connection._

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

object MessageReader extends StrictLogging {
  def readMessage(in: InputStream): Throwable \/ DBusMessage =
    for {
      hb <- readBytes(in, 16)
      fh <- DBusMessageCodec.decodeFixedHeader(BitVector(hb))
      bl = fh(4).asLong
      hl = fh(6).asLong
      fhb <- readBytes(in, hb, hl + 16)
      h <- DBusMessageCodec.decodeHeader(BitVector(fhb))
      p = padding(hl + 16, 8)
      _ <- readBytes(in, p)
      bb <- readBytes(in, bl)
      b <- DBusMessageCodec.decodeMessage(h, BitVector(bb))
    } yield b

  case class ReaderState(buffer: Array[Byte], offset: Int, size: Long)
  object ReaderState {
    def apply(buf: Array[Byte], size: Long): ReaderState = ReaderState(
      {
        val b = new Array[Byte](size.toInt)
        buf.copyToArray(b)
        b
      },
      buf.size,
      size
    )
    def empty(size: Long) = ReaderState(new Array[Byte](size.toInt), 0, size)
  }

  def notAtOffset(o: Long): State[ReaderState, Boolean] = State { s => (s, s.offset < o) }

  def reader(in: InputStream): State[ReaderState, Unit] =
    for {
      s <- get[ReaderState]
      _ = logger.trace(s"reader:  offset=${s.offset}, toRead=${s.size - s.offset}")
      n = in.read(s.buffer, s.offset, (s.size - s.offset).toInt)
      _ = if(n < 0) throw new Exception("Unexpected EOF on input stream")
      _ = logger.trace(s"reader:  read = $n")
      _ <- put[ReaderState](s.copy(offset = s.offset + n))
    } yield ()

  def readBytes(in: InputStream, length: Long): Throwable \/ Array[Byte] = {
    \/.fromTryCatchNonFatal {
      logger.debug(s"readBytes:  IN - length=$length")
      (reader(in) whileM_ (notAtOffset(length)) exec ReaderState.empty(length)).buffer
    }
  }

  def readBytes(in: InputStream, initial: Array[Byte], length: Long): Throwable \/ Array[Byte] = {
    \/.fromTryCatchNonFatal {
      (reader(in) whileM_ (notAtOffset(length)) exec ReaderState(initial, length)).buffer
    }
  }

  private def padding(offset: Long, a: Int) = {
    val m = offset % a
    val result =
      if (m > 0)
        (a - m)
      else
        0
    result
  }
}
