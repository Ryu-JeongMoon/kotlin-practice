package fp.chap02

fun main(args: Array<String>) {
    val kotlin2 = Kotlin2()
    println(kotlin2.bar)
    println(kotlin2.bar2)
}

interface Foo2 {
    val bar: Int
    val bar2: Int
        get() = 6

    fun printFoo() {
        println("Foo")
    }
}

class Kotlin2: Foo2 {
    override val bar: Int = 3
}

/*
interface 에서 선언한 추상 프로퍼티를 구현한 클래스에서 오버라이딩해서 정의
interface 에서 getter 로 프로퍼티 초기화;;
 */