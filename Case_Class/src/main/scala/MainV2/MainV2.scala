package MainV2

import Device.{Computer, Device, Phone}

object MainV2 extends App{

  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }

  def findPlaceToSit(piece: Furniture): String = piece match {
    case a: Couch => "Lie on the couch"
    case b: Chair => "Sit on the chair"
  }

  sealed abstract class Furniture
  case class Couch() extends Furniture
  case class Chair() extends Furniture

  println(goIdle(new Phone("Blackberry")).toString())
  println(goIdle(new Computer("Lenovoia")).toString())
  println(findPlaceToSit(new Couch()).toString())
  println(findPlaceToSit(new Chair()).toString())

}
