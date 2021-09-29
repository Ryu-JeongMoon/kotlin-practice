package fp.chap02.function_lambda

fun sum(x: Int, y: Int, calculate: (Int, Int) -> Int): Int {
    return calculate(x, y)
}

val value11 = sum(5, 10, { x, y -> x + y })

/*
일급함수, 람다식은 밖으로 꺼낼 수도 있넹 (IDE 가 알려줌)
 */