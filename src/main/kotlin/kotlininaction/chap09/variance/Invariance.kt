package kotlininaction.chap09.variance

import kotlin.reflect.KClass

fun main() {
  val validators = mutableMapOf<KClass<*>, FieldValidator<*>>()
  validators[Int::class] = DefaultIntValidator
  validators[String::class] = DefaultStringValidator
  val stringFieldValidator = validators[String::class] as FieldValidator<String>
  println(stringFieldValidator.validate(""))
}

interface FieldValidator<in T> {
  fun validate(input: T): Boolean
}

object DefaultStringValidator : FieldValidator<String> {
  override fun validate(input: String): Boolean = input.isNotEmpty()
}

object DefaultIntValidator : FieldValidator<Int> {
  override fun validate(input: Int): Boolean = input >= 0
}

/*
Invariance, 반공변성
요놈은 out 과 정확히 반대로 작용, 소비만 할 수 있으며 생산은 할 수 없다
타입 인자의 하위 타입 관계가 제네릭 타입에서 뒤집힌다
Consumer<Animal>은 Consumer<Cat>의 하위 타입이다?!

interface Comparator<in T> {
  fun compare(e1: T, e2: T): Int {...}
}

MutableList<in T> => MutableList<? super T>
MutableList<out T> => MutableList<? extends T>
 */