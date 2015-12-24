package dbus.macros

import scalaz._,Scalaz._
import dbus._,DBus._

object Macros extends MacrosCompat {

  def fubar[T: c.WeakTypeTag](c: Context): c.Expr[Option[T]] = {
    import c.universe._

    val tpe = weakTypeOf[T]
    val expr = q"""(Option(1) |@| Option("One"))((${createTermName(c)(tpe.toString)}).apply)"""

    c.Expr[Option[T]]{expr}
  }

    def materializeDBusExportImpl[T: c.WeakTypeTag](c: Context): c.Expr[T => dbus.ExportedObject] = {
    import c.universe._

    val tpe = weakTypeOf[T]
    val dbusIfaces = encodeDBusInterfaces(c)(tpe)
    val invokers = encodeInvokers(c)(tpe)
    val expr =
      (dbusIfaces |@| invokers) { case (is, (ivs, ls, ivms)) =>
        // val ifaces = q"""List(..$is) """
        val exported =
          q"""(underlying: $tpe) => new ExportedObject {
            def interfaces: List[Interface] = List(..$is)
            type MethodInvoker = collection.Seq[Field] => Reply
            case class Invoker(interface: InterfaceName, invoker: MethodInvoker)
            val invokers = Map[MemberName, List[Invoker]](
              ..$ivs
            )

            ..$ls

            def invoke(method: MemberName, interface: Option[InterfaceName], args: collection.Seq[Field]): Reply = {
              val is = invokers getOrElse(method, List.empty[Invoker]) filter { i => interface.isEmpty || interface.contains(i.interface) }
              is match {
                case h :: Nil => h.invoker(args)
                case h :: t   => ReplyError("org.freedesktop.dbus.Error", Vector(FieldString(s"Ambiguous method")))
                case Nil      => ReplyError("org.freedesktop.dbus.Error", Vector(FieldString(s"Unknown method")))
              }
            }
            ..$ivms
          }"""
        c.Expr[T => dbus.ExportedObject]{exported}
      }

    expr fold (s => throw new Exception(s.toList.mkString(", ")), identity)
  }

  def materializeDBusCodecImpl[T: c.WeakTypeTag](c: Context): c.Expr[DBusCodec[T]] = {
    import c.universe._

    val tpe = weakTypeOf[T]
    val args = getConstructorArgs(c)(tpe)
    val encodeFields =
      args map { case (n, t) =>
        val fieldName = createTermName(c)(n)
        q"""implicitly[DBusCodec[$t]].encode(t.$fieldName)"""
      }
    val decodeFields =
      (args zip Stream.from(0))
        .map { case ((n, t), i) => q"""implicitly[DBusCodec[$t]].decode(v($i)).validation.toValidationNel""" }
        .map { _.asInstanceOf[Tree] }
        .reduce { (a, b) => q"""$a |@| $b""" }

    val ctorArgs =
      args map { case (n, t) =>
        val name = createTermName(c)(n)
        q"$name : $t"
      }

    val ctorParams = args map { case (n, _) =>
      val name = createTermName(c)(n)
      q"$name"
    }

    val expr =
      q"""new DBusCodec[$tpe] {
        import FieldOps._
        def encode(t: $tpe): String \/ Field = {
          Vector(..$encodeFields)
            .sequenceU
            .map(fs => FieldStructure(fs.toSignature_, fs))
        }
        def decode(f: Field): String \/ $tpe =
          f match {
            case FieldStructure(s, v) =>
              ($decodeFields((..$ctorArgs) => new $tpe(..$ctorParams))).disjunction.leftMap(_.toString)
            case _ => s"Field $$f is not a Structure".left
          }
      } """
    c.Expr[DBusCodec[T]]{expr}
  }

