@file:JvmName("Strings")

package kotlininaction.chap03

fun main() {
  // "yaho" -> receiver object
  println("yaho".lastChar())
}

// String -> receiver type, this -> receiver object
fun String.lastChar(): Char = this[this.length - 1]


/*
코틀린의 핵심 목표는 기존 코드와 잘 어우러지는 것, 그래서 자바의 점유율 뺏어오는 것!?
기존 자바 API 를 재작성하지 않고도 코틀린이 제공하는 여러 기능을 이용할 수 있게 하는 것이 확장 함수가 하는 일

<확장할 클래스>.메서드명 으로 선언하면 개념적으로 확장할 클래스 내부의 메서드처럼 사용할 수 있다, 오메..
이때 클래스 이름을 receiver type, 확장 함수가 호출되는 대상이 되는 값(객체)를 receiver object 라 한다
수신 객체란 확장 클래스에 속한 인스턴스를 의미한다

단 확장 함수라 하여 캡슐화를 깨진 않는다
이 말은 확장 함수는 확장할 클래스의 private property, method 는 사용할 수 없음을 의미한다

메서드를 호출하는 쪽에서는 이 놈이 멤버 메소드인지, 확장 메소드인지 중요치 않다
 */