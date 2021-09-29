package fp.chap02.function_lambda

fun add10(x: Int = 10, y: Int = 3) = x + y

fun main(args: Array<String>) {
    println(add10(y = 7))
    println(add10(y = 10, x = 20))
}

/*
명시적으로 y 값 지정해서 출력
 */