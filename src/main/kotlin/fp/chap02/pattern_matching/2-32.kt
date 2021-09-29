package fp.chap02.pattern_matching

data class CustomUser(val name: String, val age: Int)

fun checkValue(value: Any) = when (value) {
    "kotlin" -> "hello kotlin!"
    in 1..10 -> "1..10"
    11, 15 -> "11 or 15"
    is CustomUser -> "User"
    else -> "SomeThingElse"
}

fun main(args: Array<String>) {
    println(checkValue("KOTLIN"))
    println(checkValue("kotlin"))
    println(checkValue(15))
    println(checkValue(14))
    println(checkValue(5))
    println(checkValue(User("tiger", 22)))
    println(checkValue(CustomUser("panda", 25)))
}

/*
kotlin - Any == java - Object
최상위 객체
 */