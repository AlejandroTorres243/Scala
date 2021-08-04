package Class

class matchTest (var x: Int){
  def matchTest(x: Int): String = x match {
    case 1 => "one"
    case 2 => "two"
    case 3 => "three"
    case 4 => "four"
    case _ => "other"
  }
}
