package Class

import scala.util.matching.Regex

class Autentifica (var data: String){
  val numberPattern: Regex = "[0-9]".r
  var value: String = ""

  numberPattern.findFirstMatchIn(data) match {
    case Some(_) => value = "Password OK"
    case None => value = "Password must contain a number"
  }


  override def toString = s"Autentifica($value)"
}
