package kotlininaction.chap05.lambda

fun main() {
  val panda = Person("panda", 55)
  val bear = Person("bear", 33)
  val people = listOf(panda, bear)

  // 자바처럼 컬렉션 요소 하나하나의 이름을 지정해줘도 되고
  val theOldest = people.maxByOrNull { person -> person.age }
  println("theOldest = $theOldest")

  // 컴파일러가 lambda parameter 의 타입을 알고 있기 때문에 it 으로 칭해도 되는 것임둥
  // 중첩 람다를 사용하는 경우에는 parameter name 지정해주도록 한다, it 범벅인 코드는 읽기 어렵다
  val theYoungest = people.minByOrNull { it.age }
  println("theYoungest = $theYoungest")

  // 람다를 변수에 저장할 때는 parameter type 추론할 문맥이 존재하지 않아서 직접 타입 지정해주어야 함
  val getAge = { p: Person -> p.age }
  people.maxByOrNull(getAge)

  // 람다 안의 본문이 여러 줄인 경우에도 본문에 중괄호 안 쳐도 된다, 마지막에 있는 식이 람다의 결과 값이 된다
  val sum = { x: Int, y: Int ->
    println("YAHOO")
    x + y
  }
  println(sum(1, 5))
}

// 연장자를 찾고 싶을 때, 기존에는 직접 for 문 돌려서 조건문 검사 후 찾을 것
data class Person(val name: String, val age: Int)

// 직접 찾는 경우, 아이고 번거로워
fun findTheOldest(people: List<Person>) {
  var maxAge = 0
  var theOldest: Person? = null
  for (person in people) {
    if (person.age > maxAge) {
      maxAge = person.age
      theOldest = person
    }
  }
}

/*
컬렉션을 사용할 때 개발자가 직접 for 문을 돌려서 수행할 작업을 지정하는 행위는 보다 일반적인 행위에 해당한다
즉, 대부분의 연산에 사용되는 방식이다
중복을 줄이기 위해 이를 라이브러리에 넣는 방식이 람다로 컬렉션을 다루는 것이다
 */