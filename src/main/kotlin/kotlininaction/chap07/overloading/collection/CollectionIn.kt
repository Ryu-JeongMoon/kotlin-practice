package kotlininaction.chap07.overloading.collection

import kotlininaction.chap07.overloading.arithmetic.Point

fun main() {
  val rectangle = Rectangle(Point(10, 20), Point(50, 50))
  println(Point(20, 30) in rectangle)
}

data class Rectangle(val upperLeft: Point, val lowerRight: Point)

// in 연산자는 contains 메서드와 대응된다
operator fun Rectangle.contains(p: Point): Boolean {
  return p.x in upperLeft.x until lowerRight.x && p.y in upperLeft.y until lowerRight.y
}