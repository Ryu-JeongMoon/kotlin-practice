package kotlininaction.chap05.fpapi

fun main() {
  val people = listOf(Person("Bob", 31), Person("Alice", 29), Person("Panda", 31))

  // 결과로 Map 이 반환됨, 여기서는 Map<Int, List<Person>>
  println(people.groupBy { it.age })
}