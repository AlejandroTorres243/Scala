package Class

import Varianza.invariante

abstract class Vehiculo(val marca: String) extends invariante[Animal]{
  def print(cat: Cat): Unit =
    println("The cat's name is: " + cat.name)
}
