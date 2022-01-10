package kotlininaction.chap04.kotlinclass.kotlinobject

import kotlininaction.chap04.kotlinclass.constructor.getFacebookName

fun main() {
  MainClass.bar()

  val mainUser = MainUser.newSubscribingUser("panda")

}

class MainClass {
  // 동반 객체는 이름을 따로 지정해줄 필요 없다
  // companion object 안에서 외부 클래스의 private 필드, 메서드에 접근 가능 -> 팩토리 메서드 구현에 알맞은 위치
  companion object {
    fun bar() {
      println("Companion object called")
    }
  }
}

class MainUser private constructor(val nickname: String) {

  companion object {
    fun newSubscribingUser(email: String) = MainUser(email.substringBefore('@'))
    fun newFacebookUser(accountId: Int) = MainUser(getFacebookName(accountId))
  }
}

/*
코틀린은 static keyword 지원하지 않는다
최상위 함수를 이용해 정적 메서드처럼 사용할 수 있다
 */