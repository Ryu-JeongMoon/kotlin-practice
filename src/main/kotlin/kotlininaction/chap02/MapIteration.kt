package kotlininaction.chap02

import java.util.*

fun main() {
  val binaryReps = TreeMap<Char, String>()

  for (c in 'A'..'F') {
    // c.toInt() deprecated -> c.code 사용
    val binary = Integer.toBinaryString(c.code)
    binaryReps[c] = binary
  }

  for ((letter, binary) in binaryReps)
    println("$letter = $binary")

  val list = arrayListOf("10", "11", "1001")
  for((index, element) in list.withIndex())
    println("$index = $element")

  val set = setOf(5, 9, 10, 1, 4)
  for((index, element) in set.withIndex())
    println("$index = $element")
}


/*
get, put 대신 map['key'] = 'value' 형태로 사용
자바보다 파이썬 같은 느낌이 나는걸?!
 */