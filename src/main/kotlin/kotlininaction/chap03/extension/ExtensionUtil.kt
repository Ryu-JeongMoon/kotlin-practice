package kotlininaction.chap03

fun main() {
  val list = listOf(1, 5, 8, 7, 5, 3)
  println(list)
  println(list.joinToStringWithExtension())
}

fun <T> Collection<T>.joinToStringWithExtension(
  separator: String = ", ",
  prefix: String = "[",
  postfix: String = "]"
): String {
  val result = StringBuilder(prefix)

  for ((index, element) in this.withIndex()) {
    if (index > 0)
      result.append(separator)
    result.append(element)
  }

  result.append(postfix)
  return result.toString()
}