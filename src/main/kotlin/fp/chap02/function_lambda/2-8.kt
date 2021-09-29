package fp.chap02.function_lambda

fun add8(x: Int, y:Int = 3): Int = x+y

fun main(args: Array<String>) {
    println(add8(9,1))
    println(add8(10))
}
/*
기본 값 지정 가능
 */