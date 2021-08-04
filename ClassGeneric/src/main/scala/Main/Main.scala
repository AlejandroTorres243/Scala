package Main

import Class.Stack

object Main extends App{
  val lista = new Stack[Int]
  lista.push(10)
  lista.push(20)
  lista.push(30)
  println(lista.toString())
  lista.pop()
  println(lista.toString())
  println(lista.peek)
}