  def encodeInvokers(c: Context)(tpe: c.universe.Type): ValidationNel[String, (List[c.universe.Tree], List[c.universe.Tree], List[c.universe.Tree])] = {
    import c.universe._
    def isNormalMethod(m: MethodSymbol): Boolean = m.isPublic && m.paramLists.length == 1 && !m.isConstructor && !m.isSetter
    def invokeMethodName(iface: String, name: TermName): String = s"${iface.replace('.', '_')}_${name.decodedName}"
    def liftedMethodName(iface: String, name: TermName): String = s"${iface.replace('.', '_')}_lifted_${name.decodedName}"

    val methods =
      tpe.baseClasses
        .filter(isDBusInterface(c)(_))
        .flatMap { iface =>
          val fullName = iface.fullName
          val ms = getDeclarations(c)(iface.asType.info) collect { case s: MethodSymbol if isNormalMethod(s) => s }
          ms map { m => (fullName, m) }
        }

    val liftedMethods = methods
      .map { case (i, m) =>
        val methodName = createTermName(c)(m.name.decodedName.toString)
        val liftedMethod = createTermName(c)(liftedMethodName(i, m.name))
        q"""def $liftedMethod = Applicative[({type E[A] = \/[String,A]})#E].lift(underlying.$methodName _)"""
      }.successNel[String]

    val invokeMethods = methods
      .map { case (i, m) =>
        val invokeMethod = createTermName(c)(invokeMethodName(i, m.name))
        val liftedMethod = createTermName(c)(liftedMethodName(i, m.name))
        val methodName = createTermName(c)(m.name.decodedName.toString)
        val returnType = m.returnType
        val params = m.paramLists.flatten zip Stream.from(0)
        val args =
          params.map { case (a, n) =>
            val tpe = a.info
            (q"""implicitly[DBusCodec[$tpe]].decode(args($n))""").successNel[String]
          }.sequenceU

        args.map { aa =>
          q"""def $invokeMethod(args: collection.Seq[Field]): Reply =
                try {
                  $liftedMethod(..$aa)
                    .flatMap { r => implicitly[DBusCodec[$returnType]].encode(r) }
                    .fold(e => ReplyError("InternalError", Vector(FieldString(e))), r => ReplyReturn(Vector(r)))
                } catch {
                  case util.control.NonFatal(t) => ReplyError(t.getClass.getName, Vector(FieldString(t.getMessage)))
                }
           """
        }
    }.sequenceU


    val invokers = methods
      .groupBy { case(i, m) => m.name }
      .toList
      .map { case (name, ms) =>
        val methodName = name.decodedName.toString
        val invkrs = ms.map { m =>
          val iface = m._1
          val invokeMethod = createTermName(c)(invokeMethodName(iface, name))
          q"""Invoker(InterfaceName($iface), $invokeMethod)"""
        }
        q"""MemberName($methodName) -> List(..$invkrs)"""
      }.successNel[String]

    (invokers |@| liftedMethods |@| invokeMethods)((_, _ , _))
  }

  def isDBusInterface(c: Context)(iface: c.universe.Symbol): Boolean = iface.annotations exists (_.tree.tpe =:= c.universe.typeOf[dbus.DBus.DBusInterface])

  def encodeMethods(c: Context)(ms: Iterable[c.universe.MethodSymbol]): ValidationNel[String, Iterable[c.universe.Tree]] = {
    import c.universe._
    ms.filter(m => m.paramLists.length == 1  && !m.isConstructor && !m.isSetter).map { m =>
      val mn = m.name.decodedName.toString
      val args = m.paramLists.flatten.map { a =>
        val maybeArg =
          for {
            argTpe <- type2DBusType(c)(a.info)
            argTree = dbusType2Tree(c)(argTpe)
            argName = a.name.decodedName.toString
          } yield q"""MethodArg($argName, $argTree, ArgIn)"""
        maybeArg leftMap {fs => fs.map{f => s"MethodArg ${a.name.decodedName}:  $f}"} }
      }
      val maybeRet =
        for {
          retTpe <- type2DBusType(c)(m.returnType)
          retTree = dbusType2Tree(c)(retTpe)
        } yield q"""MethodArg("", $retTree, ArgOut)"""
      val ret = maybeRet leftMap { fs => fs.map(f => s"$mn return value:  $f")}
      val method = (args :+ ret).sequenceU.map(as => q"""Method($mn, List(..$as))""")
      method
    }.toList.sequenceU
  }

