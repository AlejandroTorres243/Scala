package MainV2

import ClassTupla.Ingredientes
import traitsV3.Receta

object Main extends App {
  val ingred = new Ingredientes("Chocolate")
  val ingred2 = new Ingredientes("Nuez")
  val ingred3 = new Ingredientes("Pera")

  val lista = List(ingred, ingred2, ingred3)
  val planetas = List(("Mercury", 57.9), ("Venus", 108.2), ("Earth", 149.6), ("Mars", 227.9), ("Jupiter", 778.3))
  lista.foreach(ing => println(ing.toString))
  planetas.foreach(plant => println(plant._1 + "-" + plant._2))

}
