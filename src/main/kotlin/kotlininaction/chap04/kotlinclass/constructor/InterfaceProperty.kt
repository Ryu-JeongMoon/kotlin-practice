package kotlininaction.chap04.kotlinclass.constructor

fun main() {

}

// 코틀린에서는 인터페이스에 추상 프로퍼티를 선언할 수 있다
interface KotlinUser {
  val nickname: String
}

class PrivateUser(override val nickname: String): KotlinUser

class SubscribingUser(val email: String) : KotlinUser {
  override val nickname: String
    get() = email.substringBefore('@')
}

class FacebookUser(val accountId: Int): KotlinUser {
  override val nickname = getFacebookName(accountId)
}

fun getFacebookName(accountId: Int) = "yaho"