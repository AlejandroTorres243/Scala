package Main

object Main extends App{
  val numbers = List(1, 2, 3, 4, 5, 6, 7, 8, 9, 10)
  val res = numbers.foldLeft(0)((m, n) => m + n)
  println(res)

  val numbers2 = List(24, 12, 35, 42, 59, 66, 79, 84, 97, 105)
  val numberFunc = numbers2.foldLeft(List[Int]()) _

  val squares = numberFunc((xs, x) => xs :+ x*x)
  println(squares) // List(1, 4, 9, 16, 25, 36, 49, 64, 81, 100)

  val cubes = numberFunc((xs, x) => xs :+ x*x*x)
  println(cubes)  // List(1, 8, 27, 64, 125, 216, 343, 512, 729, 1000)

}
