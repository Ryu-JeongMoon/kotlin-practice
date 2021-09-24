package fp.chap01

/*
최초 한번만 평가된다
 */
val lazyValue: String by lazy {
    println("시간 오래 걸리는 작업!!")
    "hello"
}

fun main(args: Array<String>) {
    println(lazyValue)
    println(lazyValue)
}