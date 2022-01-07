package kotlininaction.chap02

import kotlininaction.chap02.Color.ORANGE

fun main() {
  // 코틀린에서 enum 은 soft keyword
  // 클래스 앞에 있을 때만 키워드로 작동하며 나머지에서는 변수명으로도 사용 가능
  val enum = 45
  println("enum = $enum")

  println(ORANGE.rgb())
}

enum class Color(private val r: Int, private val g: Int, private val b: Int) {
  RED(255, 0, 0),
  ORANGE(255, 165, 0),
  YELLOW(255, 255, 0),
  GREEN(0, 255, 0),
  BLUE(0, 0, 255),
  INDIGO(75, 0, 130),
  VIOLET(238, 130, 238);

  fun rgb() = (r * 256 + g) * 256 + b
}

/*
static import 과연 옳은가
Oracle SE Documentation 보니까 가독성과 유지보수성 측면에서 사용이 빈번한 녀석들만 쓰라고 한다
편의성 측면에서는 짱짱, 가독성 & 유지보수성 저하는 코드 네비게이션을 사용해 해결하면 되지 않은감??
 */