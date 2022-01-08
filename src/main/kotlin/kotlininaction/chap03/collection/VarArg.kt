package kotlininaction.chap03.collection

fun main() {
  yaho(1, 3, 5, 7)

  // spread operator !?!
  val list = listOf(2, 4, 6, 8)
  yaho(*list.toIntArray())

  val ints = intArrayOf(3, 6, 9, 12)
  yaho(*ints)
}

fun yaho(vararg values: Int) {
  values.forEach { println("yahoo $it") }
}