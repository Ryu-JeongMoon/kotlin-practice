package kotlininaction.chap04.kotlinclass.hierarchy

fun main() {
  val basicAnimated = BasicAnimated()
  basicAnimated.animate()
  basicAnimated.stopAnimating()
  basicAnimated.animateTwice()
}

abstract class Animated {
  abstract fun animate()

  open fun stopAnimating() = println("기본")

  fun animateTwice() = println("어흥")
}

class BasicAnimated : Animated() {
  override fun animate() = println("야옹")
}

