package kotlininaction.chap04.kotlinclass.hierarchy

fun main() {

}

internal open class TalkativeButton : Focusable {

  private fun yell() = println("Hey !!")

  protected fun whisper() = println("Let's talk !!")
}

/*
public 함수에서 internal class 에 접근할 수 없음
fun TalkativeButton.giveSpeech() {
  // private method 접근 불가
  yell()

  // protected method 접근 불가
  whisper()
}
*/

/*
- public
모든 곳, 최상위 선언 가능

- internal
모듈 내부, 최상위 선언 가능

- protected
하위 클래스, 최상위 선언 불가

- private
파일 내부, 최상위 선언 가능
 */