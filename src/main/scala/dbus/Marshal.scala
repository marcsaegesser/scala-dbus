package dbus

import scala.util.control.NonFatal
import java.nio.charset.Charset
import scalaz._,Scalaz._
import scodec._
import scodec.Codec
import scodec.codecs._
import scodec.bits.{ ByteVector, BitVector, ByteOrdering }
import DBus._

trait Marshal {
  sealed trait Field {
    val t: Type
    def asBoolean: Boolean = throw new Exception(s"Not a Boolean field")
    def asByte: Byte = throw new Exception(s"Not a Byte field")
    def asShort: Short = throw new Exception(s"Not a Short field")
    def asInt: Int = throw new Exception(s"Not an Int field")
    def asLong: Long = throw new Exception(s"Not an Long field")
    def asDouble: Double = throw new Exception(s"Not a Double field")
    def asUnixFD: Int = throw new Exception(s"Not an UnixFD field")
    def asString: String = throw new Exception(s"Not a String field")
    def asObjectPath: ObjectPath = throw new Exception(s"Not an ObjectPath field")
    def asSignature: Signature = throw new Exception(s"Not a Signature field")

  }

  sealed trait AtomicField extends Field

  case class FieldBoolean(v: Boolean) extends AtomicField {
    val t = TypeBoolean
    override def asBoolean = v
  }

  case class FieldWord8(v: Byte) extends AtomicField {
    val t = TypeWord8
    override def asByte = v
  }

  case class FieldWord16(v: Short) extends AtomicField {
    val t = TypeWord16
    override def asShort = v
  }

  case class FieldWord32(v: Int) extends AtomicField {
    val t = TypeWord32
    override def asInt = v
  }

  case class FieldWord64(v: Long) extends AtomicField {
    val t = TypeWord64
    override def asLong = v
  }

  case class FieldInt16(v: Short) extends AtomicField {
    val t = TypeInt16
    override def asShort = v
  }

  case class FieldInt32(v: Int) extends AtomicField {
    val t = TypeInt32
    override def asInt = v
  }

  case class FieldInt64(v: Long) extends AtomicField {
    val t = TypeInt64
    override def asLong = v
  }

  case class FieldDouble(v: Double) extends AtomicField {
    val t = TypeDouble
    override def asDouble = v
  }

  case class FieldUnixFD(v: Int) extends AtomicField {
    val t = TypeUnixFD
    override def asUnixFD = v
  }

  case class FieldString(v: String) extends AtomicField {
    val t = TypeString
    override def asString = v
  }

  case class FieldObjectPath(v: ObjectPath) extends AtomicField {
    val t = TypeObjectPath
    override def asObjectPath = v
  }

  case class FieldSignature(v: Signature) extends AtomicField {
    val t = TypeSignature
    override def asSignature = v
  }

  case class FieldArray(b: Type, v: Vector[Field]) extends Field {
    val t = TypeArray(b)
  }

  case class FieldStructure(s: Signature, v: Vector[Field]) extends Field {
    val t = TypeStructure(s.types)
  }

  case class FieldVariant(v: Field) extends Field {
    val t = TypeVariant
  }

  case class FieldDictionary(t: TypeDictionary, v: Vector[(Field, Field)]) extends Field

  type Message = Vector[Field]

  implicit class FieldListOps[F <: Field](val fs: List[F]) {
    def toMessage: Message = fs.toVector
  }

  def messageSignature(m: Message): Throwable \/ Signature = (m.map(_.t)).toList.toSignature
  def messageSignature_(m: Message): Signature = (m.map(_.t)).toList.toSignature_


  def marshalField(f: Field, e: ByteOrdering): State[BitVector, Unit] =
    for {
      v <- get[BitVector]
      _ <- pad(f.t.align)
      _ <- encodeField(f, e)
    } yield ()

  private def marshaler(m: Message, e: ByteOrdering): State[BitVector, Unit] =
    (m traverseS_ (marshalField(_, e)))

  def marshal(m: Message, e: ByteOrdering = ByteOrdering.BigEndian): Throwable \/ BitVector =
    try {
      (marshaler(m, e) exec (BitVector.empty)).right
    } catch {
      case NonFatal(t: Throwable) => t.left
    }

