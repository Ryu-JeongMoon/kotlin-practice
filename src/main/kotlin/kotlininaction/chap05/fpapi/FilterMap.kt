package kotlininaction.chap05.fpapi

fun main() {
  val list = listOf(1, 2, 3, 4)

  // collect 로 다시 안 모아줘도 된다?!
  println(list.filter { it % 2 == 0 })

  // 주어진 람다를 수행한 후 새 컬렉션을 만들어서 반환해줌
  println(list.map { it * it })

  val people = listOf(Person("Panda", 59), Person("Bear", 488), Person("Pig", 49393))
  println(people.filter { it.age > 500 })

  println(people.map { it.name })

  println(people.filter { it.age > 60 }.map(Person::name))

  // 최댓값을 찾는 경우
  // 얘는 매번 람다 수행됨
  println(people.filter { it.age == people.maxOfOrNull { person -> person.age } })

  // 얘는 최댓값 먼저 한번의 수행으로 찾아냄, !! 은 null 이 아님을 assertion
  val maxAge = people.maxOfOrNull { it.age }!!
  println(people.filter { it.age == maxAge })


  val numbers = mapOf(1 to "one", 2 to "two")
  println(numbers.filterKeys { it > 1 })

  // mapValues 써도 it 은 맵 자체를 가르키므로 it.value 로 value 다뤄야 하는구먼
  println(numbers.mapValues { it.value + " YAHO" })
}

data class Person(val name: String, val age: Int)

/*
filter, map 은 컬렉션을 다룰 때 기반이 되는 함수
FP 에서 람다 or 다른 함수를 인자로 받거나 반환하는 함수를 High Order Function 이라 한다
기본 함수를 조합해서 새로운 연산을 정의하기 때문에 고차함수라 하는 것

이렇게 조합을 통해 연산을 만들어내는 패턴을 combination pattern 이라 하고,
다른 함수를 이용하는 함수를 combinator 라 한다
 */