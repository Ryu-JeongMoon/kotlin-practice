package fp.chap02

fun main(args: Array<String>) {
    for (i in 1..3) {
        println(i)
    }

    for (i in 1 until 3) {
        println(i)
    }

    for (i in 6 downTo 0 step 2) {
        println(i)
    }
}

/*
..
-> a ~ b range 나타낸당

until
-> last value x, rangeClosed 느낌

downTo + step
-> step 만큼씩 내려가기
 */