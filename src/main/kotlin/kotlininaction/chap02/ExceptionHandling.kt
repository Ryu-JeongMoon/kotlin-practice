package kotlininaction.chap02

import java.io.BufferedReader
import java.io.FileReader
import java.io.StringReader

fun main() {
  val percentage = 50
  if (percentage !in 0..100)
    throw IllegalArgumentException("percentage should be between 0 and 100 : $percentage")

  println(readNumber(BufferedReader(FileReader("yaho"))))

  readNumberAsExpression(BufferedReader(FileReader("yaho")))

  readNumberAsExpression(BufferedReader(StringReader("yaho")))
}

fun readNumber(reader: BufferedReader): Int? {
  return try {
    val line = reader.readLine()
    Integer.parseInt(line)
  } catch (e: NumberFormatException) {
    println("Yahoo")
    null
  } finally {
    println("Yahoo")
    reader.close()
  }
}

fun readNumberAsExpression(reader: BufferedReader) {
  val number = try {
    Integer.parseInt(reader.readLine())
  } catch (e: NumberFormatException) {
    // return 시키면 진행 노노
    // return

    // null 주면 진행 오께이
    null
  }

  println(number)
}

/*
오우 코틀린에서는 try-with-resources 문 없고 use 함수를 쓴다?!

또한 checked / unchecked 구분하지 않는다
따라서 함수 선언에 throws IOException 같이 발생 가능한 예외를 선언하지 않는다

try 는 if, when 과 마찬가지로 식으로 평가된다
 */