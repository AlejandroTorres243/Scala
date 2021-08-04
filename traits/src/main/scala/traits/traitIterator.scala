package traits

trait traitIterator [A] {
  def hasNext: Boolean
  def next(): A
}
