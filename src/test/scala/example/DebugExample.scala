package example

object DebugExample extends App {
  def someFunc(arg: Int): String = {
    val x = arg * 2
    x.toString
  }

  val s = "This is a string"
  val capS = s.toUpperCase
  val x = 42
  val y = someFunc(x)
}
