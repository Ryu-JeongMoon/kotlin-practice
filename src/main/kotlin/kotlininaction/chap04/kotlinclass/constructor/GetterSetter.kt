package kotlininaction.chap04.kotlinclass.constructor

fun main() {
  val user = FieldUser("Alice")
  user.address = "Elsenheimerstrasse 47, 80687 Muenchen"
}

class FieldUser(val name: String) {
  var address: String = "unspecified"
    set(value: String) {
      println(
        """
        Address was changed for $name:
        "$field" -> "$value".""".trimIndent()
      )
      field = value
    }
}