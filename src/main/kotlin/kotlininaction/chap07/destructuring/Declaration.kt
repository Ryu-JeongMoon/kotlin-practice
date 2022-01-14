package kotlininaction.chap07.destructuring

import kotlininaction.chap07.overloading.arithmetic.Point

fun main() {
  val (x, y) = Point(10, 20)
  println("x = $x, y = $y")

  val (name, extension) = splitFileName("example.kt")
  println("name = $name, extension = $extension")

  printEntries(mapOf(Pair("panda", "bear"), Pair("yaho", "ohya")))
}

data class NameComponents(val name: String, val extension: String)

fun splitFileName(fullName: String): NameComponents {
  val (name, extension) = fullName.split('.', limit = 2)
  return NameComponents(name, extension)
}

fun printEntries(map: Map<String, String>) {
  for ((key, value) in map)
    println("$key -> $value")
}

/*
data class 를 이용하면 destructuring declaration 도 쓸 수 있다
변수 초기화 시 나눠서 하지 않고 한번에 여러 변수를 초기화하는 것인데
내부적으로 componentN() 메서드를 호출한다

아래와 같이 생성되며 N 은 parameter 위치에 따라 자동 생성된다
data class Point(val x: Int, val y: Int) {
  operator fun component1() = x
  operator fun component2() = y
}

무한정 componentN 을 쓰는 것은 비효율적이므로 코틀린 표준 라이브러리에서는 처음 5개에 대한 componentN 을 제공한다
 */