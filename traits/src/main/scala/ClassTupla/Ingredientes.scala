package ClassTupla

import traitsV3.Receta

class Ingredientes (val requisito: String) extends Receta{

  override val ingrediente: String = requisito

  override def toString = s"Ingredientes($ingrediente)"
}
