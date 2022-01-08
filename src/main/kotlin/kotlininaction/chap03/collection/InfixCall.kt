package kotlininaction.chap03.collection

fun main() {
  val map = mapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

  // to 는 키워드가 아니다
  // infix call, 중위 호출이라는 특별한 방식으로 to method 를 호출한 것이다
  2 to "Two"

  // number, name 에다가 Pair(1, "One) 값으로 초기화했는데
  // 이를 destructuring declaration 이라 한다
  val (number, name) = 1 to "One"
  println(number)
  println(name)
}


/*
infix call 을 위해서는 메서드 선언 시 infix 키워드 붙여야 한다
to 의 선언부
infix fun Any.to(other: Any) = Pair(this, other)

Pair 는 코틀린 표준 라이브러리 클래스, 키-값 쌍을 반환한다

별걸 다 지원해주는구만?
자바스크립트 같기도 허고 파이썬 같기도 허고
 */