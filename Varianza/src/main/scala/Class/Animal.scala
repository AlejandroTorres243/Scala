package Class

import Varianza.covariante

abstract class Animal extends covariante{
  def name: String
}

case class Cat(name: String) extends Animal {
  override val valor: String = name
}
case class Dog(name: String) extends Animal {
  override val valor: String = name
}