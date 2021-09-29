package fp.chap02.pattern_matching

fun eval(expr: Expr): Double = when(expr) {
    is Const -> expr.number
    is Sum -> eval(expr.e1) + eval(expr.e2)
    NotANumber -> Double.NaN
}

fun main(args: Array<String>) {
    println(eval(Const(3.3)))
    println(eval(Sum(Const(3.3), Const(9.9))))
    println(eval(NotANumber))
}

/*
sealed class + when -> pattern matching
when 표현식에서 모든 케이스를 다룰 때엔 else 없어도 된다
 */