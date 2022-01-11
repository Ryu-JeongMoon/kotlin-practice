package kotlininaction.chap05.fpapi

fun main() {
  // 코틀린에서 람다를 넘겨도 컴파일러가 Runnable 로 변환해주기 때문에 작동됨
  val methodExample = MethodExample()
  methodExample.postponeComputation(500) { println("YAHOO") }

  // 코드 안에서 this 를 사용할 수 있으나 매번 수행될 때마다 Runnable instance 가 생성된다
  methodExample.postponeComputation(500, object: Runnable {
    override fun run() {
      println("PANDA $this")
    }
  })

  // lambda capturing 하는 경우 이 역시 새로 인스턴스가 생성된다
  val id = 100
  methodExample.postponeComputation(500) { println(id) }
}


/*
자바 8 이전 코드와 코틀린 람다는 어우러질 수 있다
이것이 왜 작동하는가

추상 메서드가 단 하나만 있는 경우, 이를 functional interface / SAM (single abstract method) interface 라 한다
 */