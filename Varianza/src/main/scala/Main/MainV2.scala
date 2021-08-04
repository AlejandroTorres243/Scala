package Main

import Class.{Animal, Cat, Dog}
import Varianza.invariante

object MainV2 extends App {
  val catContainer: invariante[Cat] = new invariante(Cat("Felix"))
  val animalContainer: invariante[Animal] = catContainer
  animalContainer.setValue(Dog("Spot"))
  val cat: Cat = catContainer.getValue // Oops, we'd end up with a Dog assigned to a Cat

}
