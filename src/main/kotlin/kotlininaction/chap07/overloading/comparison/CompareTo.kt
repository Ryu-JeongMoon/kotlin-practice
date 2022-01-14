package kotlininaction.chap07.overloading.comparison

fun main() {
  val p1 = Person("Alice", "Smith")
  val p2 = Person("Bob", "Johnson")
  println(p1 < p2)
}

class Person(private val firstName: String, private val lastName: String) : Comparable<Person> {
  override fun compareTo(other: Person): Int = compareValuesBy(this, other, Person::lastName, Person::firstName)
}

/*
자바에서는 >, < 등은 primitive type 에만 적용 가능하다
코틀린에서는 >, < 도 내부적으로 compareTo 를 호출하여 비교가 이루어진다
 */