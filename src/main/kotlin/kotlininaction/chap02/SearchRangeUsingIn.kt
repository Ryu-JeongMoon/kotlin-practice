package kotlininaction.chap02

fun main() {
  println(isLetter('L'))
  println(isLetter('5'))

  println(isNotDigit('L'))
  println(isNotDigit('5'))

  println(recognize('L'))
  println(recognize('5'))
}

fun isLetter(c: Char) = c in 'a'..'z' || c in 'A'..'Z'

// in 앞에다가 ! 연산자 붙여준당
fun isNotDigit(c: Char) = c !in '0'..'9'

fun recognize(c: Char) =
  when (c) {
    in '0'..'9' -> "Digit"
    in 'a'..'z', in 'A'..'Z' -> "Letter"
    else -> "I don't know"
  }

/*
c in 'a'..'z' -> 'a' <= c && c <= 'z' 로 변환
 */