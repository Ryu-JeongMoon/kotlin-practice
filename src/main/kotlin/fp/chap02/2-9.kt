package fp.chap02

fun add9(x: Int = 10, y: Int = 3) = x + y

fun main(args: Array<String>) {
    println(add9())
    println(add9(7))
}

/*
parameter 지정 안 해주면 앞에서부터 들어감
그래서 x = 7, y = 3 -> 10
 */