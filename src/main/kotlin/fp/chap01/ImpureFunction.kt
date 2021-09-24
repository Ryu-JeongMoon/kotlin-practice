package fp.chap01

fun main(args: Array<String>) {
    println(impureFunction(5, 5))
    z = 20
    println(impureFunction(5, 5))

    // side effect -> z 값을 바꿔버림
    println(impureFunctionWithSideEffect(5, 5))
    println(z)
    println("======================")

    println(impureFunction(1,2))
    println(impureFunctionWithSideEffect(10,20))
    println(impureFunction(1,2))
}

var z = 10

fun impureFunction(x: Int, y: Int): Int = x + y + z

fun impureFunctionWithSideEffect(x: Int, y: Int): Int {
    z = y
    return x + y
}

/*
외부 변수의 값이 변할 때 반환하는 값도 달라진다
비순수 함수, 더러운 자식
 */



