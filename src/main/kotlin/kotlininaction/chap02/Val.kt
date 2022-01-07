package kotlininaction.chap02

fun main() {
  val languages = arrayListOf("Java")
  languages.add("Kotlin")
  println("languages = $languages")

  var answer = 42
  // 다른 타입으로 재할당 불가
  // answer = "Yaho"
  answer = 43
  println("answer = $answer")
}

/*
val 로 선언한 languages 에 재할당이 불가할 뿐
languages 가 객체 타입이라면 내부의 값을 바꿀 수 있다

var 로 선언하면 값은 변경될 수 있으나
변수 선언 시의 타입으로 해당 변수의 타입을 추론하기 때문에 타입까지 바꿀 수는 없다
다른 타입으로 저장해야 한다면 coerce, 강제 형 변환시켜야 함
 */