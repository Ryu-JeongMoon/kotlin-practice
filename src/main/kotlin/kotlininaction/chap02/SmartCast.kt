package kotlininaction.chap02

fun main() {
  val num5 = Num(5)
  val num9 = Num(9)

  val sum14 = Sum(num5, num9)
  val sum23 = Sum(sum14, num9)

  println("evalInJava(sum23) = ${evalInJava(sum23)}")
}

interface Expr
class Num(val value: Int) : Expr
class Sum(val left: Expr, val right: Expr) : Expr

// java 라면 if 문 + instanceof 로 검사 했겠지?!
fun evalInJava(e: Expr): Int {
  if (e is Num) {
    val n = e as Num
    return n.value
  } else if (e is Sum) {
    return evalInJava(e.right) + evalInJava(e.left)
  } else {
    throw IllegalArgumentException("Unknown Expression")
  }
}

// compiler 가 대신 캐스팅해준다 -> smart cast
fun evalInKotlin(e: Expr) =
  when (e) {
    is Num -> {
      println("e = $e")
      e.value
    }
    is Sum -> evalInJava(e.right) + evalInJava(e.left)
    else -> throw IllegalArgumentException("Unknown Expression")
  }


/*
단 스마트 캐스트는 프로퍼티가 val 로 선언된 경우에만 적용된다?!
명시적으로 타입 캐스팅하기 위해서는 e as Num 처럼 as <T> 형태로 붙여준다

블록이 값을 만들어내야 하는 경우, 블록의 마지막 식이 블록의 결과
evalInKotlin 에서 return e.value 로 하면 컴파일 에러남 반드시 마지막 식에 e.value 놔야 오께이
 */