package kotlininaction.chap10.reflection

import kotlin.reflect.full.memberFunctions
import kotlin.reflect.full.memberProperties


fun main() {
  val person = Person("Alice", 29)
  val kClass = person.javaClass.kotlin

  // instance 에 속한 property
  kClass.memberProperties.forEach { println(it.name) }

  // property 개수
  println(kClass.memberProperties.size)

  // 생성자
  println(kClass.constructors)

  // instance 의 메서드들
  println(kClass.memberFunctions.forEach { println(it) })
}

data class Person(val name: String, val age: Int)

/*
Reflection 이란 실행 시점에 동적으로 객체의 프로퍼티와 메서드에 접근하는 방법
일반적으로 컴파일러는 소스 코드에 구체적인 선언이 있는 프로퍼티와 메서드를 컴파일 시점에 찾아내서 사용하지만
직렬화 같은 특정 기능에서는 컴파일 시점에 타입을 알 수 없고 실행 시점에만 알 수 있는 경우가 있다

코틀린에서 리플렉션을 사용하려면
1. java.lang.reflect 가 지원하는 기능을 사용한다
코틀린 클래스는 일반 자바 바이트코드로 컴파일되므로 자바 리플렉션 API 가 완벽 지원된다
이는 호환을 위해 중요한 요소다

2. kotlin.reflect 가 지원하는 기능을 사용한다
코틀린에만 존재하는 개념을 위해 제공되고, 코틀린 뿐만 아니라 JVM 에서 동작하는 다른 언어에도 사용할 수 있다?!
 */