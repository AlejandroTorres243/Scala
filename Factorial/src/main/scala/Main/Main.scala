package Main

import Factorial.Factorial

object Main extends App {
  val factorial = new Factorial(8)
  print(factorial.factorial(8).toString())
}
