package kotlininaction.chap07.overloading.arithmetic

fun main() {
  var p1 = Point(3, 6)
  val p2 = Point(7, 4)

  p1 += p2
  println("p1 = $p1")
}

/*
operator plus overloading 하면 += 도 함께 지원된다
 */