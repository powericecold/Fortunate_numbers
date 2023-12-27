package Fortunate

import scala.collection.mutable.Set

object FortunateNumbers {
  private def primeNumbers(limit: Int): List[Int] = {
    val halfLimit = if (limit % 2 == 0) limit / 2 else 1 + limit / 2
    val composite = Array.fill(halfLimit)(false)

    var i = 1
    var p = 3
    while (i < halfLimit) {
      if (!composite(i)) {
        var a = i + p
        while (a < halfLimit) {
          composite(a) = true
          a += p
        }
      }
      i += 1
      p += 2
    }

    val primes = collection.mutable.ListBuffer[Int](2)
    i = 1
    p = 3
    while (i < halfLimit) {
      if (!composite(i)) {
        primes += p
      }
      i += 1
      p += 2
    }
    primes.toList
  }

  private def contains(list: List[Int], n: Int): Boolean = list.contains(n)

  def findFortunateNumbers(count: Int): List[Int] = {
    val primes = primeNumbers(250000000)
    val fortunates = Set[Int]()
    var primorial = 1
    var index = 0

    while (fortunates.size < count) {
      primorial *= primes(index)
      var candidate = 3
      while (!contains(primes, primorial + candidate)) {
        candidate += 2
      }
      fortunates += candidate
      index += 1
    }
    fortunates.toList.sorted
  }
}


