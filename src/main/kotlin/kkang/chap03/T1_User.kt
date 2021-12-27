package kkang.chap03

import java.util.*

class T1_User {
  private val name = "panda"

  fun sayHello() {
    val date = Date()
    println("date = $date")
    println("name = $name")
  }
}

fun main(args: Array<String>) {
  val t1User = T1_User()
  t1User.sayHello()
}