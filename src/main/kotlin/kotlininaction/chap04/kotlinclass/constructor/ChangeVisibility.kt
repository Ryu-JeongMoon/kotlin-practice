package kotlininaction.chap04.kotlinclass.constructor

fun main() {
  val lengthCounter = LengthCounter()
  lengthCounter.addWord("yaho")
  println(lengthCounter.counter)
}

class LengthCounter {
  var counter: Int = 0
    private set

  fun addWord(word: String) {
    counter += word.length
  }
}