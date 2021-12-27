package kkang.chap01

data class User(val no: Int, val name: String, val email: String)

fun main(args: Array<String>) {
  val list = ArrayList<User>()

  val user1 = User(1, "ryu", "modern")
  list.add(user1)

  val user2 = User(1, "ryu", "modern")
  list.add(user2)

  println("List size ${list.size}")

  // data class 비교는 equals == 둘다 쓰나보당
  if (user1 == user2)
    print("user1 == user2")
  else
    print("user1 != user2")
}
// 자바보다 짧아서 좋당