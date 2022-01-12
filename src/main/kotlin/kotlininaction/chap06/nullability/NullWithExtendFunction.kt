package kotlininaction.chap06.nullability

fun main() {
  verifyUserInput("yaho")
  verifyUserInput(null)
}

fun verifyUserInput(input: String?) {
  // input 이 널인 경우에도 isNullOrBlank 가 처리해줌, 이녀석 계약에 의한 설계했네?!?
  if (input.isNullOrBlank())
    println("Please fill in the required fields => $input")
}

/*
널이 될 수 있는 타입에 대한 확장 함수를 정의하면 내부에서 this 는 null 이 될 수 있고 따라서 명시적으로 Null 검사해주어야 함
자바에서는 수신 객체가 null 인 경우 NPE 터지기 때문에 메서드 내부로 들어가지도 못함
 */