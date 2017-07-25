package dbus


trait DBus               //DEMO: Note Semantic highlighting
    extends dbus.Types   //DEMO: References to Traits are italicised
    with dbus.Fields     //DEMO: Use M-. to jump to the definition of a type
    with dbus.Marshal
    with dbus.Message
    with dbus.Introspect
    with dbus.DBusCodecs {
  sealed trait BusType
  case object SystemBus extends BusType  //DEMO:  objects are highlighted
  case object SessionBus extends BusType //  diffently than classes
}

object DBus extends DBus



//DEMO: The following is to show some more semantic highlighting
// class SillyExample(i: Int) {  //DEMO:  prettify-symbols-mode. Is it worth it? Not sure.
//   val aValField: String = "something"  //DEMO: valFields are bolded (my customization)
//   var scary  = 42
//   def silly(arg1: Boolean, arg2: String): Unit = { //DEMO: Highlighting for methods and arguments. Note String and Boolean are classes so aren't italicised.
//     val aLocalVal = aValField     //DEMO: A local val is the same color as a valField but not bold
//     val l = List.fill(arg2.toInt)(Random.nextInt())
//   }
// }
