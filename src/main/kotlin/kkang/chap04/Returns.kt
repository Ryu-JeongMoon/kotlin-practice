package kkang.chap04

fun main(args: Array<String>) {
  foo()

  val obj = Customer("kotlin")
  println(obj)
}

fun foo() {
  var ints = intArrayOf(1, 2, 3)
  ints.filter { i -> i != 1 }
    .forEach { i -> println(i) }
  println("End")
}

class Customer(name: String) {
  init {
    println("name : $name")
  }
}