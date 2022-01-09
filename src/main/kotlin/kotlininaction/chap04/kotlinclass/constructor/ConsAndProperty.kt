package kotlininaction.chap04.kotlinclass.constructor

fun main() {
  val block = UserWithInitBlock("block")
  val assign = UserWithAssignment("assign")
  val user = User("user")

  println(user.isSubscribed)

  val twitterUser = TwitterUser("panda")
  println(twitterUser.nickname)
}

// parameter 로 받은 것을 init block 안에서 초기화
class UserWithInitBlock(nickname: String) {
  val nickname: String

  init {
    this.nickname = nickname
  }
}

// parameter 받은 것을 할당
class UserWithAssignment(nickname: String) {
  val nickname = nickname
}

// primary constructor, 제일 심플
open class User(val nickname: String, val isSubscribed: Boolean = true) {
}

class TwitterUser(nickname: String) : User(nickname) {
}

interface Clickable {}

// 인자가 없는 default constructor 코틀린이 만들어줌
open class Button {}

// 인자가 없는 생성자라도 호출해야함, 단 인터페이스 구현 시에는 생성자가 없기 때문에 인터페이스 이름만 작성
class RadioButton: Button(), Clickable {
}

// 유일한 생성자를 비공개로 만든다, 클래스 외부에서 인스턴스화 하지 못함
// 자바에서의 Util, Constant 클래스에 적용하는 비공개 생성자를 아래와 같이 언어에서 기본으로 지원함
class Secretive private constructor() {}