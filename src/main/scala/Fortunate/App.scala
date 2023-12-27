package Fortunate

object App {
  def main(args: Array[String]): Unit = {
    val fortunates = FortunateNumbers.findFortunateNumbers(8)
    println("The first 8 distinct fortunate numbers are:")
    fortunates.foreach(fortunate => print(s"$fortunate "))
  }
}


