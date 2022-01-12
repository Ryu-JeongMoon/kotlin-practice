package kotlininaction.chap06.nullability

fun main() {
  // Kotlin 에서는 null 을 받을 수 없도록 메서드 선언을 해놨다면 null 을 넣는 것 만으로도 컴파일 에러로 잡힘
  // Null can not be a value of a non-null type String
  // strLen(null)

  // 오잉 NPE 안 터지고 null 반환 해뿌네
  println(strLenWithNullability(null))

  println(strLenWithNullExamination(null))
}

fun strLen(s: String) = s.length

fun strLenWithNullability(s: String?) = s?.length

// ?: 널일 때 반환할 값 또는 코드
fun strLenWithNullExamination(s: String?) = s?.length ?: 0


/*
nullability
NPE 를 피할 수 있게 하는 코틀린 타입 시스템의 특성
NPE 터질 가능성을 runtime -> compile time 으로 옮김

왜 타입을 쓰는가
특정 타입의 연산을 성공적으로 수행하는 것을 보장한다
그러나 자바에서는 Null 을 다루는 타입 시스템이 부족하기 때문에 String, Integer 등의 타입에 null 을 받을 수 있다
이렇게 함으로써 일일이 Null 검사를 수행하거나, 문서화 시 NullPointerException 발생 가능을 명시해야 한다
IDE 가 발전하면서 @Nullable, @NotNull 등의 애노테이션으로 널 여부를 판별하거나
NPE 발생 가능 위치를 찾을 수 있게 해주지만 이들은 부가적인 기능이고 컴파일 과정의 표준 절차가 아니기 때문에 번거로운건 마찬가지

코틀린에서는 이를 Nullable 타입으로 해결한다
타입 선언 시에 기본적으로 null 이 불가능한 타입으로 지정되고 필요하다면 타입 뒤에 ? 를 두어 널 가능성을 명시한다
이는 컴파일 시점에 모두 처리되어 런타임 시점에 부가비용이 들지 않는다

safe call operator, ?.
아래 두 코드는 같은 코드다
?. 는 null 을 다루는 방법을 간결하게 표현할 수 있게 한다, 호출하려는 값이 null 이면 null 반환한다
s?.toUpperCase()
if (s != null) s.toUpperCase() else null
 */