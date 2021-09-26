package fp.chap02

fun twice1(value: Int): Int {
    return value * 2
}

fun twice2(value: Int): Int = value * 2

fun twice3(value: Int) = value * 2

/*
{} 안에는 타입 추론이 안 됨, 명시하지 않으면 Unit이 반환된다
Kotlin : Unit -> Java : void 와 같음
 */