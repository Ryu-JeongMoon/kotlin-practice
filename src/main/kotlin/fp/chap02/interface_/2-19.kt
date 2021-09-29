package fp.chap02.interface_

interface Foo {
    fun printFoo()
    fun printFoo2() = println("Foo2")
}

interface Bar {
    fun printBar()
    fun printBar2() = println("Bar2")
}

class Kotlin: Foo, Bar {
    override fun printFoo() {
        println("Foo")
    }

    override fun printBar() {
        println("Bar")
    }

    override fun printFoo2() {
        super<Foo>.printFoo2()
        println("Foo2Foo2")
    }
}

fun main(args: Array<String>) {
    val kotlin = Kotlin()
    kotlin.printFoo()
    kotlin.printBar()

    kotlin.printFoo2()
    kotlin.printBar2()
}

/*
코틀린에서도 interface 존재!
: 기호로 상속을 표현
, 기호로 다중 상속 표현
-> 다중 상속 가능?!

인터페이스에서 함수 구현도 가능하고 그대로 쓸 수도 있다!?
구현한 함수 오버라이딩 가능, 오버라이딩된 함수 호출됨
이런게 어딨담 참나 ~~

오버라이딩할 때 super 타입의 함수도 호출 가능!!!!
 */