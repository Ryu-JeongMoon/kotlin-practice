package kotlininaction.chap02

fun main() {
  println("Hello, World!")
}

/*
함수를 최상위에 선언할 수 있다, 클래스를 작성하지 않아도 된다
kotlin bytecode 까보면 final class 로 자동 생성되어있다
open 안 붙여놓으면 암묵적으로 final 로 생성되어 확장 불가
 */