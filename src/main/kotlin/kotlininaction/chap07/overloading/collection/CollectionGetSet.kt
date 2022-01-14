package kotlininaction.chap07.overloading.collection

import kotlininaction.chap07.overloading.arithmetic.Point

fun main() {
  val point = Point(10, 20)
  println("point[0] = ${point[0]}")
  println("point[1] = ${point[1]}")

  val mutablePoint = MutablePoint(10, 20)
  mutablePoint[0] = 20
  mutablePoint[1] = 40
  println("mutablePoint = $mutablePoint")
}

operator fun Point.get(index: Int): Int = when (index) {
  0 -> x
  1 -> y
  else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}

data class MutablePoint(var x: Int, var y: Int)

operator fun MutablePoint.set(index: Int, value: Int) = when (index) {
  0 -> x = value
  1 -> y = value
  else -> throw IndexOutOfBoundsException("Invalid coordinate $index")
}

/*
코틀린에서는 컬렉션에도 [] 연산자를 사용할 수 있다
이 역시 관례를 사용하고 내부적으로 get, set 메서드로 변환된다

이차원 배열을 사용하는 경우 array[0][1] 형태로 사용해야 하는데
get overloading 시, array[0, 1] 형태로도 사용 가능하다
 */