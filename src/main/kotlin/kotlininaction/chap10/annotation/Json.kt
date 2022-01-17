package kotlininaction.chap10.annotation

import kotlininaction.chap10.annotation.jkid.*
import kotlininaction.chap10.annotation.jkid.deserialization.deserialize
import kotlininaction.chap10.annotation.jkid.serialization.serialize
import java.util.*

fun main() {
  val person = Person("Alice", 29, CompanyImpl("Kakao"), Date())
  println(serialize(person))

  val json = serialize(person)
  println(deserialize<Person>(json))
}

// 직렬화에서 제외할 프로퍼티는 반드시 default value 지정해줘야함, 그렇지 않은 경우 역직렬화 시 인스턴스 생성 불가
data class Person(
  @JsonName("alias") val firstName: String,
  @JsonExclude val age: Int? = null,
  @DeserializeInterface(CompanyImpl::class) val companyImpl: CompanyImpl,
  @CustomSerializer(DateSerializer::class) val birthDate: Date
)

/*
DateSerializer 를 StringSerializer 처럼 구현한 후 Date 프로퍼티 Person 안에 넣었더니 아래 예외 발생
Caused by: java.lang.IllegalAccessException: class kotlin.reflect.jvm.internal.calls.CallerImpl$FieldGetter cannot access a member of class java.util.Date (in module java.base) with modifiers "private transient"

DateSerializer 구현할 때는 date-format 이 있어야 하는고만
 */