  def encodeProperties(c: Context)(ms: Iterable[c.universe.MethodSymbol]): ValidationNel[String, Iterable[c.universe.Tree]] = {
    import c.universe._
    ms.filter(_.isGetter)
      .map { m => (m.name.decodedName.toString, type2DBusType(c)(m.returnType), m.setter != c.universe.NoSymbol) }
      .map {
        case (n, Success(t), true) =>
          val tree = dbusType2Tree(c)(t)
          q"""Property($n, $tree, PropReadWrite)""".success
        case (n, Success(t), false) =>
          val tree = dbusType2Tree(c)(t)
          q"""Property($n, $tree, PropRead)""".success
        case (n, Failure(ee), _) => Failure(ee.map(e => s"Property $n:  $e"))
    }.toList.sequenceU
  }

  def encodeDBusInterface(c: Context)(iface: c.universe.Symbol): ValidationNel[String, List[c.universe.Tree]] = {
    import c.universe._
    if(isDBusInterface(c)(iface)) {
      val fullName = iface.fullName
      val ms = getDeclarations(c)(iface.asType.info) collect { case s: MethodSymbol if s.isPublic => s }
      val methods = encodeMethods(c)(ms)
      val properties = encodeProperties(c)(ms)
      (methods |@| properties)((ms, ps) => List(q"""Interface($fullName, List(..$ms), List(), List(..$ps))"""))
    } else List().successNel
  }

  private def encodeDBusInterfaces(c: Context)(tpe: c.universe.Type): ValidationNel[String, List[c.universe.Tree]] =
    tpe.baseClasses.map(encodeDBusInterface(c)(_)).sequenceU.map(_.flatten)

  def isList(c: Context)(t: c.universe.Type): Boolean =
    t.baseClasses map(_.fullName) exists(n => n == "scala.collection.immutable.Seq" || n == "scala.collection.mutable.Seq" || n == "scala.Array")

  def getListType(c: Context)(t: c.universe.Type): NonEmptyList[String] \/ ValidationNel[String, Type] =
    t.typeArgs match {
      case a :: Nil => type2DBusType(c)(a).right
      case _        => NonEmptyList("Wrong number of type arguments for List").left
    }

  def makeListType(t: ValidationNel[String, Type]): ValidationNel[String, Type] =
    t.map(TypeArray.apply(_))

  def isMap(c: Context)(t: c.universe.Type): Boolean =
    t.baseClasses map(_.fullName) exists(n => n == "scala.collection.immutable.Map" || n == "scala.collection.mutable.Map")

  def getMapTypes(c: Context)(t: c.universe.Type): NonEmptyList[String] \/ (ValidationNel[String, AtomicType], ValidationNel[String, Type]) =
    t.typeArgs match {
      case k :: v :: _ => (type2AtomicType(c)(k), type2DBusType(c)(v)).right
      case _           => NonEmptyList("Wrong number of type arguments for Map").left
    }

  def makeMapType(kt: ValidationNel[String, AtomicType], vt: ValidationNel[String, Type]): ValidationNel[String, Type] =
    (kt |@| vt)(TypeDictionary.apply(_, _))

  def getConstructorArgs(c: Context)(t: c.universe.Type): List[(String, c.universe.Type)] = {
    import c.universe._
    getDeclarations(c)(t)
      .collect { case s: MethodSymbol if s.isPrimaryConstructor && s.paramLists.length == 1 => s}
      .map { _.typeSignatureIn(t).paramLists.flatten }
      .flatten
      .map{ t => (t.name.toString, t.info) }
      .toList
  }

  def getConstructorArgsTypes(c: Context)(t: c.universe.Type): ValidationNel[String, List[Type]] = {
    import c.universe._
    getDeclarations(c)(t)
      .collect { case s: MethodSymbol if s.isPrimaryConstructor && s.paramLists.length == 1 => s}
      .map { _.typeSignatureIn(t).paramLists.flatten }
      .flatten
      .map{ t => type2DBusType(c)(t.info) }
      .toList
      .sequenceU
  }

  def isProductType(c: Context)(t: c.universe.Type): Boolean =
    t.baseClasses map(_.fullName) exists(n => n == "scala.Product")

  def makeStructureType(ts: ValidationNel[String, List[Type]]): ValidationNel[String, Type] =
    ts.map(TypeStructure(_))

