package kotlininaction.chap06.primitive

import kotlininaction.chap06.nullability.Address
import kotlininaction.chap06.nullability.Company

fun main() {
  // Any 가 참조 타입이기 때문에 객체로 감싸진다?!
  val answer: Any = 42
  println("answer type = ${answer.javaClass}")

  val company1 = Company("KAKAO", Address("pangyo", 34341, "gyeonggi", "korea"))
  val address1 = company1.address ?: fail("No address")
  println("address1 = $address1")

  val company2 = Company("KAKAO", null)
  val address2 = company2.address ?: fail("No address")
  println("address2 = $address2")
}

interface Processor<T> {
  fun process(): T
}

class NoResultProcessor: Processor<Unit> {
  // interface 에서 T 반환한다고 했는데 여기는 왜 반환 안 할까?
  // T 를 Unit 으로 캐스팅했고 Unit 은 암묵적으로 반환되기 때문에 안 써줘도 문제 없다
  override fun process() {
    println("YAHOO~~~")
  }
}

fun fail(message: String): Nothing = throw IllegalStateException(message)

/*
Any 최상위 타입, 자바의 Object
참조 타입의 최상위인 자바의 Object 와는 다르게 Any 는 모든 타입의 최상위다, 즉 원시 타입도 포함한다

Unit, 자바의 void 와 유사하지만 자바와 완전히 같지 않다
자바는 반환 값이 없음을 나타내고 Unit 의 반환 값은 암묵적으로 Unit 이 된다
얘를 왜 쓰는가 하면 제네릭 함수를 override 할 때 유용하다고 한다
왜 Void 가 아닌 Unit 일까?
FP 에서 Unit 은 전통적으로 '단 하나의 인스턴스만 갖는 타입'을 의미해왔고 void(없음) & Unit(있음) 의 차이를 나타낸다
따라서 명령형 프로그래밍과 선 긋기라 볼 수 있다

Nothing, 값을 돌려주는 일이 없는 타입 지정 시 사용?!
함수가 정상적으로 끝나지 않음을 명시해준다?!?!?
 */