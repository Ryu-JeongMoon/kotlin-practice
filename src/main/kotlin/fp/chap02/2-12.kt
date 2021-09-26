package fp.chap02

fun Int.product(value:Int): Int {
    return this * value
}

fun main(args: Array<String>) {
    print(10.product(2))
}

/*
extension function
상속, 내부 수정이 없어도 함수나 프로퍼티 추가!
 */