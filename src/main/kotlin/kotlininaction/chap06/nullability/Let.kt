package kotlininaction.chap06.nullability

fun main() {
  var email: String? = null
  // 그냥은 넘길 수 없음, 컴파일 에러
  // sendEmailTo(email)

  // 얘는 email 이 null 이 아닌 경우에만 수행됨
  email?.let(::sendEmailTo)

  // 검사 한번 해서 넘겨야 함
  email = if (email != null) email else "NO EMAIL"
  sendEmailTo(email)
}

fun sendEmailTo(email: String) = println("Email 즉시 전송 => $email")

/*
널이 아닌 타입을 받는 함수에 널이 될 수 있는 값을 넘기려면 어떻게 해야하는가
코틀린 언어 자체에서는 의도한 바가 아니기 때문에 지원하지 않는다
표준 라이브러리 함수에 있는 let 함수를 이용해 넘길 수 있다
 */