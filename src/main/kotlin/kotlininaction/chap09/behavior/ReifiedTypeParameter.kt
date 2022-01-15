package kotlininaction.chap09.behavior

fun main() {
  printSum(listOf(1, 2, 3))

  // base-type 이 List 가 아니므로 IllegalArgumentException 발생
  // printSum(setOf(1, 2, 3))

  // Number 하위 클래스에 적용 가능한 sum 을 String 에 부르고 있으므로 ClassCastException 발생
  // printSum(listOf("4", "2", "5"))

  // reified type parameter 사용
  println(isA<String>("ABC"))

  // 표준 라이브러리 함수 사용
  val items = listOf("one", 2, "three")
  println(items.filterIsInstance<String>())
}

fun printSum(c: Collection<*>) {
  // unchecked cast 발생, 터지지는 않음
  val intList = c as? List<Int> ?: throw IllegalArgumentException("List is expected")
  println(intList.sum())
}

// make parameter type reified and function inline ??
// fun <T> isA(value: Any) = value is T
inline fun <reified T> isA(value: Any) = value is T

/*
JVM 의 Generics 는 type erasure, 타입 소거로 구현된다
즉 컴파일 시점에는 살아있으나 런타임에는 타입 정보가 지워져 List<String> -> List 로 보게 된다

인자를 알 수 없는 제네릭 타입을 표현할 때 star projection 을 사용하는데 이는 자바의 List<?> 와 비슷하다
 */