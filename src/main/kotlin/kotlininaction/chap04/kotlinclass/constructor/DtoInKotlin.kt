package kotlininaction.chap04.kotlinclass.constructor

fun main() {
  val kotlinClient = KotlinClient("panda", 555)
  val pandaClient = KotlinClient("panda", 555)

  println(kotlinClient.name)
  println(kotlinClient.postalCode)
  println(kotlinClient)

  println(kotlinClient == pandaClient)
  println(kotlinClient === pandaClient)

  println(kotlinClient.hashCode())
  println(pandaClient.hashCode())

  val copy = kotlinClient.copy()
  println(copy.name)
  println(copy.postalCode)

  copy.name = "tiger"
  println(copy.name)

}

data class KotlinClient(var name: String, val postalCode: Int)


/*
data class 의 property 는 무조건 val 일 필요 없다 var 써도 되지만
일반적으로 권장되는 방식은 val 을 써서 불변 객체를 만드는 것이다

var 을 써서 가변 객체로 만든다면 hash 를 사용하는 컬렉션에 담은 후
객체의 값을 변경하면 컨테이너의 상태가 올바르지 않을 수 있기 때문

불변 객체를 사용하는 이유는 대규모 프로젝트일 수록 변경의 영향을 파악하기 힘들게 되고
이러한 불확실성을 최대한 제어할 수 있는 것이 no-side effect function 과 immutable object

모던 애플리케이션의 경우, multi-core, multi-thread 안 쓰는 상황은 거의 없다
따라서 위의 언급한 두 요소의 중요성이 점점 커지고 있다
그러나 모든걸 함수형 패러다임으로 만들면 값을 확실하게 보장할 수는 있으나 사람이 이해하기 난해해진다
 */