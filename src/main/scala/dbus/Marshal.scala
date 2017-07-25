package dbus

import scala.language.higherKinds
import scala.util.control.NonFatal
import java.nio.charset.Charset
import scalaz._,Scalaz._
import scodec._
import scodec.Codec
import scodec.codecs._
import scodec.bits.{ ByteVector, BitVector, ByteOrdering }
import DBus._

trait Marshal {
  /** Marshal a message into a BitVector.
    *
    */
  def marshal[F[_]: Foldable](m: F[Field], e: ByteOrdering = ByteOrdering.BigEndian, initial: BitVector = BitVector.empty, offset: Long = 0L): Throwable \/ BitVector =
    \/.fromTryCatchNonFatal { (marshaler(m, e) exec (MarshalState(initial, offset))).map(_.bits) }


  /** Marshal a message into a BitVector throwing an exception on failure.
    *
    */
  def marshal_[F[_]: Foldable](m: F[Field], e: ByteOrdering = ByteOrdering.BigEndian, initial: BitVector = BitVector.empty, offset: Long = 0L): BitVector =
    marshal(m, e, initial, offset) fold (throw _, identity)


  /** Unmarshal a BitVector to a Vector[Field] given the message signature.
    *
    */
  def unmarshal(s: Signature, bits: BitVector, e: ByteOrdering = ByteOrdering.BigEndian): Throwable \/ Vector[Field] =
    \/.fromTryCatchNonFatal { unmarshaler(s.types.toVector, e) run (UnmarshalState.empty(bits)) match {
      case (UnmarshalState(b, _), v) if b.isEmpty => v
      case _ => throw new Exception("Could not unmarshal all input data")
    } }


  /** Unmarshal a BitVector to a Vector[Field] given the message signature, Throws an exception on failure.
    *
    */
  def unmarshal_(s: Signature, bits: BitVector, e: ByteOrdering = ByteOrdering.BigEndian): Vector[Field] =
    unmarshal(s, bits, e) fold (throw _, identity)


  private
  case class MarshalState(bits: BitVector, offset: Long)

  private
  def marshalField(f: Field, e: ByteOrdering): State[MarshalState, Unit] =
    for {
      _ <- pad(f.t.align)
      _ <- encodeField(f, e)
    } yield ()


  private
  def marshaler[F[_]: Foldable](m: F[Field], e: ByteOrdering): State[MarshalState, Unit] =
    (m traverseS_ (marshalField(_, e)))


  import DBusSCodecs._

  private
  def encodeField(f: Field, e: ByteOrdering): State[MarshalState, Unit] =
    if(e == ByteOrdering.BigEndian)
      f match {
        case FieldBoolean(v)       => encodeBits((if(v) int32.encode(1) else int32.encode(0)).require, 4)
        case FieldWord8(v)         => encodeBits(byte.encode(v).require, 1)
        case FieldWord16(v)        => encodeBits(short(16).encode(v).require, 2)
        case FieldWord32(v)        => encodeBits(int32.encode(v).require, 4)
        case FieldWord64(v)        => encodeBits(int64.encode(v).require, 8)
        case FieldInt16(v)         => encodeBits(short(16).encode(v).require, 2)
        case FieldInt32(v)         => encodeBits(int32.encode(v).require, 4)
        case FieldInt64(v)         => encodeBits(int64.encode(v).require, 8)
        case FieldDouble(v)        => encodeBits(double.encode(v).require, 8)
        case FieldUnixFD(v)        => encodeBits(int32.encode(v).require, 4)
        case FieldString(v)        => encodeString(v, e)
        case FieldObjectPath(v)    => encodeString(v.path, e)
        case FieldSignature(v)     => encodeStringSmall(v.toString)
        case FieldArray(t, v)      => encodeArray(t, v, e)
        case FieldStructure(s, v)  => marshaler(v, e)
        case FieldVariant(v)       => encodeVariant(v, e)
        case FieldDictionary(t, v) => encodeDictionary(t, v, e)
      }
    else
      f match {
        case FieldBoolean(v)       => encodeBits((if(v) int32L.encode(1) else int32L.encode(0)).require, 4)
        case FieldWord8(v)         => encodeBits(byte.encode(v).require, 1)
        case FieldWord16(v)        => encodeBits(ushortL(16).encode(v).require, 2)
        case FieldWord32(v)        => encodeBits(int32L.encode(v).require, 4)
        case FieldWord64(v)        => encodeBits(int64L.encode(v).require, 8)
        case FieldInt16(v)         => encodeBits(shortL(16).encode(v).require, 2)
        case FieldInt32(v)         => encodeBits(int32L.encode(v).require, 4)
        case FieldInt64(v)         => encodeBits(int64L.encode(v).require, 8)
        case FieldDouble(v)        => encodeBits(doubleL.encode(v).require, 8)
        case FieldUnixFD(v)        => encodeBits(int32L.encode(v).require, 4)
        case FieldString(v)        => encodeString(v, e)
        case FieldObjectPath(v)    => encodeString(v.path, e)
        case FieldSignature(v)     => encodeStringSmall(v.toString)
        case FieldArray(t, v)      => encodeArray(t, v, ByteOrdering.LittleEndian)
        case FieldStructure(s, v)  => marshaler(v, e)
        case FieldVariant(v)       => encodeVariant(v, e)
        case FieldDictionary(t, v) => encodeDictionary(t, v, e)
      }

  private
  def encodeBits(b: BitVector, size: Long): State[MarshalState, Unit] =
    State.modify { s => MarshalState(s.bits ++ b, s.offset + size) }

