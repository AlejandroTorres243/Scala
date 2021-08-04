package Main

import Class.{Animal, Cat, Dog, PrintAnimal}
import Varianza.contravariante

object Main extends App{

  def printAnimalNames(animals: List[Animal]): Unit =
    animals.foreach {
      animal => println(animal.name)
    }

  def printMyCat(printer: contravariante[Cat], cat: Cat): Unit =
    printer.print(cat)

  val cats: List[Animal] = List(Cat("PrS"), Cat("Tom"))
  val dogs: List[Dog] = List(Dog("SPQ"), Dog("Rex"))

  val catPrinter: contravariante[Cat] = new PrintAnimal
  val animalPrinter: contravariante[Animal] = new PrintAnimal

  printAnimalNames(cats)
  printAnimalNames(dogs)

  printMyCat(catPrinter, Cat("Boots"))
  printMyCat(animalPrinter, Cat("Boots"))

}
