package kotlininaction.chap07.overloading.arithmetic

fun main() {
  val first = Point(2, 3)
  val second = Point(3, 2)

  println("newPoint = ${first + second}")
  println("newPoint = ${first * 1.5}")
  println("newPoint = ${1.5 * first}")
  println("newString = ${'a' * 3}")

  // 2 << 1
  println("newBit = ${2 shl 1}")

  // 2 >> 1
  println("newBit = ${2 shr 1}")

  println(0x0F or 0xF0)
}

data class Point(val x: Int, val y: Int) {
  // 연산자 overloading 시에는 operator 키워드를 사용해야 한다
  // operator fun plus(other: Point): Point = Point(x + other.x, y + other.y)

  // data class 선언 시 equals 만들어주지만, 직접 구현한다면 아래와 같은 모습
  override fun equals(other: Any?): Boolean {
    if (other === this) return true
    if (other !is Point) return false
    return other.x == x && other.y == y
  }
}

// 일반적으로 클래스 내부가 아닌 확장 함수 형태로 작성하고 따로 모아두나봄
operator fun Point.plus(other: Point): Point = Point(x + other.x, y + other.y)

// parameter type 이 달라도 오께이
// 코틀린 연산자는 자동으로 commutativity, 교환 법칙 지원하지 않는다
// 따라서 요렇게만 작성하면 x * scale 은 가능하나, scale * x 로는 사용할 수 없다
// 필요하다면 추가적으로 scale * y 지원하는 operator 추가해주어야 한다!?
operator fun Point.times(scale: Double): Point = Point((x * scale).toInt(), (y * scale).toInt())

operator fun Double.times(point: Point): Point = Point((point.x * this).toInt(), (point.y * this).toInt())

// 확장 클래스 타입, 매개변수 타입, 반환 타입 전부 달라도 오께이
operator fun Char.times(count: Int): String = toString().repeat(count)

/*
BigInteger 를 사용할 때 add 메서드를 사용하는 대신 plus 를 구현하고 + 연산자를 사용하는 편이 간단하다
 */