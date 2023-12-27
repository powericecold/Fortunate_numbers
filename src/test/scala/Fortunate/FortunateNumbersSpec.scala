package Fortunate

import org.scalatest.flatspec.AnyFlatSpec

class FortunateNumbersSpec extends AnyFlatSpec {
  "FortunateNumbers" should "return the first 8 Fortunate numbers" in {
    val numbers = FortunateNumbers.findFortunateNumbers(8)
    val expectedNumbers = List(3, 5, 7, 13, 17, 19, 23, 37)
    assert(numbers == expectedNumbers)
  }
}
