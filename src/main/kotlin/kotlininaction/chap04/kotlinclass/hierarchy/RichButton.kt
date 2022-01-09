package kotlininaction.chap04.kotlinclass.hierarchy

fun main() {
  val button = RichButton()
  button.click()
  button.showOff()
  button.setFocus(true)

  val subRichButton = SubRichButton()
  subRichButton.animate()
}

open class RichButton : Button() {

  // 얘는 final method
  fun disable() {}

  // 얘는 public method
  open fun animate() = println("YAHO")

  // override 는 기본적으로 열려있다
  override fun click() = println("YAHOO~~")

  // final override 로 확장하지 못 하도록 함
  final override fun showOff() = println("HO WOO !!")
}

class SubRichButton : RichButton() {

  // showOff() 는 final 명시했으므로 확장 불가!
  override fun animate() = println("WOO HE HE")
}