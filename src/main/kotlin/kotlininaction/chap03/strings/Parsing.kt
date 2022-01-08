package kotlininaction.chap03.strings

fun main() {
  parsePath("/Users/panda/kotlin-book/chapter.adoc")

  parsePathWithRegex("/Users/panda/kotlin-book/chapter.adoc")
}


fun parsePath(path: String) {
  val directory = path.substringBeforeLast("/")
  val fullName = path.substringAfterLast("/")
  val filename = fullName.substringBeforeLast(".")
  val extension = fullName.substringAfterLast(".")

  println("Dir: $directory, name: $filename, ext: $extension")
}

// 3중 따옴표는 왜 사용하는가
// escape 쓸 필요가 없기 때문, 쏘 이지
fun parsePathWithRegex(path: String) {
  val regex = """(.+)/(.+)\.(.+)""".toRegex()
  val matchResult = regex.matchEntire(path)
  if (matchResult != null) {
    val (directory, filename, extension) = matchResult.destructured
    println("Dir: $directory, name: $filename, ext: $extension")
  }
}