  def type2DBusType(c: Context)(t: c.universe.Type): ValidationNel[String, dbus.DBus.Type] = {
    if(t =:= c.universe.definitions.BooleanTpe) TypeBoolean.successNel
    else if(t =:= c.universe.definitions.ByteTpe) TypeWord8.successNel
    else if(t =:= c.universe.definitions.ShortTpe) TypeInt16.successNel
    else if(t =:= c.universe.definitions.IntTpe) TypeInt32.successNel
    else if(t =:= c.universe.definitions.LongTpe) TypeInt64.successNel
    else if(t =:= c.universe.definitions.DoubleTpe) TypeDouble.successNel
    else if(t =:= c.universe.definitions.StringClass.selfType) TypeString.successNel
    else if(isList(c)(t)) getListType(c)(t).map { makeListType(_) } fold(Failure(_), identity)
    else if(isMap(c)(t)) getMapTypes(c)(t).map { (makeMapType _).tupled(_) } fold (Failure(_), identity)
    else if(isProductType(c)(t)) makeStructureType(getConstructorArgsTypes(c)(t))
    else s"$t is not a supported Type".failureNel
  }

  def type2AtomicType(c: Context)(t: c.universe.Type): ValidationNel[String, dbus.DBus.AtomicType] = {
    if(t =:= c.universe.definitions.BooleanTpe) TypeBoolean.successNel
    else if(t =:= c.universe.definitions.ByteTpe) TypeWord8.successNel
    else if(t =:= c.universe.definitions.ShortTpe) TypeInt16.successNel
    else if(t =:= c.universe.definitions.IntTpe) TypeInt32.successNel
    else if(t =:= c.universe.definitions.LongTpe) TypeInt64.successNel
    else if(t =:= c.universe.definitions.DoubleTpe) TypeDouble.successNel
    else if(t =:= c.universe.definitions.StringClass.selfType) TypeString.successNel
    else s"$t is not a supported AtomicType".failureNel
  }

  def dbusType2Tree(c: Context)(t: dbus.DBus.Type): c.universe.Tree = {
    import c.universe._
    t match {
      case TypeBoolean    => q"TypeBoolean"
      case TypeWord8      => q"TypeWord8"
      case TypeWord16     => q"TypeWord16"
      case TypeWord32     => q"TypeWord32"
      case TypeWord64     => q"TypeWord64"
      case TypeInt16      => q"TypeInt16"
      case TypeInt32      => q"TypeInt32"
      case TypeInt64      => q"TypeInt64"
      case TypeDouble     => q"TypeDouble"
      case TypeString     => q"TypeString"
      case TypeUnixFD     => q"TypeUnixFD"
      case TypeSignature  => q"TypeSignature"
      case TypeObjectPath => q"TypeObjectPath"
      case TypeVariant    => q"TypeVariant"
      case TypeArray(a)   =>
        val atree = (dbusType2Tree(c)(a))
        q"TypeArray($atree)"
      case TypeDictionary(k, v) =>
        val ktree = (dbusType2Tree(c)(k))
        val vtree = (dbusType2Tree(c)(v))
        q"TypeDictionary($ktree, $vtree)"
      case TypeStructure(ts) =>
        val tsTree = ts map (dbusType2Tree(c)(_))
        q"TypeStructure(List(..$tsTree))"
    }
  }

  def dbusType2Value(c: Context)(t: dbus.DBus.Type): c.universe.TermName = {
    t match {
      case TypeBoolean    => createTermName(c)("asBoolean")
      case TypeWord8      => createTermName((c))("asByte")
      case TypeWord16     => createTermName((c))("asShort")
      case TypeWord32     => createTermName((c))("asInt")
      case TypeWord64     => createTermName((c))("asLong")
      case TypeInt16      => createTermName((c))("asShort")
      case TypeInt32      => createTermName((c))("asInt")
      case TypeInt64      => createTermName((c))("asLong")
      case TypeDouble     => createTermName((c))("asDouble")
      case TypeString     => createTermName((c))("asString")
      case TypeUnixFD     => createTermName((c))("asInt")
      case TypeSignature  => createTermName((c))("asSignature")
      case TypeObjectPath => createTermName((c))("asObjectPath")
      case TypeVariant    => ???
      case TypeArray(a)   => createTermName((c))("asArray")
      case TypeDictionary(k, v) => createTermName(c)("asMap")
      case TypeStructure(ts) => ???
    }
  }
}
