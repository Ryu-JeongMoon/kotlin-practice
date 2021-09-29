package fp.chap02.pattern_matching

data class Person(val firstName: String, val lastName: String, val age: Int)

fun main(args: Array<String>) {
    val person = Person("panda", "bear", 50)
    println("name = ${person.firstName} ${person.lastName}\nage = ${person.age}")
}

/*
equals, hashcode 자동으로 overriding 되어 있음둥
 */