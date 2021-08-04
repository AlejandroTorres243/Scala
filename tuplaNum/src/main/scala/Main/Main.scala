package Main

object Main extends App {
  val numPairs = List((2, 5), (3, -8), (20, 56))
  for ((a, b) <- numPairs) {
    println(a * b)
  }
}
