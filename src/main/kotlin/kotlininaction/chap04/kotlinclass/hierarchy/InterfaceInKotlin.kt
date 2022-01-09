package kotlininaction.chap04.kotlinclass.hierarchy

fun main() {
  val button = Button()
  button.click()
  button.showOff()
  button.setFocus(false)
}

interface Clickable {
  fun click()

  // default 필요 없이 구현해놓으면 default method
  fun showOff() = println("Clickable!!")
}

interface Focusable {
  fun setFocus(b: Boolean) = println("I ${if (b) "got" else "lost"} focus.")

  fun showOff() = println("Focusable!!")
}

// extends, implements 대신 콜론(:) 사용
// 다이아몬드 상속 문제 -> 겹치는 메서드 필수적으로 구현하게끔 해결, 안 해놓으면 컴파일 에러
open class Button : Clickable, Focusable {
  // @Override 선택적인 자바와는 다르게 코틀린에서는 필수로 사용해야 함, annotation 이 아닌 keyword 로 작동
  override fun click() = println("Clicked")

  override fun showOff() {
    println("Button!!")
    super<Clickable>.showOff();
    super<Focusable>.showOff();
  }
}

// Button 이 open 아니면 컴파일 에러
// class SubButton: Button() {}


/*
fragile base class
하위 클래스들이 의존하는 기반 클래스에 변경이 가해졌을 때
기반 클래스에 가졌던 가정이 (어떤 일을 해주겠거니~~) 깨진 경우를 취약한 기반 클래스라 한다

이와 같은 문제를 갖지 않으려면
상속을 위한 설계와 잘 정리된 문서가 있거나 final 이용해 상속을 금지시킨다
 */