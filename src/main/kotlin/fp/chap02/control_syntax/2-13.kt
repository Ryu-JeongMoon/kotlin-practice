package fp.chap02.control_syntax

fun main(args: Array<String>) {
    val max: Int
    var x: Int = 6
    var y: Int = 55

    // if문을 구문으로 사용한 예
    if (x > y)
        max = x
    else
        max = y

    // if문을 표현식으로 사용한 예
    val max2: Int = if (x > y) x else y

    println(max)
    println(max2)
}

