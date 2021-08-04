package Traits

import Class.abstractor

trait RichIterator extends abstractor{
  def foreach(f: T => Unit): Unit = while (hasNext) f(next())
}
