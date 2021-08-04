package MainV3

import Object.SalaryRaiser

object MainV3 extends App{
  val list = List(1254.1, 325.0, 500.98, 145.54)
  println(SalaryRaiser.smallPromotion(list).toString())
  println(SalaryRaiser.hugePromotion(list).toString())
}
