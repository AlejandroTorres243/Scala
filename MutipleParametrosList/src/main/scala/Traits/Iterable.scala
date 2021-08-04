package Traits

import Main.Main.numbers

trait Iterable [A]{
  def foldLeft[B](z: B)(op: (B, A) => B): B
  def foldLeft1[A, B](as: List[A], b0: B, op: (B, A) => B) = ???
  def foldLeft2[A, B](as: List[A], b0: B)(op: (B, A) => B) = ???
  def possible = foldLeft2(numbers, 0)(_ + _)
  def firstWay = foldLeft1[Int, Int](numbers, 0, _ + _)
  def secondWay = foldLeft1(numbers, 0, (a: Int, b: Int) => a + b)
  def execute(arg: Int)(implicit ec: scala.concurrent.ExecutionContext) = ???
}
