package Main

import Class.Autentifica

import scala.util.matching.Regex

object Main extends App{

  val numberPattern: Regex = "[0-9]".r
  val value = new Autentifica("jasdfsdghfjkd")

  numberPattern.findFirstMatchIn("1234") match {
    case Some(_) => println("Password OK")
    case None => println("Password must contain a number")
  }

  println(value.toString())
  println(numberPattern.toString())

}
