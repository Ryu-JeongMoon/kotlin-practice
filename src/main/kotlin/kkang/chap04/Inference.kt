package kkang.chap04

const val infer1: Int = 10

fun main(args: Array<String>) {
  println(infer1)
  println(infer2)

  // localData 초기화 안 하고 호출해도 에러 X
  infer()
}

// property must be initialized
// const 로 바꾸라고 알려줌
// 상수는 const val 쓰고 readonly data 일때 val 쓰나봐?
val infer2: String = "hehe"

fun infer() {
  // 함수 안에서는 즉시 초기화 안 해도 되지만 타입 지정해줘야 함
  val localData: Int

  // 함수 내에서 즉시 초기화해줄 때 타입 지정 안 해도 됨
  val localData2 = 5
  println(localData2)
}