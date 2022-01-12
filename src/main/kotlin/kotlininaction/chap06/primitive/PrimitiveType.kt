package kotlininaction.chap06.primitive

fun main() {
  showProgress(-3145)
  showProgress(5)
  showProgress(34335)
}

// coerceIn 범위 값 벗어나지 못 하게 제한하는 놈
fun showProgress(progress: Int) {
  val percent = progress.coerceIn(0, 100)
  println("We're $percent% done!!")
}


/*
자바에서는 primitive, reference 타입 구분한다
코틀린에서는 안 함둥

그러믄 루비, 파이썬 처럼 모든 것이 객체다 라는 식으로 운용되나요?
아니요 그건 똥입니다
코틀린 컴파일러는 똑똑이라서 래퍼 타입 들어가야 할 자리에는 참조 타입으로 평범한 연산에는 기본 타입으로 들어갑니동
래퍼 타입 자리는 제네릭, 컬렉션에 넣는 자리
 */