package kkang.chap04

// 걍 필드 가따 쓰는 것처럼 보이지만 getter 호출!!
fun main(args: Array<String>) {
  val obj = Address("YAHO")
  println(obj.name)
}

// open 안 붙이면 default final 임!!
class Address(val name: String) {
}