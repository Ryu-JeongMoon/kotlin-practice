package kotlininaction.chap04.kotlinclass.constructor

fun main() {
  val client = Client("panda", 5)
  val client2 = Client("panda", 5)
  println(client)

  println(client == client2)
  println(client === client2)

  println(client.hashCode())
  println(client2.hashCode())
}

class Client(val name: String, val postalCode: Int) {
  override fun toString() = "Client(name=$name, postalCode=$postalCode)"

  override fun equals(other: Any?): Boolean {
    if (other == null || other !is Client)
      return false
    return name == other.name && postalCode == other.postalCode
  }

  override fun hashCode(): Int {
    return name.hashCode() * 31 + postalCode
  }
}


/*
동일성과 동등성
동일성은 완전 같은 객체인지 비교
== 연산자를 이용하는데 기본 타입의 경우 값을 비교하고 객체 타입의 경우 메모리 주소를 비교한다 (reference comparison)

동등성은 값이 같은지 비교
equals, hashCode 오버라이드 필요

코틀린에서는 == 비교는 내부적으로 equals 사용함
따라서 equals 오버라이드하면 == 으로 객체 비교 가능
참조 비교는 === 연산자 이용

자바스크립트 같구만?!
 */