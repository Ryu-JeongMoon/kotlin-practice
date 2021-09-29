package fp.chap02.pattern_matching

data class CustomUser2(val name: String, val age: Int)

fun checkCondition(value: Any) = when {
    value == "kotlin" -> "hello kotlin!"
    value in 1..20 -> "1 ~ 20"
    value === CustomUser("panda", 85) -> "USER!!!"
    value == CustomUser("panda", 88) -> "USER!!"
    value is CustomUser -> "USER!!!!"
    else -> "something else"
}

fun main(args: Array<String>) {
    println(checkCondition("kotlin"))
    println(checkCondition(6))
    println(checkCondition(CustomUser("panda", 85)))
    println(checkCondition(CustomUser("panda", 88)))
    println(checkCondition(CustomUser("tiger", 100)))
}

/*
=== 참조값 비교
-> java == 비교

== 객체의 값 비교
-> java equals() 비교

is 타입 비교
-> java instanceof ?!
 */