  def marshal_(m: Message, e: ByteOrdering = ByteOrdering.BigEndian): BitVector =
    marshal(m, e) fold (throw _, identity)

  import DBusCodecs._

  def encodeField(f: Field, e: ByteOrdering): State[BitVector, Unit] =
    if(e == ByteOrdering.BigEndian)
      f match {
        case FieldBoolean(v)       => State.modify { _ ++ (if(v) int32.encode(1) else int32.encode(0)).require }
        case FieldWord8(v)         => State.modify { _ ++ byte.encode(v).require }
        case FieldWord16(v)        => State.modify { _ ++ short(16).encode(v).require }
        case FieldWord32(v)        => State.modify { _ ++ int32.encode(v).require }
        case FieldWord64(v)        => State.modify { _ ++ int64.encode(v).require }
        case FieldInt16(v)         => State.modify { _ ++ short(16).encode(v).require }
        case FieldInt32(v)         => State.modify { _ ++ int32.encode(v).require }
        case FieldInt64(v)         => State.modify { _ ++ int64.encode(v).require }
        case FieldDouble(v)        => State.modify { _ ++ double.encode(v).require }
        case FieldUnixFD(v)        => State.modify { _ ++ int32.encode(v).require }
        case FieldString(v)        => State.modify { _ ++ dbusStringCodec.encode((v, ())).require }
        case FieldObjectPath(v)    => State.modify { _ ++ dbusStringCodec.encode((v.path, ())).require }
        case FieldSignature(v)     => State.modify { _ ++ dbusStringCodecSmall.encode((v.toString, ())).require }
        case FieldArray(t, v)      => encodeArray(t, v, e)
        case FieldStructure(s, v)  => encodeStructure(s, v, e)
        case FieldVariant(v)       => encodeVariant(v, e)
        case FieldDictionary(t, v) => encodeDictionary(t, v, e)
      }
    else
      f match {
        case FieldBoolean(v)       => State.modify { _ ++ (if(v) int32L.encode(1) else int32L.encode(0)).require }
        case FieldWord8(v)         => State.modify { _ ++ byte.encode(v).require }
        case FieldWord16(v)        => State.modify { _ ++ ushortL(16).encode(v).require }
        case FieldWord32(v)        => State.modify { _ ++ int32L.encode(v).require }
        case FieldWord64(v)        => State.modify { _ ++ int64L.encode(v).require }
        case FieldInt16(v)         => State.modify { _ ++ shortL(16).encode(v).require }
        case FieldInt32(v)         => State.modify { _ ++ int32L.encode(v).require }
        case FieldInt64(v)         => State.modify { _ ++ int64L.encode(v).require }
        case FieldDouble(v)        => State.modify { _ ++ doubleL.encode(v).require }
        case FieldUnixFD(v)        => State.modify { _ ++ int32L.encode(v).require }
        case FieldString(v)        => State.modify { _ ++ dbusStringCodecL.encode((v, ())).require }
        case FieldObjectPath(v)    => State.modify { _ ++ dbusStringCodecL.encode((v.path, ())).require }
        case FieldSignature(v)     => State.modify { _ ++ dbusStringCodecSmall.encode((v.toString, ())).require }
        case FieldArray(t, v)      => encodeArray(t, v, ByteOrdering.LittleEndian)
        case FieldStructure(s, v)  => encodeStructure(s, v, e)
        case FieldVariant(v)       => encodeVariant(v, e)
        case FieldDictionary(t, v) => encodeDictionary(t, v, e)
      }

  def encodeArray(t: Type, v: Vector[Field], e: ByteOrdering): State[BitVector, Unit] = {
    val arrayBits = marshal(v, e) getOrElse { throw new Exception("Error encoding array bits") }
    val size = arrayBits.size / 8
    if (size > 67108864) throw new Exception(s"Array size of $size bytes to large")
    for {
      v <- get[BitVector]
      _ <- marshalField(FieldInt32(size.toInt), e)
      _ <- pad(t.align)
      _ <- modify[BitVector](_ ++ arrayBits)
    } yield ()
  }

  def encodeDictionary(t: TypeDictionary, v: Vector[(Field, Field)], e: ByteOrdering): State[BitVector, Unit] = {
    val s = List(t.k, t.v)
    val elements = v map { case (k, v) => FieldStructure(s.toSignature_, Vector(k, v))}
    encodeArray(TypeStructure(s), elements, e)
  }

