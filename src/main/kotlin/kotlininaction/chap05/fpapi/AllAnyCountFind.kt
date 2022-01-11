package kotlininaction.chap05.fpapi

fun main() {
  val canBeInClub27 = {p: Person -> p.age <= 27}

  val people = listOf(Person("Alice", 27), Person("Panda", 5959), Person("Bear", 5))

  // 전체 검사
  println(people.all(canBeInClub27))

  // 아무나 한 놈
  println(people.any(canBeInClub27))

  // default 로 첫번째, 없으면 null 반환
  println(people.find(canBeInClub27))

  // null 이 올 수도 있다는 사실을 명시적으로 알려줌
  println(people.firstOrNull(canBeInClub27))

  // 마지막 요소 찾으려면 findLast
  println(people.findLast(canBeInClub27))

  // 요렇게 하면 count 와 값은 같으나 중간 결과를 저장하는 컬렉션이 생긴다
  println(people.filter(canBeInClub27).size)

  // 얘는 개수만 추적, 개수만 필요할 때는 count 사용할 것
  println(people.count(canBeInClub27))
}