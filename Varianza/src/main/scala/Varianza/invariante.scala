package Varianza

class invariante[A](value: A) {
  private var _value: A = value

  def getValue: A = _value

  def setValue(value: A): Unit = {
    _value = value
  }
}
