package Clases

class Point(var _x: Int = 0, var _y: Int = 0) {

    //Variable
 /*   private var _x = 0
    private var _y = 0
    private val bound = 100*/

    //Constructor
    //class Point(var x: Int = 0, var y: Int = 0)
    //class Point(var x: Int, var y: Int)

    //SETTER
    def x: Int = _x

    def y: Int = _y

//    def x_= (newValue: Int): Unit = {
//      if (newValue < bound) _x = newValue else printWarning
//    }

    //Metodo
    def move(dx: Int, dy: Int): Unit = {
      _x = _x + dx
      _y = _y + dy
    }

  override def toString: String = super.toString

}