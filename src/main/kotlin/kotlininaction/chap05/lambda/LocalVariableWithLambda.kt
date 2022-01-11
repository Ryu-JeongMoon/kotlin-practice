package kotlininaction.chap05.lambda

fun main() {
  val errors = listOf("403 Forbidden", "404 Not Found")
  printMessageWithPrefix(errors, "Error:")

  val responses = listOf("200 Ok", "418 I'm a teapot", "500 Internal Server Error")
  printProblemCounts(responses)
}

fun printMessageWithPrefix(messages: Collection<String>, prefix: String) {
  messages.forEach {
    // 람다 안에서 함수의 로컬 변수, prefix 사용한다
    println("$prefix $it")
  }
}

fun printProblemCounts(responses: Collection<String>) {
  var clientErrors = 0
  var serverErrors = 0

  // val 이 아닌 값에 대해 접근할 수 있고 변경도 가능하다?!
  // 람다 안에서 사용하는 외부 변수를 람다가 capture, 포획한 변수라 한다
  responses.forEach {
    if (it.startsWith("4"))
      clientErrors++
    else if (it.startsWith("5"))
      serverErrors++
  }

  println("$clientErrors client errors, $serverErrors server errors")
}


/*
람다를 실행 시점에 표현하는 데이터 구조는 람다에서 시작하는 모든 참조가 포함된 닫힌 객체 그래프를 람다 코드와 함께 저장한다
이러한 데이터 구조를 closure 라 한다
함수를 1급 시민으로 만드려면 포획한 변수를 제대로 처리해야 하고, 그러기 위해서 클로져가 필수다
 */