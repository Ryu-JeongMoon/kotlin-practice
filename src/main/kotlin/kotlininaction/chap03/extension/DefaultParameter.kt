package kotlininaction.chap03

fun main() {
  val list = listOf(1, 5, 8)

  // 오 이거 야무지당
  println(joinToStringWithDefaultValue(list))
  println(joinToStringWithDefaultValue(list, "/"))
  println(joinToStringWithDefaultValue(list, "/", "["))
  println(joinToStringWithDefaultValue(list, "/", "[", "]"))

  // named parameter 로 인자 순서도 바꿔버릴 수 있네?!
  println(joinToStringWithDefaultValue(list, "/", postfix =  "[", prefix = "]"))
}

@JvmOverloads
fun <T> joinToStringWithDefaultValue(
  collection: Collection<T>,
  separator: String = ", ",
  prefix: String = "",
  postfix: String = ""
): String {
  val result = StringBuilder(prefix)

  for ((index, element) in collection.withIndex()) {
    if (index > 0)
      result.append(separator)
    result.append(element)
  }

  result.append(postfix)
  return result.toString()
}


/*
함수 선언 시 default 값 줘서 반복되는 오버로드를 줄일 수 있다, 개꿀
** 주의할것 **, default 재정의한다면 기존 모든 코드에 영향이 간다

자바에서는 메서드 선언 시 default 값 지원하지 않기 때문에
자바에서 코틀린 함수를 호출할 시 모든 인자를 명시해줘야 한다
그럴 때 @JvmOverloads 이용하면 오버로드된 메서드 작성해준다리
 */