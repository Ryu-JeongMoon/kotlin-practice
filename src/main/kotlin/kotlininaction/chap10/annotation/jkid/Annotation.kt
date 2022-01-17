package kotlininaction.chap10.annotation.jkid

import kotlin.reflect.KClass

@Target(AnnotationTarget.PROPERTY)
annotation class JsonExclude

@Target(AnnotationTarget.PROPERTY)
annotation class JsonName(val name: String)

interface ValueSerializer<T> {
  fun toJsonValue(value: T): Any?
  fun fromJsonValue(jsonValue: Any?): T
}

// KClass 는 java.lang.Class 와 같은 역할
@Target(AnnotationTarget.PROPERTY)
annotation class DeserializeInterface(val targetClass: KClass<out Any>)

@Target(AnnotationTarget.PROPERTY)
annotation class CustomSerializer(val serializerClass: KClass<out ValueSerializer<*>>)

/*
annotation 에 붙이는 meta-annotation, 컴파일러가 annotation 처리하는 방법을 제어한다

자바에서는 @Retention 을 이용해 annotation 의 생명 주기를 소스, 컴파일, 런타임에 접근 가능하도록 설정할 수 있다
대부분의 annotation 은 런타임에도 사용할 수 있어야 하기 때문에 코틀린에서는 default runtime 으로 지정했기 때문에
따로 @Retention(AnnotationRetention.RUNTIME) 지정 안 해줘도 된다
 */