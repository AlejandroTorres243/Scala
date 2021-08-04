package MainV2

import scala.util.Random

object MainV2 extends App {
  val x: Int = Random.nextInt(10)

  x match {
    case 0 => print("zero")
    case 1 => print("one")
    case 2 => print("two")
    case _ => print("other")
  }

}
