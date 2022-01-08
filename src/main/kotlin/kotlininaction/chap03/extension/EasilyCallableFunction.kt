package kotlininaction.chap03

fun main() {
  val list = listOf(1, 3, 5)
  println(joinToString(list, "; ", "(", ")"))

  // 오홍 named argument ?, intellij 쓰는 경우에는 필요 없을듯??
  // java 로 작성된 코드를 호출할 때는 named argument 사용할 수 없다
  println(joinToString(collection = list, separator = "; ", prefix = "(", postfix = ")"))
}

fun <T> joinToString(collection: Collection<T>, separator: String, prefix: String, postfix: String): String {
  val result = StringBuilder(prefix)

  for ((index, element) in collection.withIndex()) {
    if (index > 0)
      result.append(separator)
    result.append(element)
  }

  result.append(postfix)
  return result.toString()
}