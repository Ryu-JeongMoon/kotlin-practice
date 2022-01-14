package kotlininaction.chap08.highorder

fun main() {
  twoAndThree { x, y -> x + y }
  twoAndThree { x, y -> x - y }
  twoAndThree { x, y -> x * y }
  twoAndThree { x, y -> x / y }
  twoAndThree { x, y -> x % y }

  println("YAHO".filter { c -> c != 'Y' })

  println(myFunction().invoke(1,2,3,4))
}

fun twoAndThree(operation: (Int, Int) -> Int) {
  val result = operation(2, 3)
  println("The result is $result")
}

fun String.filter(predicate: (Char) -> Boolean): String {
  val sb = StringBuilder()
  for (index in indices) {
    val element = get(index)
    if (predicate(element)) sb.append(element)
  }
  return sb.toString()
}

fun myFunction(): (Int, Int, Int, Int) -> Int = { x, y, z, u -> x + y + z + u }