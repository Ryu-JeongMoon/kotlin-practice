package kotlininaction.chap07.overloading.comparison

fun main() {

}

/*
코틀린에서 == 연산자는 내부적으로 equals 호출한다
!= 는 코틀린 컴파일러가 equals 에 값을 반전시켜서 돌려준다, 똑똑이놈
a == b 수행 시에 기본적으로 a 에 대한 null check 들어간다
a?.equals(b) ?: (b == null), a가 null 일때 b도 null 이어야 true

Point -> data class 선언 시 equals 만들어주지만, 직접 구현한다면 아래와 같은 모습
override fun equals(other: Any?): Boolean {
  if (other === this) return true
  if (other !is Point) return false
  return other.x == x && other.y == y
}
=== identity equals, 식별자 비교 연산자
자바의 == 연산자와 같은 기능을 수행하고 equals 구현 시에 최적화 용도로 많이 구현한다고 함
 */