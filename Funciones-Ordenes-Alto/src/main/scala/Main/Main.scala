package Main

import scala.collection.convert.ImplicitConversions.`seq AsJavaList`

object Main extends App {
  val salaries = Seq(20000, 70000, 40000)
  //val doubleSalary = (x: Int) => x * 2
  //val newSalaries = salaries.map(doubleSalary)
  val newSalaries = salaries.map(x => x * 2)
  println(newSalaries.toString())
  println(newSalaries.get(2) * 51.2)
}
