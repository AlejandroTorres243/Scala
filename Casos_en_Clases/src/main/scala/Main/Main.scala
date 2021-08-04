package Main

import Class.{book, message}

object Main extends App {
  val frankenstein = book("978-0486282114")
  val message1 = message("guillaume@quebec.ca", "jorge@catalonia.es","?????")
  val message2 = message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message3 = message("jorge@catalonia.es", "guillaume@quebec.ca", "Com va?")
  val message4 = message("julien@bretagne.fr", "travis@washington.us", "Me zo o komz gant ma amezeg")
  val message5 = message4.copy(sender = message4.recipient, recipient = "claire@bourgogne.fr")
  println(message5.sender)  // travis@washington.us
  println(message5.recipient) // claire@bourgogne.fr
  println(message5.body)
  println(message1 == message2)
  println(message2 == message3)
  println(frankenstein.toString())
  println(message1.toString()+"/"+message1.body)
}
