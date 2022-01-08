package kotlininaction.chap03.local


fun main() {
  saveUser(User(5, "tiger"))
}

class User(val id: Int, val name: String, val address: String = "seoul")

fun saveUser(user: User) {
  user.validateBeforeSave()

  print("saveBlahBlah")
}

fun User.validateBeforeSave() {
  fun validate(value: String, fieldName: String) {
    if (value.isEmpty()) {
      throw IllegalArgumentException("Can't save user -> $fieldName")
    }
  }
  validate(name, "name")
  validate(address, "address")
}