package kkang.chap04

import java.util.stream.IntStream

var a = 1

var s1 = "a is $a"

fun conversion(): Unit {
  a = 2
  var s2 = "${s1.replace("is", "was")}, but now is $a"

  println(s2)
  println(maxOf(5, 6))
  println(describe(1L))

  for (x in 1..5) {
    println(x)
  }

  println(s)
}

fun main(args: Array<String>) {
  conversion()
}

fun maxOf(a: Int, b: Int) = if (a > b) a else b

// 오호,, 삼항연산자가 없구만 ??
// kotlin 에서는 if else 문 자체가 식으로 사용될 수 있기 때문에 삼항 연산자를 쓸 필요가 없어서 없당!
// fun maxOf2(a: Int, b: Int) = (a > b) ? a : b


// is 로 타입 체크하는 순간 auto-casting
fun getStringLength(obj: Any): Int? {
  if (obj is String)
    return obj.length

  return null
}


// break 없어도 되는구만?!
fun describe(obj: Any): String {
  return when (obj) {
    0, 1, 2 -> "One"
    "hello" -> "String"
    is Long -> "Long"
    !is String -> "Not a String"
    else -> "Unknown"
  }
}

val s = """
  YAHO
  HELLO
  WORLD
""".trimIndent()