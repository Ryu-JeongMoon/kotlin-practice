package kotlininaction.chap01

fun main() {
  typeCheck(595959)
  typeCheck(595959L)
  typeCheck("YAHOO")
}

fun typeCheck(value: Any) {
  when (value) {
    is Int -> println("INT : $value")
    is Long -> println("LONG : $value")
    is String -> println("STRING :  $value")
  }
}

/*
코틀린은 자바에 있는 불편함을 해소하기 위해 만든 언어다
그만큼 상호 운용성이 중요하게 생각하여 설계했고 자바 컴파일러가 코틀린 코드를 읽어
.class 만들어 주기 때문에 JVM 위에서 완벽하게 호환되며 동작할 수 있는 것

?. ?: !! 등의 연산자로 널을 지원하는지, 안 하는지, 널이 아닌지 등에 대해 간단하게 알려줄 수 있다
패러다임에 맞춰 코드를 작성하도록 강제하지 않기 때문에 어떤 패러다임으로 코드를 작성할 것인지
온전히 개발자에 달려있어 유연한 코드 작성이 가능하다

태생부터 NPE 방지, FP 등을 야무지게 지원하고 자바에 비해 간결한 코딩이 가능하다
이는 더 짧은 코드 길이를 목표로 한 것이 아니라 준비 코드, boilerplate 를 줄임으로써 가능해진 것이다
장황하게 작성해야 했던 getter, setter, constructor 등을 data class 사용 시 암묵적으로 생성해준다
 */