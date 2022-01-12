package kotlininaction.chap06.collection

fun main() {
  val array = arrayOf(1, 2, 3, 4)
  for (i in array.indices)
    println("i = $i")

  val letters = Array(26) { i -> ('a' + i).toString() }
  println("letters = ${letters.joinToString("")}")

  val strings = listOf("a", "b", "c")
  printStrings(*strings.toTypedArray())
}

fun printStrings(vararg strings: String) {
  for (str in strings)
    println("str = $str")
}

/*

 */