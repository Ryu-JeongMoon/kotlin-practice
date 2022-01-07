package kotlininaction.chap02

fun main() {
  println(max(5, 9))
  println(simpleMax(9, 5))

  println(isSimpleMax(5, 9))
}

// 블록이 본문인 함수
fun max(number: Int, comparison: Int): Int {
  return if (number > comparison) number else comparison
}

// 블록 본문 함수에서는 반환값 생략할 수 없다?!
fun isMax(number: Int, comparison: Int): Boolean {
  return number > comparison
}

// 식이 본문인 함수
fun simpleMax(number: Int, comparison: Int) = if (number > comparison) number else comparison

// 식 본문 함수에서는 반환 값 생략할 수 있다?!
fun isSimpleMax(number: Int, comparison: Int) = number > comparison


/*
statement & expression
자바에서는 모든 제어 구조가 statement 인데 코틀린에서는 루프를 제외하면 거의 expression
expression 은 값을 만들어낼 수 있고 statement 는 그렇지 못 하다

그럼 왜 코틀린에서는 제어 구조를 식으로 표현하는가
- 그것이 더 간결하기 때문!

블록 본문 함수에서 반환값 명시해야 하는 이유가 무엇인가
- 코틀린 설계자의 의도적인 설계로써 블록 내부에서는 return 문이 여러개일 수 있으므로 어떤 값이 반환되는지 쉽게 파악하기 위함
 */