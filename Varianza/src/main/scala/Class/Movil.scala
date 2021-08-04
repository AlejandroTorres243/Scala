package Class

import Varianza.contravariante

class Movil extends contravariante[Animal]{
  override def print(value: Animal): Unit =
    println("The movil animal's name is: " + value.name)
}
