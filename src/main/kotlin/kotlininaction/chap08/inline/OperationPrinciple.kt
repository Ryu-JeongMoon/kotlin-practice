package kotlininaction.chap08.inline

import java.io.BufferedReader
import java.io.FileReader

fun main() {
  val people = listOf(Person("Alice", 29), Person("Bob", 31))
  println(people.filter { it.age < 30 })

  println(readFirstLineFromFile("yaho.txt"))
}

data class Person(val name: String, val age: Int)

// kotlin 에서는 try-with-resource 쓸 필요 없이 use 함수 쓰면 된다
// 람다를 인자로 받아 수행 후 자원을 닫아준다
fun readFirstLineFromFile(path: String): String {
  BufferedReader(FileReader(path)).use { br -> return br.readLine() }
}