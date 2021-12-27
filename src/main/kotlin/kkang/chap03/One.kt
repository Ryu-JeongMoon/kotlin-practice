package kkang.chap03

var sum = 0

fun calSum() {
  for (i in 1..10)
    sum += i
}

fun main(args: Array<String>) {
  calSum()
  calSum()
  println(sum)
}

/*
JVM 에서 구동되기 위해서는 class 가 만들어져야 하지 않은가?
Kotlin 자체로 돌아가는 것이 아니라 JVM 위에서 동작하도록 변형 후 돌아간다
One.kt 에서 class 선언이 되어있지 않으므로 변환될 때 자동으로 One class 가 생성된다
따라서 개발자는 변수와 함수로만 구성해서 작성해도 된다
 */