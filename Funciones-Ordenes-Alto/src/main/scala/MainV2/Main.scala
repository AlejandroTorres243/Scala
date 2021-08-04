package MainV2

object Main extends App {
  case class WeeklyWeatherForecast(temperatures: Seq[Double]) {

    private def convertCtoF(temp: Double) = temp * 1.8 + 32

    def forecastInFahrenheit: Seq[Double] = temperatures.map(convertCtoF) // <-- passing the method convertCtoF
  }

  val temp = Seq(2.0, 7.1, 14.5)
  val x = WeeklyWeatherForecast(temp)

  println(x.toString())
  println(x.forecastInFahrenheit.toString())

}
