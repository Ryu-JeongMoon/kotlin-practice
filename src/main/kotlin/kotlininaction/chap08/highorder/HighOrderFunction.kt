package kotlininaction.chap08.highorder

fun main() {
  val sum = { x: Int, y: Int -> x + y }
  val typeSum: (Int, Int) -> Int = { x, y -> x + y }

  // Unit 은 FP 에서 고전적으로 '값이 단 하나인 반환 타입'을 의미하는 타입
  // 코틀린에서는 반환 타입이 의미 있는 값을 반환하지 않는 함수 타입인 경우 사용, 이 때는 반드시 명시해주어야 함
  val action = { println(42) }
  val typeAction: () -> Unit = { println(42) }

  // 왜 언더바(_)로 이름을 바꾸라는 것일까?, parameter 사용하지 않는 경우 뜨나?
  var canReturnOrNull: (Int, Int) -> Int? = { x, y -> null }

  // 위에 놈은 반환 타입이 null 일 수 있는 것이지만 요놈은 함수 자체가 null 일 수도 있음을 의미함
  var funOrNull: ((Int, Int) -> Int)? = null

  val url = "https://kotl.in"

  // 함수 선언 시 선언했던 parameter 이름대로 사용해도 되고 다르게 해도 된다
  // 기존 이름을 사용하면 가독성도 좋고 IDE 가 자동완성도 해주기 때문에 웬만하면 맞춰서 사용하도록 하자
  performRequest(url) { code, content -> println("YAHOO2") }
  performRequest(url) { content, code -> println("YAHOO2") }
}

fun performRequest(url: String, callback: (code: Int, content: String) -> Unit) {
  println("YAHOO")
}

/*
고차 함수란 다른 함수를 인자로 받거나 반환하는 함수를 의미한다

함수 타입
람다를 인자로 받으려면 람다 인자의 타입을 지정해줘야 한다
 */