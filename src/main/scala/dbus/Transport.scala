package dbus

import java.io.{ InputStream, OutputStream }
import scala.util.control.NonFatal
import scala.concurrent.stm._
import com.typesafe.scalalogging._
import scodec.bits.BitVector
import cats._
import cats.data._
import cats.implicits._
import cx.ath.matthew.unix._

import DBus._
import Connection._

trait Transport extends StrictLogging {
  val in: InputStream
  val out: OutputStream

  val running = Ref(false).single

  import MessageReader._

  def disconnect(): Unit

  def auth(): Either[Throwable, Boolean] = {
    Either.catchNonFatal {
      val buffer = new Array[Byte](512)

      // This is the bare minimum to get connected and
      // authenticated on the session bus. This is only
      // for quick and dirty testing. This MUST BE replaced.

      out.write("AUTH EXTERNAL\r\n".getBytes)
      val n = in.read(buffer)
      out.write("DATA\r\n".getBytes)
      val n1 = in.read(buffer)
      out.write("BEGIN\r\n".getBytes)

      true
    }
  }

  def startReadLoop(cb: (Int, DBusMessage) => Unit): Unit = {
    val readerThread = new Thread {
      override def run() = {
        try {
          while(running()) {
            readMessage(in) match {
              case Right((s, m)) => cb(s, m)
              case Left(t)       => throw t
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

  def send(bits: BitVector): Either[Throwable, Unit] =
    Either.catchNonFatal {
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

  def connect(addresses: NonEmptyList[BusAddress]): Either[Throwable, Transport] = {
    val t =
      addresses.toList collectFirst { a: BusAddress =>
        a match {
          case a @ BusAddress("unix", params) => connectUnix(a)
          case BusAddress("tcp", params)  => ???
        }
      }
    t.get
  }

  private def connectUnix(address: BusAddress): Either[Throwable, Transport] =
    Either.catchNonFatal {
  // \/.fromTryCatchNonFatal {
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
  def readMessage(in: InputStream): Throwable \/ (Int, DBusMessage) =
    for {
      hb <- readBytes(in, 16)
      fh <- DBusMessageCodec.decodeFixedHeader(BitVector(hb))
      bl = fh(4).asLong
      s = fh(5).asInt
      hl = fh(6).asLong
      fhb <- readBytes(in, hb, hl + 16)
      h <- DBusMessageCodec.decodeHeader(BitVector(fhb))
      p = padding(hl + 16, 8)
      _ <- readBytes(in, p)
      bb <- readBytes(in, bl)
      b <- DBusMessageCodec.decodeMessage(h, BitVector(bb))
    } yield (s, b)

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

  def beforeOffset(o: Long): State[ReaderState, Boolean] = State { s => (s, s.offset < o) }

  def reader(in: InputStream): State[ReaderState, Unit] =
    for {
      s <- get[ReaderState]
      n = in.read(s.buffer, s.offset, (s.size - s.offset).toInt)
      _ = if(n < 0) throw new Exception("Unexpected EOF on input stream")
      _ <- put[ReaderState](s.copy(offset = s.offset + n))
    } yield ()

  def readBytes(in: InputStream, length: Long): Throwable \/ Array[Byte] = {
    Either.catchNonFatal {
      (reader(in) whileM_ (beforeOffset(length)) exec ReaderState.empty(length)).buffer
    }
  }

  def readBytes(in: InputStream, initial: Array[Byte], length: Long): Throwable \/ Array[Byte] = {
    Either.catchNonFatal {
      (reader(in) whileM_ (beforeOffset(length)) exec ReaderState(initial, length)).buffer
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
