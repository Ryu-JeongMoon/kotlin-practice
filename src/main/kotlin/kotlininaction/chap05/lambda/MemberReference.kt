package kotlininaction.chap05.lambda

fun main() {
  val getAge = Person::age

  // 최상위 함수도 참조할 수 있다, 이 때 클래스 자리는 비워둔다
  run(::salute)
}

fun salute() = println("Salute!")

/*
람다를 사용하면 코드 블록을 다른 함수의 인자로 넘길 수 있다
이 때 코드 블록이 함수로 선언되어 있다면 어떻게 하는가

이중 콜론(::)을 사용해 넘긴다
자바에서는 메서드 참조라 불렀지만 코틀린에서는 멤버 참조라 부른다
멤버 참조는 이를 호출하는 람다와 같은 타입이다
x -> f(x), f(x) -> x 이러한 변환을 eta conversion 이라 한다
 */