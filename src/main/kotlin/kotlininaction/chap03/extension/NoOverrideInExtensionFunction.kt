package kotlininaction.chap03

fun main() {
  val view = View()
  view.click()
  view.showOff()

  val button: View = Button()
  button.click()
  button.showOff()
}

open class View {
  open fun click() = println("View clicked")
}

class Button: View() {
  override fun click() =  println("Button clicked")
}

fun View.showOff() = println("I'm a View JS")
fun Button.showOff() = println("I'm a Tim Button")


/*
확장 함수는 static dispatch 방식

override method 는 dynamic dispatch 로 instance -> class -> super 연결 고리 찾아가서 메서드 호출하는데 반해
extension method 는 static dispatch 로 컴파일 시점의 타입에 따라 메서드 호출
 */