package fp.chap01

fun pureFunction(x: Int, y: Int): Int = x + y

fun main(args: Array<String>) {
    println(pureFunction(5, 5))
}

/*
순수한 함수란 인자로 받은 값으로 새로운 값을 만들어 내거나 재할당 되지 않는 상수를 이용한다 !
-> 외부 변수를 쓰냐 안 쓰냐 보다 그 값이 변할 수 있는 값인지 아닌지로 판단?!
 */