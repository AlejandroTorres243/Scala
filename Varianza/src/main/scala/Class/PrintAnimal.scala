package Class

import Varianza.contravariante

class PrintAnimal extends contravariante[Animal]{
  override def print(value: Animal): Unit =
    println("The animal's name is: " + value.name)
}
