package fp.chap02

fun main(args: Array<String>) {
    val x = 5
    val numType = when {
        x == 0 -> "zero"
        x > 0 -> "positive"
        else -> "negative"
    }

    val numType2 = if (x>0) "panda" else "bear"

    println(numType)
    println(numType2)
}

/*
분기 조건을 조건문으로 작성할 때엔 (x) 생략 가능
when 쓸 때도 else 지정해줘야 한당
 */