package kotlininaction.chap04.kotlinclass.hierarchy

import java.io.Serializable

fun main() {
  val coolButton = CoolButton()
  println(coolButton.getCurrentState())
  coolButton.restoreState(coolButton.ButtonState())

  val kotlinButton = KotlinButton()
  kotlinButton.restoreState(KotlinButton.ButtonState())
}

interface State : Serializable

interface View {
  fun getCurrentState(): State

  fun restoreState(state: State) {}
}

class KotlinButton : View {
  override fun getCurrentState() = ButtonState()

  final override fun restoreState(state: State) {
    println("FINAL YAHOO")
  }

  // 기본적으로 자바의 static class 상태
  // inner class 로 변경하고 싶다면 명시적으로 inner 붙여야함
  // inner class ButtonState: State
  class ButtonState: State
}