package fp.chap02.pattern_matching

class User(var name: String, val age: Int = 55)

fun main(args: Array<String>) {
    val user = User("FP", 32)
    val user2 = User("Kotlin")

    println(user.name)
    println(user.age)

    println(user2.name)
    println(user2.age)
}