package dbus.macros

import scalaz._,Scalaz._
import dbus._,DBus._

object Macros extends MacrosCompat {

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

  def materializeDBusExportImpl[T: c.WeakTypeTag](c: Context): c.Expr[dbus.ExportedObject] = {
    import c.universe._

    val tpe = weakTypeOf[T]
    val dbusIfaces = encodeDBusInterfaces(c)(tpe)
    val expr =
      dbusIfaces map { is =>
        val ifaces = q"""List(..$is) """
        val exported = q"""new ExportedObject {
        def interfaces: List[Interface] = $ifaces
        def invoke(method: MemberName, args: Vector[Field]): Reply = { ReplyError("NotImplemented", Vector(FieldString("Not implemented")))}
    } """
        c.Expr[dbus.ExportedObject]{exported}
      }

    expr fold (s => throw new Exception(s.toList.mkString(", ")), identity)
  }

  def isDBusInterface(c: Context)(iface: c.universe.Symbol): Boolean = iface.annotations exists (_.tree.tpe =:= c.universe.typeOf[dbus.DBus.DBusInterface])

  def encodeMethods(c: Context)(ms: Iterable[c.universe.MethodSymbol]): ValidationNel[String, Iterable[c.universe.Tree]] = {
    import c.universe._
    ms.filter(_.paramLists.length == 1).map { m =>
      val mn = m.name.decodedName.toString
      val args = m.paramLists.flatten.map { a =>
        for {
          argTpe <- type2Type(c)(a.info)
          argTree = dbusType2Tree(c)(argTpe)
          argName = a.name.decodedName.toString
        } yield q"""MethodArg($argName, $argTree, ArgIn)"""
      }
      val ret =
        for {
          retTpe <- type2Type(c)(m.returnType)
          retTree = dbusType2Tree(c)(retTpe)
        } yield q"""MethodArg("", $retTree, ArgOut)"""
      val method = (args :+ ret).sequenceU.map(as => q"""Method($mn, List(..$as))""")
      method
    }.toList.sequenceU
  }

  def dropDollarEq(s: String): String = if(s.endsWith("_=")) s.substring(0, s.length-2) else s

  def encodeProperties(c: Context)(ms: Iterable[c.universe.MethodSymbol]): Iterable[c.universe.Tree] = {
    val m =
      ms.groupBy(m => dropDollarEq(m.name.decodedName.toString)).map { case (k, v) =>
        
      }

    ???
  }

  def encodeDBusInterface(c: Context)(iface: c.universe.Symbol): ValidationNel[String, List[c.universe.Tree]] = {
    import c.universe._
    if(isDBusInterface(c)(iface)) {
      val fullName = iface.fullName
      val ms = getDeclarations(c)(iface.asType.info) collect { case s: MethodSymbol if s.isPublic => s }
      val methods = encodeMethods(c)(ms)
      methods map { ms => List(q"""Interface($fullName, List(..$ms), List(), List())""") }
    } else List().successNel
  }

  private def encodeDBusInterfaces(c: Context)(tpe: c.universe.Type): ValidationNel[String, List[c.universe.Tree]] =
    tpe.baseClasses.map(encodeDBusInterface(c)(_)).sequenceU.map(_.flatten)


  def type2Type(c: Context)(t: c.universe.Type): ValidationNel[String, dbus.DBus.Type] = {
    if(t =:= c.universe.definitions.BooleanTpe) TypeBoolean.successNel
    else if(t =:= c.universe.definitions.ByteTpe) TypeWord8.successNel
    else if(t =:= c.universe.definitions.ShortTpe) TypeInt16.successNel
    else if(t =:= c.universe.definitions.IntTpe) TypeInt32.successNel
    else if(t =:= c.universe.definitions.LongTpe) TypeInt64.successNel
    else if(t =:= c.universe.definitions.DoubleTpe) TypeDouble.successNel
    else if(t =:= c.universe.definitions.StringClass.selfType) TypeString.successNel
    else s"$t is not a supported type".failureNel
  }

}
