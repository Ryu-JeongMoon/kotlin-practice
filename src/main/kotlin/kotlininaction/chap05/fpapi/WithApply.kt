package kotlininaction.chap05.fpapi

fun main() {
  println(alphabet())
  println(alphabetWith())
  println(alphabetApply())
  println(alphabetBuildString())
}

fun alphabet(): String {
  val result = StringBuilder()
  for (letter in 'A'..'Z')
    result.append(letter)
  result.append("\nNow I Know the Alphabet!!")
  return result.toString()
}

// 오홍~~
// with 는 parameter 가 두개, 하나는 T, 나머지는 람다
fun alphabetWith(): String {
  return with(StringBuilder()) {
    for (letter in 'A'..'Z')
      append(letter)
    append("\nNow I Know the Alphabet!!")
    toString()
  }
}

// 수신 객체를 돌려준다?
fun alphabetApply() = StringBuilder().apply {
  for (letter in 'A'..'Z')
    append(letter)
  append("\nNow I Know the Alphabet!!")
}.toString()

// 위에 놈을 자주 사용하니까 일반화해버림
fun alphabetBuildString() = buildString {
  for (letter in 'A'..'Z')
    append(letter)
  append("\nNow I Know the Alphabet!!")
}