  private
  def encodeString(s: String, e: ByteOrdering): State[MarshalState, Unit] = {
    val stringBits =
      if(e == ByteOrdering.BigEndian)
        dbusStringCodec.encode((s, ())).require
      else
        dbusStringCodecL.encode((s, ())).require

    encodeBits(stringBits, stringBits.size / 8)
  }

  private
  def encodeStringSmall(s: String): State[MarshalState, Unit] = {
    val stringBits = dbusStringCodecSmall.encode((s, ())).require
    encodeBits(stringBits, stringBits.size / 8)
  }

  private
  def encodeArray(t: Type, v: Vector[Field], e: ByteOrdering): State[MarshalState, Unit] = {
    for {
      _ <- pad(TypeArray(t).align) // Pad to array count
      s <- get[MarshalState]
      o = s.offset + TypeInt32.align
      arrayBits = marshal(v, e, BitVector.empty, o + padding(o, t.align)) getOrElse { throw new Exception("Error encoding array bits") }
      size = arrayBits.size / 8
      _ = require(size <= 67108864, s"Array size of $size bytes to large")
      _ <- marshalField(FieldInt32(size.toInt), e)
      _ <- pad(t.align) // Pad to first element (NOTE: not included in size)
      _ <- encodeBits(arrayBits, size)
    } yield ()
  }

  private
  def encodeDictionary(t: TypeDictionary, v: Vector[(Field, Field)], e: ByteOrdering): State[MarshalState, Unit] = {
    val s = List(t.k, t.v)
    val elements = v map { case (k, v) => FieldStructure(s.toSignature_, Vector(k, v))}
    encodeArray(TypeStructure(s), elements, e)
  }

  private
  def encodeVariant(v: Field, e: ByteOrdering): State[MarshalState, Unit] =
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

  private
  def pad(align: Int): State[MarshalState, Unit] =
    for {
      s <- get[MarshalState]
      pad = padding(s.offset, align)
      // _ = println(s"pad: align=$align, offset=${s.offset}, pad=$pad")
      b = BitVector.fill(pad*8)(false)
      _ <- put(s.copy(s.bits ++ b, s.offset + pad))
    } yield ()

  private case class UnmarshalState(bits: BitVector, offset: Int)
  private object UnmarshalState {
    def empty(bits: BitVector) = UnmarshalState(bits, 0)
  }

  private
  def skipPad(align: Int): State[UnmarshalState, Unit] =
    for {
      s <- get[UnmarshalState]
      p = padding(s.offset.toLong, align) // Padding in _bytes_
      b = s.bits.drop(p * 8)              // Drop p * 8 _bits_
      _ <- put(s.copy(offset = s.offset + p.toInt, bits = b))
    } yield ()

  private
  def unmarshalField(t: Type, e: ByteOrdering): State[UnmarshalState, Field] =
    for {
      _ <- skipPad(t.align)
      f <- decodeField(t, e)
    } yield f

  private
  def unmarshaler(s: Vector[Type], e: ByteOrdering): State[UnmarshalState, Vector[Field]] =
    s traverseS (unmarshalField(_, e))

  private
  def unmarshalerMany(ss: List[Vector[Type]], e: ByteOrdering): State[UnmarshalState, List[Vector[Field]]] = {
    ss traverseS { s =>
      for {
        _ <- skipPad(8)
        f <- unmarshaler(s, e)
      } yield f
    }
  }

  def unmarshalMany(ss: List[Signature], bits: BitVector, e: ByteOrdering = ByteOrdering.BigEndian): Throwable \/ List[Vector[Field]] =
    \/.fromTryCatchNonFatal {
      unmarshalerMany(ss.map(_.types.toVector), e)
        .eval(UnmarshalState.empty(bits))
    }

  def unmarshalMany_(ss: List[Signature], bits: BitVector, e: ByteOrdering = ByteOrdering.BigEndian): List[Vector[Field]] =
    unmarshalMany(ss, bits, e) fold (throw _, identity)

  private
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

  private
  def decodeArray(t: Type, e: ByteOrdering): State[UnmarshalState, Field] = {
    def beforeOffset(o: Long): State[UnmarshalState, Boolean] = State { s => (s, s.offset < o)}
    for {
      f <- decodeField(TypeInt32, e)
      _ <- skipPad(t.align)
      s <- get[UnmarshalState]
      v <- unmarshalField(t, e).whileM[Vector](beforeOffset( s.offset + f.asInt.toLong))
    } yield FieldArray(t, v)
  }

  private
  def decodeDictionary(k: AtomicType, v: Type, e: ByteOrdering): State[UnmarshalState, Field] = {
    val s = List(k, v)
    decodeArray(TypeStructure(s), e)
      .map {a =>
        FieldDictionary(TypeDictionary(k, v), a.asInstanceOf[FieldArray].v collect { case av: FieldStructure => (av.v(0), av.v(1)) })
    }
  }

  private
  def decodeStructure(ts: Seq[Type], e: ByteOrdering): State[UnmarshalState, Field] =
    for {
      v <- unmarshaler(ts.toVector, e)
    } yield FieldStructure(ts.toSignature_, v)

  private
  def decodeVariant(e: ByteOrdering): State[UnmarshalState, Field] = {
    def readType: State[UnmarshalState, Type] =
      for {
        s <- decodeField(TypeSignature, e)
        st <- get[UnmarshalState]
        // _ = println(s"readType: s=$s, st=$st")
      } yield (s.asSignature.types.head)

    for {
      t <- readType
      _ <- skipPad(t.align)
      f <- decodeField(t, e)
    } yield FieldVariant(f)
  }
}
