package kotlininaction.chap06.primitive

fun main() {
  val i = 1
  val l: Long = i.toLong()

  // 노노
  // val l: Long = i

  println(0xCA)
  println(0b1101101)

  println("42".toInt())
  println("42".toInt().javaClass)
}

/*
코틀린에서는 숫자끼리 자동 변환이 되지 않는다
간단하게 봤을 때는 이게 오히려 불편할거 같은데 왜 그럴까?


 */