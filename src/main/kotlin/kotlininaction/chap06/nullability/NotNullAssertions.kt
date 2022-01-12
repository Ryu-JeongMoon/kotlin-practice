package kotlininaction.chap06.nullability

fun main() {
  // not-null assertion 해도 널이지롱
  // val nothing = null!!

  ignoreNulls(null)
}

fun ignoreNulls(s: String?) {
  val sNotNull: String = s!!
  println(sNotNull.length)
}

/*
not-null assertion, !!
널이 아님을 확실히 보장할 수 있을 때

!! 연산자의 스택 트레이스에는 몇번째 줄인지까지는 들어있지만 정확한 부분은 알려주지 않는다
따라서 아래와 같이 연쇄적인 !! 연산자 사용을 지양한다
person.company!!.address!!.county
 */