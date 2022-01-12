package kotlininaction.chap06.nullability

fun main() {
  val stringPrinter = StringPrinter()
  stringPrinter.process("hoho")

  // null 불가
  // stringPrinter.process(null)

  val nullableStringPrinter = NullableStringPrinter()
  nullableStringPrinter.process(null)
}

// 메서드 안에서 parameter 쓰지 않더라도 널이 될 수 없는 타입으로 선언되어 있다면
// 내부적으로 assertion 들어가기 때문에 AssertionError 터짐
class StringPrinter: StringProcessor {
  override fun process(value: String) {
    println("yahoo~~~")
  }
}

class NullableStringPrinter: StringProcessor {
  override fun process(value: String?) {
    println("yahoo~~~~~~~~~~")
  }
}