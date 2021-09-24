package fp.chap01

fun main(args: Array<String>) {
    val calculator = SimpleCalculator()

    println(calculator.calculate('+', 3, 1))
    println(calculator.calculate('-', 3, 1))
}

class SimpleCalculator {
    fun calculate(operator: Char, num1: Int, num2: Int): Int = when (operator) {
        '+' -> num1 + num2
        '-' -> num1 - num2
        else -> throw IllegalArgumentException()
    }
}