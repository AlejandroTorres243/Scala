package Class

class Snake {

  private val x: Int = 4;
  private val y: Int = 3;

  def boarder(x: Int, y: Int){
    //print("valor de x:"+x+"/valor de y:"+y)
    for(contx <- 0 to x){
      print("*");
      for(conty <- 0 to y){
        print("*");
      }
    }
  }

  def start(): Unit ={
     boarder(x, y);
  }

}
