package Device

case class Computer(model: String) extends Device {

  def screenSaverOn = "Turning screen saver on..."

  def goIdle(device: Device) = device match {
    case p: Phone => p.screenOff
    case c: Computer => c.screenSaverOn
  }

}
