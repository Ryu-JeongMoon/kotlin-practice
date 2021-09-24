package fp.chap01

fun main(args: Array<String>) {
    val plusCalculator = OOPCalculator(Plus())
    println(plusCalculator.calculate(3,1))

    val minusCalculator = OOPCalculator(Minus())
    println(minusCalculator.calculate(3,1))
}

interface Calculator {
    fun calculate(num1: Int, num2: Int): Int
}

class Plus : Calculator {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 + num2
    }
}

class Minus : Calculator {
    override fun calculate(num1: Int, num2: Int): Int {
        return num1 - num2
    }
}

class OOPCalculator(private val calculator: Calculator) {
    fun calculate(num1: Int, num2: Int): Int {
        if (num1 > num2 && num2 != 0)
            return calculator.calculate(num1, num2)
        else
            throw IllegalArgumentException()
    }
}