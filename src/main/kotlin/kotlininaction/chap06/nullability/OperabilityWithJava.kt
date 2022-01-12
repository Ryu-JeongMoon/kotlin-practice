package kotlininaction.chap06.nullability

fun main() {
  // NPE 펑
  val javaJava = JavaJava(null)
  println(javaJava.name.uppercase())

  // 널 검사
  println(javaJava.name?.uppercase())
}

/*
자바에서는 null possibility 지원하지 않는다
어떻게 상호운용이 가능한가
기본적으로 JSR-305 표준, 안드로이드, 제트브레인스 도구들이 지원하는 애노테이션을 읽고 널 가능성을 파악한다

이러한 부가 정보가 없는 경우에 플랫폼 타입으로 변환한다
이는 널이 될 수도 있고 안 될 수도 있는 간잽이 타입
널 검사를 수행해도 되고 안 해도 된다

왜 플랫폼 타입을 도입했는가
모든 타입을 널이 될 수 있는 타입으로 가정하면 쉽지 않을까?
보통 자바 -> 코틀린으로 변환하기 땜시 대부분의 자바 코드는 개발자가 알 수 있을 것이고
null 이 될 수 있는지 아닌지도 개발자에 판단에 맡겨버린 것
모두를 널이 될 수 있는 타입으로 해버리면 불필요한 널 검사 중복 미쳐버료
 */