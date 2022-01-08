package kotlininaction.chap03.strings

fun main() {
  val split = "12.345-6.A".split(".")
  println("split = $split")

  val split1 = "12.345-6.A".split("\\.".toRegex())
  println("split1 = $split1")

  // split 에 vararg 적용했기 땜시 가변인수로 넣어줄 수 있다
  val split2 = "12.345-6.A".split('.', '-', '#', '$')
  println("split2 = $split2")
}

/*
코틀린에서는 기본적으로 구분 문자로 받고 정규표현식 필요하다면 toRegex()로 변환
 */