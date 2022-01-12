package kotlininaction.chap06.collection

import java.io.BufferedReader
import java.io.FileReader

fun main() {
  val br = BufferedReader(FileReader("yaho.txt"))
  val result = readNumbers(br)
  println("result = $result")
}

fun readNumbers(reader: BufferedReader): List<Int?> {
  val result = ArrayList<Int?>()
  for (line in reader.lineSequence()) {
    result.add(line.toIntOrNull())
  }
  return result
}