package fp.chap01

var someName: String = "Joe"

// 헉스.. 출력 작업 자체가 부수효과를 일으킨다?!
fun hello(name: String) {
    println("hello $name")
}

fun transparent(name: String): String {
    return "hello $name"
}

fun printName(helloStr: String) {
    println(helloStr)
}

fun main(args: Array<String>) {
    // side effect O
    hello(someName)

    // side effect X
    printName(transparent(someName))
}