package Main

import Class.{Cat, Pet}
import traitsV2.Mascota

import scala.collection.mutable.ArrayBuffer

object Main extends App {
  val dog = new Pet("Harry")
  val cat = new Cat("Sally")

  val animals = ArrayBuffer.empty[Mascota]
  animals.append(dog)
  animals.append(cat)
  animals.append(new Cat("Fx1"))
  animals.append(new Pet("pastor aleman"))

  animals.foreach(Mascota => println(Mascota.name))

}
