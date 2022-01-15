package kotlininaction.chap09.type

fun main() {
  // parameter 의 타입 추론하여 List<String>
  val authors = listOf("Dmitry", "Svetlana")

  // parameter 주어지지 않을 때 추론할 수 없으므로 직접 명시
  val readers: MutableList<String> = mutableListOf()

  // mutable-list 의 parameter type 지정
  val anotherReaders = mutableListOf<String>()

  val letters = ('a'..'z').toList()

  // 컴파일러가 List<T> 를 List<Char> 로 추론함, 따라서 명시할 필요 없음
  println("letters = ${letters.slice(0..2)}")
  println("letters = ${letters.slice<Char>(0..2)}")
}


/*
코틀린에서는 처음부터 제네릭을 도입했기 때문에 raw type 은 사용할 수 없다
 */