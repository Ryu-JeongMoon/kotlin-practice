package kotlininaction.chap09.variance

fun main() {
  val strings = mutableListOf("abc", "def")
  // MutableList<Any> 필요한 위치에 MutableList<String> 넘겨서는 안 된다, 컴파일 에러
  // addAnswer(strings)
}

// 값을 변경하는 함수이므로 읽기 전용 X
fun addAnswer(list: MutableList<Any>) = list.add(42)

// 클래스가 T에 대해 공변적이라 선언하기 위해서는 out 키워드를 이용한다
// 이는 T를 T의 상/하위 타입과 바꿔도 같은 동작을 한다는 것을 의미한다
// out 은 반환 타입으로 사용할 수 있다는 것을 의미하며 (in 으로 들어오는) 매개변수로 사용할 수는 없다
interface Producer<out T> {
  fun produce(): T
}

/*
variance, 변성이란 List<String>, List<Any> 처럼 base-type 은 같으나 argument-type 다른 타입의 관계를 설명하는 개념이다
즉 기저 타입이 같아도 타입 인자가 다른 경우, 상/하위 관계가 성립하지 않으므로 이를 invariant, 무공변이라 한다

코틀린의 List 인터페이스는 읽기 전용 컬렉션을 표현한다
이 때 A 가 B의 하위 타입이면 List<A> 는 List<B> 의 하위 타입이다 이를 variant, 공변이라 한다
 */