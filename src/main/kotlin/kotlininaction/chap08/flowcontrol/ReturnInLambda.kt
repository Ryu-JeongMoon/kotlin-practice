package kotlininaction.chap08.flowcontrol

fun main() {
  val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Panda", 31))
  people.lookFor("Alice")
  people.lookForV2(31)
}

data class Person(val name: String, val age: Int)

fun List<Person>.lookFor(name: String) {
  for (person in this)
    if (person.name == name) {
      println("YAHOO")

      // if 문 반환이 아닌 함수 전체 반환
      return
    }

  // 여기는 실행 안 됨
  println("YAHOO~~")
}

fun List<Person>.lookForV2(age: Int) {
  // 하나라도 발견되면 @label 리턴한 후 뒤에 코드 이어서 실행
  this.forEach label@ {
    if (it.age == age) return@label
  }

  this.forEach {
    if (it.name == "Bob") return@forEach
  }

  println("YAHOO!")
}

/*
자신을 둘러싸고 있는 블록보다 더 바깥에 있는 다른 블록을 반환하게 만드는 non-local return
이러한 return 은 람다를 인자로 받는 인라인 함수의 경우에만 적용된다

간단하게 생각하면 return 은 일반적으로 fun 키워드를 사용해 정의된 가장 안쪽의 함수를 반환시킨다는 것
람다는 fun 키워드 사용하지 않으므로 그 다음 가까운 fun 을 반환하는 것임둥
 */