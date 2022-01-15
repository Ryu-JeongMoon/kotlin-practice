package kotlininaction.chap09.type

fun main() {
  println(max("kotlin", "java"))

  val helloWorld = StringBuilder("Hello World")
  ensureTrailingPeriod(helloWorld)
  println("helloWorld = $helloWorld")

  // not-null 지정했으므로 null 넣을 시 컴파일 에러
  // process(null)
  println(process("YAHOO"))
}

fun <T : Comparable<T>> max(first: T, second: T): T {
  return if (first > second) first else second
}

// 둘 이상의 제약을 가할 때, where 키워드 사용
fun <T> ensureTrailingPeriod(seq: T)
    where T : CharSequence, T : Appendable {
  if (!seq.endsWith('.')) {
    seq.append('.')
  }
}

// default 로 Any? 상속하기 때문에 null 지정 가능하나, Any 를 명시적으로 상속하여 not-null parameter 로 만들 수 있다
fun <T : Any> process(value: T): Int {
  return value.hashCode()
}

/*
리스트에서 모든 원소의 합을 구하는 sum 같은 메서드는 Int, Double 에는 적용 가능하나 String 에는 적용하지 않아야 한다
이런 경우 사용하는 것이 Type Parameter Constraint, 타입 파라미터 제약이다
Number 의 하위 클래스에만 적용 가능하도록 하는 upper bound
fun <T: Number> List<T>.sum(): T {...}
 */