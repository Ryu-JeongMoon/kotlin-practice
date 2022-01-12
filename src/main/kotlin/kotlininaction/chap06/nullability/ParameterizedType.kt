package kotlininaction.chap06.nullability

fun main() {
  printHashCode(null)

  // 노노
  // printHashCodeWithUpperBound(null)
}

// 요녀석은 컴파일러에 의해 Any? 로 추론된다
fun <T> printHashCode(t: T) = println(t?.hashCode())

// 요놈은 Any 로 상한 잡아놨기 때문에 null 불가
fun <T: Any> printHashCodeWithUpperBound(t: T) = println(t.hashCode())

/*
코틀린에서는 제네릭 T 로 정의된 녀석도 널이 될 수 있는 타입이다
 */