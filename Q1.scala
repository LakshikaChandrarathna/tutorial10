object Q1 {
  def main(args: Array[String]): Unit = {
    val temperatures = List(0, 10, 20, 30)
    val averageFahrenheit = calculateAverage(temperatures)
    println(s"Average Fahrenheit temperature: $averageFahrenheit")
  }

  def calculateAverage(temperatures: List[Int]): Double = {
    val fahrenheitTemperatures = temperatures.map(celsiusToFahrenheit)
    val sumOfTemperatures = fahrenheitTemperatures.reduce(_ + _)
    val averageFahrenheit = sumOfTemperatures.toDouble / fahrenheitTemperatures.length
    averageFahrenheit
  }

  def celsiusToFahrenheit(celsius: Int): Double = {
    (celsius * 9 / 5) + 32
  }

}
