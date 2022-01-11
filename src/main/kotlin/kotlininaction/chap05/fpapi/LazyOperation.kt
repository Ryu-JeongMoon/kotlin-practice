package kotlininaction.chap05.fpapi

fun main() {
  var start = System.nanoTime()
  println(listOf("1", "2", "3").map { it + "YAHO" }.filter { it.startsWith("1") })
  // 43339553
  println("No Sequence Time = ${System.nanoTime() - start}")

  start = System.nanoTime()
  println(listOf("1", "2", "3").asSequence().map { it + "YAHO" }.filter { it.startsWith("1") }.toList())
  // 10674671 대략 4배 차이
  println("Sequence Time = ${System.nanoTime() - start}")

  // 전체 요소에 대해 map 수행 후 find 수행
  println(listOf(1, 2, 3, 4).map { it * it }.find { it > 3 })
  // map -> find, map -> find 요소마다 반복됨, 2번째에 2 * 2 = 4 이므로 얘 반환하고 남은 요소는 연산 수행 노노
  println(listOf(1, 2, 3, 4).asSequence().map { it * it }.find { it > 3 })

  val people = listOf(Person("Alice", 29), Person("Bob", 31), Person("Charles", 31), Person("Dan", 21))

  // 두 연산의 결과는 같지만 연산 수행 횟수는 다르다
  // 얘는 전체 요소 name 으로 변환 후 filter 수행하므로 8번
  println(people.map { it.name }.filter { it.length > 4 })

  // 얘는 filter 에서 2명 걸러진 후에 map 수행하므로 6번
  println(people.filter { it.name.length > 4 }.map { it.name })
}


/*
map, filter 는 컬렉션을 즉시(eager) 생성한다
얘네는 리스트를 반환하므로 연쇄로 호출하면 중간 결과를 담는 컬렉션이 두개 생기는 것
스트림 돌리는 요소가 많을수록 성능이 개구데기

이 문제를 sequence 로 해결할 수 있다, Sequence 는 인터페이스인데 iterator 메서드 하나만 있다
lazy operation 수행하기 땜시 중간 결과 저장 없다
시퀀스에 대한 연산은 intermediate, terminal 연산으로 나뉜다 (요놈이 스트림이고만)

즉 map, filter 를 컬렉션에 직접 갈기면 요소 순회하는 중간 컬렉션이 만들어져 버리고
asSequence 를 사용하면 자바에서 .stream().어쩌구저쩌구 로 사용하는 방식, 얘는 다시 컬렉션으로 변환해줘야 한다

map, filter 중 어느 것을 먼저 수행하느냐에 따라 연산 횟수가 달라질 수 있으므로 두개 같이 사용하는 경우에는 filter 먼저 거는게 낫다?!
 */