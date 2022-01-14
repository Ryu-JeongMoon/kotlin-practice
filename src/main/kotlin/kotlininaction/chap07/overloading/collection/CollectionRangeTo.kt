package kotlininaction.chap07.overloading.collection

import java.time.LocalDateTime

fun main() {
  val now = LocalDateTime.now()
  val vacation = now..now.plusDays(10)
  println(now.plusWeeks(1) in vacation)

  // .. 연산자는 우선순위가 낮기 때문에 우선적으로 사용해야 할 경우 괄호로 감싸준다
  (0..10).forEach { println(it) }
}


/*
.. 연산자를 이용해 범위를 만드는데
Comparable 을 구현한 클래스라면 제네릭을 이용한 메서드가 있으므로 추가 정의해줄 필요 없다
 */