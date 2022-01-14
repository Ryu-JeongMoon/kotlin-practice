package kotlininaction.chap08.highorder

fun main() {
  println(listOf("PANDA", "BEAR").joinToString())

}

fun <T> Collection<T>.joinToString(
  separator: String = ", ",
  prefix: String = "[",
  postfix: String = "]",
  transform: (T) -> String = { it.toString() }
): String {
  val result = StringBuilder(prefix)
  for ((index, element) in this.withIndex()) {
    if (index > 0)
      result.append(separator)
    result.append(transform(element))
  }
  result.append(postfix)
  return result.toString()
}