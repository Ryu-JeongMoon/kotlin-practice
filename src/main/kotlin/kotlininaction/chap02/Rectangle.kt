package kotlininaction.chap02

import java.util.*

class Rectangle(val height: Int, val width: Int) {
  val isSquare: Boolean
    get() {
      return height == width
    }
}

fun main() {
  val rectangle = Rectangle(5, 5)
  println(rectangle.width)
  println(rectangle.height)
  println(rectangle.isSquare)

  val random = Random()
  val nextInt = random.nextInt(5)
  println("nextInt = $nextInt")
}

/*
코틀린에서는 일종의 가상 패키지로써 패키지 명을 다르게 선언하더라도 컴파일에 아무 이상 없다
그러나 자바와 함께 사용하는 환경이라면 자바의 설정을 따르는 것이 낫다
Java -> Kotlin migration 상황에서 문제 발생할 수도
 */