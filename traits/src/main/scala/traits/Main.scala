package traits

object Main extends App{
  val iterator = new IntIterator(10)
  //iterator.next()  // returns 0
  iterator.next()  // returns 1
  print(iterator.toString())
}
