package kotlininaction.chap01

data class Person(val name: String, val age: Int? = null)

fun main(args: Array<String>) {
  val persons = listOf(Person("Hello"), Person("World", 29))

  // type 지정해도 되고 안 해도 되고, 자바 같은 엄격한 타입 지정 안 해줘도 된다리~~
  val youngest = persons.minByOrNull { it.age ?: 0 }
  val oldest: Person? = persons.maxByOrNull { it.age ?: 0 }

  println("Youngest person : $youngest")
  println("Oldest person : $oldest")
}