package kotlininaction.chap07.delegate

fun main() {
  val lazyPerson = LazyPerson("YAHOO")
  println(lazyPerson.emails)

  val lazyPersonWithDelegateProperty = LazyPersonWithDelegateProperty("GOOGLE")
  println(lazyPersonWithDelegateProperty.emails)
}

class LazyPerson(val name: String) {
  private var _emails: List<String>? = null
  val emails: List<String>
    get() = _emails ?: loadEmails(this)

  private fun loadEmails(lazyPerson: LazyPerson): List<String> = listOf("panda", "bear")
}

class LazyPersonWithDelegateProperty(val name: String) {
  val emails by lazy { loadEmails(this) }
  private fun loadEmails(lazyPerson: LazyPersonWithDelegateProperty): List<String> = listOf("panda", "bear")
}

/*
Lazy Initialization, 지연 초기화
사용하는 빈도에 비해 초기화 과정에 비용이 많이 드는 경우 사용한다

위에서는 _emails 로 backing property 기법을 사용한다, 요놈은 스레드 안전하지 않고 get 이 캡슐화되지 않았기 때문에 가독성도 구리다
아래에서는 by lazy 로 delegate property 기법을 사용한다, lazy 메서드는 기본적으로 스레드 안전하고 get 도 캡슐화되어 있다
 */