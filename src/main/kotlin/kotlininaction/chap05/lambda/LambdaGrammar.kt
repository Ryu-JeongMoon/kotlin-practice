package kotlininaction.chap05.lambda

fun main() {
  val people = listOf(Person("Alice", 29), Person("Bob", 31))

  // 요게 정석 버전
  people.maxByOrNull({ it.age })

  // 맨 뒤에 인자가 람다 식이라면 괄호를 밖으로 빼낼 수 있다
  people.maxByOrNull() { it.age }

  // 람다가 유일한 인자면 빈 괄호도 없애도 된다
  people.maxByOrNull { it.age }

  // 두개 이상의 인자를 받을 때 named argument 활용
  people.joinToString(separator = " ", transform = { it.name })

  // 마지막 인자가 람다인 경우 괄호 밖으로 빼버림
  // 람다와 API 사용에 익숙한 경우에는 람다를 괄호 밖으로 빼서 더 간결한 코드를 사용할 수 있음
  // 익숙하지 않은 경우에는 named argument 사용해서 무슨 일을 하는지 정확히 밝혀줌, 이해 쏙쏙
  people.joinToString(separator = " ") { it.name }


}