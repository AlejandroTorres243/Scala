package Figure

import Figure.Circle.calculateArea

import scala.math._

case class Circle(radius: Double){
  def area: Double = calculateArea(radius)
}

object Circle {
  private def calculateArea(radius: Double): Double = Pi * pow(radius, 2.0)
}