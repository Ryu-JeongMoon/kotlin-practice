package kotlininaction.chap03

fun main() {
  val set = hashSetOf(1, 7, 53)
  val list = arrayListOf(1, 7, 53)
  val map = hashMapOf(1 to "one", 7 to "seven", 53 to "fifty-three")

  // to 는 키워드가 아니라 함수?!
  val pair = 1 to "one"
  println("pair = $pair")
  println(pair.javaClass)

  // 마지막 요소 가져오기
  println(set.last())
  println(list.last())
  println(map.keys.last())
  println(map.values.last())

  // 호오라 요놈 봐라
  println(set.maxOrNull())
  println(list.maxOrNull())
  println(map.keys.maxOrNull())
  println(map.values.maxOrNull())
}


/*
interoperability 를 위해 코틀린 자체 컬렉션 사용하지 않고 자바 컬렉션 사용
그런데도 컬렉션에 추가 기능을 사용할 수 있다는 것은?! Wrapper 인 건감
확장 함수였던 것이었다~!?
 */