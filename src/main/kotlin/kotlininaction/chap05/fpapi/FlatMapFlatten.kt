package kotlininaction.chap05.fpapi

fun main() {
  val books = listOf(Book("panda", listOf("Y", "A", "H", "O")), Book("bear", listOf("G", "O", "O", "D")))
  println(books.flatMap { it.authors })
  println(books.flatMap { it.authors }.toSet())

  val strings = listOf("abc", "def")
  // [[a,b,c], [d,e,f]]
  println(strings.map { it.toList() })
  // [a,b,c,d,e,f]
  println(strings.flatMap { it.toList() })
}

class Book(val title: String, val authors: List<String>)

/*
flatMap -> map + flatten
주어진 람다를 적용하고 요소를 펼쳐서 리스트로 모은다

 */