package fp.chap01

/*
오호 .. 함수 넘길 때는 {중괄호} 써줘야 하나봄
함수를 인자 값으로 넘긴당.. 신기방기
*/
fun main(args: Array<String>) {
    val fpCalculator = FPCalculator()

    println(fpCalculator.calculate({n1, n2 -> n1 + n2}, 3, 1))
    println(fpCalculator.calculate({n1, n2 -> n1 - n2}, 3, 1))
}

class FPCalculator {
    fun calculate(calculator: (Int, Int) -> Int, num1: Int, num2: Int): Int {
        if (num1 > num2 && num2 != 0)
            return calculator(num1, num2)
        else
            throw IllegalArgumentException()
    }
}