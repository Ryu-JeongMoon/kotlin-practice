package fp.chap01

val infiniteValue = generateSequence(0) { it + 5 }

/*
0부터 5 더하면서 무한대를 값에 담고
메인에서는 take(5) 5개만 택하겠다!
 */
fun main(args: Array<String>) {
    infiniteValue.take(5).forEach { println("$it") }
}
