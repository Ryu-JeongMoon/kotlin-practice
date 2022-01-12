package kotlininaction.chap06.nullability

fun main() {
  println("foo" as? Int ?: "omg")

  val panda = SafePerson("panda", "bear")
  val panda2 = SafePerson("panda", "bear")
  val bear = SafePerson("bear", "panda")

  println(panda == bear)
  println(panda == panda2)
}

class SafePerson(val firstName: String, val lastName: String) {
  override fun equals(other: Any?): Boolean {
    // as? 로 검사 후 SafePerson 으로 스마트 캐스트됨
    val otherPerson = other as? SafePerson ?: return false
    return otherPerson.firstName == firstName && otherPerson.lastName == lastName
  }

  override fun hashCode(): Int = firstName.hashCode() * 31 + lastName.hashCode()
}

/*
안전한 캐스트, as?
as 로 class 강제 지정 가능하며 캐스팅할 수 없으면 ClassCastException 터짐
그렇다면 안전한 코딩을 위해 is 로 선행 검사를 해주는 귀찮은 방법을 사용해야할까? 에 대한 해법으로 나온 것이 as?
 */