  def encodeStructure(s: Signature, v: Vector[Field], e: ByteOrdering): State[BitVector, Unit] =
    marshaler(v, e)

  def encodeVariant(v: Field, e: ByteOrdering): State[BitVector, Unit] =
    for {
      _ <- marshalField(FieldSignature(v.t.code.toSignature_), e)
      _ <- marshalField(v, e)
    } yield ()

  private def padding(offset: Long, a: Int) = {
    val m = offset % a
    val result =
      if (m > 0)
        (a - m)
      else
        0
    result
  }

  def pad(align: Int): State[BitVector, Unit] =
    for {
      v <- get[BitVector]
      b = BitVector.fill(padding(v.size / 8, align)*8)(false)
      _ <- put(v ++ b)
    } yield ()

  case class UnmarshalState(bits: BitVector, offset: Int, m: Message)
  object UnmarshalState {
    def empty(bits: BitVector) = UnmarshalState(bits, 0, Vector.empty[Field])
  }

  def skipPad(align: Int): State[UnmarshalState, Unit] =
    for {
      s <- get[UnmarshalState]
      p = padding(s.offset.toLong, align) // Padding in _bytes_
      b = s.bits.drop(p * 8)              // Drop p * 8 _bits_
      _ <- put(s.copy(offset = s.offset + p.toInt, bits = b))
    } yield ()

  def unmarshalField(t: Type, e: ByteOrdering): State[UnmarshalState, Unit] =
    for {
      s <- get[UnmarshalState]
      _ <- skipPad(t.align)
      f <- decodeField(t, e)
      _ <- modify[UnmarshalState](_.copy(m = s.m :+ f))
    } yield ()

  def unmarshaler(ts: List[Type], e: ByteOrdering): State[UnmarshalState, Unit] =
    ts traverseS_ (unmarshalField(_, e))

  def unmarshal(s: Signature, bits: BitVector, e: ByteOrdering = ByteOrdering.BigEndian): Throwable \/ Message =
    try {
      unmarshaler(s.types, e)
        .exec (UnmarshalState.empty(bits))
        .map (_.m)
        .right
    } catch {
      case NonFatal(t: Throwable) => t.left
    }

  def unmarshal_(s: Signature, bits: BitVector, e: ByteOrdering = ByteOrdering.BigEndian): Message =
    unmarshal(s, bits, e) fold (throw _, identity)

