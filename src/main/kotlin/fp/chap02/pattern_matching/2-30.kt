package fp.chap02.pattern_matching

sealed class Expr
data class Const(val number: Double): Expr()
data class Sum(val e1: Expr, val e2: Expr): Expr()
object NotANumber: Expr()

fun main(args: Array<String>) {
    val const = Const(2.5)
    val sum = Sum(const, const)
    val notANumber = NotANumber

    println(const.number)
    println(sum.e1)
    println(notANumber)
}

/*
enum 타입을 확장한 것이 sealed class, 클래스를 묶은 클래스

제약 없이 새로운 타입을 확장할 수 있다?
하위 클래스는 sealed class 와 동일한 파일에서 선언해야 함
 */