  def decodeField(t: Type, e: ByteOrdering): State[UnmarshalState, Field] = {
    def updateUnmarshalState(f: BitVector => DecodeResult[Field]): State[UnmarshalState, Field] = {
      for {
        s <- get[UnmarshalState]
        r = f(s.bits)
        d = s.bits.size - r.remainder.size
        _ <- put(s.copy(bits = r.remainder, offset = s.offset + d.toInt / 8))
      } yield r.value
    }

    if(e == ByteOrdering.BigEndian)
      t match {
        case TypeBoolean    => updateUnmarshalState(int32.decode(_).require map (i => FieldBoolean(i == 1)))
        case TypeWord8      => updateUnmarshalState(byte.decode(_).require map (FieldWord8(_)))
        case TypeWord16     => updateUnmarshalState(short(16).decode(_).require map (FieldWord16(_)))
        case TypeWord32     => updateUnmarshalState(int32.decode(_).require map (w => FieldWord32(w.toInt)))
        case TypeWord64     => updateUnmarshalState(int64.decode(_).require map (FieldWord64(_)))
        case TypeInt16      => updateUnmarshalState(short(16).decode(_).require map (FieldInt16(_)))
        case TypeInt32      => updateUnmarshalState(int32.decode(_).require map (FieldInt32(_)))
        case TypeInt64      => updateUnmarshalState(int64.decode(_).require map (FieldInt64(_)))
        case TypeDouble     => updateUnmarshalState(double.decode(_).require map (FieldDouble(_)))
        case TypeUnixFD     => updateUnmarshalState(int32.decode(_).require map (FieldUnixFD(_)))
        case TypeString     => updateUnmarshalState(dbusStringCodec.decode(_).require map { case (s, t) => FieldString(s) })
        case TypeObjectPath => updateUnmarshalState(dbusStringCodec.decode(_).require map { case (s, t) => FieldObjectPath(s.toObjectPath_) })
        case TypeSignature  => updateUnmarshalState(dbusStringCodecSmall.decode(_).require map { case (s, t) => FieldSignature(s.toSignature_) })
        case TypeVariant    => decodeVariant(e)
        case TypeArray(t)   => decodeArray(t, e)
        case TypeStructure(ts) => decodeStructure(ts, e)
        case TypeDictionary(k, v) => decodeDictionary(k, v, e)
      }
    else
      t match {
        case TypeBoolean    => updateUnmarshalState(int32L.decode(_).require map (i => FieldBoolean(i == 1)))
        case TypeWord8      => updateUnmarshalState(byte.decode(_).require map (FieldWord8(_)))
        case TypeWord16     => updateUnmarshalState(shortL(16).decode(_).require map (FieldWord16(_)))
        case TypeWord32     => updateUnmarshalState(int32L.decode(_).require map (w => FieldWord32(w.toInt)))
        case TypeWord64     => updateUnmarshalState(int64L.decode(_).require map (FieldWord64(_)))
        case TypeInt16      => updateUnmarshalState(shortL(16).decode(_).require map (FieldInt16(_)))
        case TypeInt32      => updateUnmarshalState(int32L.decode(_).require map (FieldInt32(_)))
        case TypeInt64      => updateUnmarshalState(int64L.decode(_).require map (FieldInt64(_)))
        case TypeDouble     => updateUnmarshalState(doubleL.decode(_).require map (FieldDouble(_)))
        case TypeUnixFD     => updateUnmarshalState(int32L.decode(_).require map (FieldUnixFD(_)))
        case TypeString     => updateUnmarshalState(dbusStringCodecL.decode(_).require map { case (s, t) => FieldString(s) })
        case TypeObjectPath => updateUnmarshalState(dbusStringCodecL.decode(_).require map { case (s, t) => FieldObjectPath(s.toObjectPath_) })
        case TypeSignature  => updateUnmarshalState(dbusStringCodecSmall.decode(_).require map { case (s, t) => FieldSignature(s.toSignature_) })
        case TypeVariant    => decodeVariant(e)
        case TypeArray(t)   => decodeArray(t, e)
        case TypeStructure(ts) => decodeStructure(ts, e)
        case TypeDictionary(k, v) => decodeDictionary(k, v, e)
      }
  }

  def decodeArray(t: Type, e: ByteOrdering): State[UnmarshalState, Field] = {
    def atOffset(o: Long): State[UnmarshalState, Boolean] = State { s => (s, s.offset >= o)}
    def readArray: State[UnmarshalState, Unit] =
      for {
        f <- decodeField(TypeInt32, e)
        s <- get[UnmarshalState]
        _ <- unmarshalField(t, e).untilM_(atOffset( s.offset + f.asInt.toLong))
      } yield ()

    State { s =>
      val UnmarshalState(b, o, mm) = readArray exec (s.copy(m = Vector.empty[Field]))
      (UnmarshalState(b, o, s.m), FieldArray(t, mm))
    }
  }

  def decodeDictionary(k: AtomicType, v: Type, e: ByteOrdering): State[UnmarshalState, Field] = {
    val s = List(k, v)
    decodeArray(TypeStructure(s), e)
      .map {a =>
        FieldDictionary(TypeDictionary(k, v), a.asInstanceOf[FieldArray].v collect { case av: FieldStructure => (av.v(0), av.v(1)) })
    }
  }

  def decodeStructure(ts: List[Type], e: ByteOrdering): State[UnmarshalState, Field] =
    State { s =>
      val UnmarshalState(b, o, mm) = unmarshaler(ts, e) exec (s.copy(m = Vector.empty[Field]))
      (UnmarshalState(b, o, s.m), FieldStructure(ts.toSignature_, mm))
    }

  def decodeVariant(e: ByteOrdering): State[UnmarshalState, Field] = {
    def readType: State[UnmarshalState, Type] =
      for {
        s <- decodeField(TypeSignature, e)
      } yield (s.asInstanceOf[FieldSignature]).v.types.head

    for {
      t <- readType
      _ <- skipPad(t.align)
      f <- decodeField(t, e)
    } yield FieldVariant(f)
  }
}
