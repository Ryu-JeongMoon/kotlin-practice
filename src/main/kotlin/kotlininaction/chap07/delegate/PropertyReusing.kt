package kotlininaction.chap07.delegate

fun main() {

}

/*
delegated property 의 일반 문법
class Foo {
  var p: Type by Delegate()
}

요런 식으로 숨겨진 property 생성하여 p 에 수행하는 행위를 delegate 에 위임해뿌린다
class Foo {
  private val delegate = Delegate()
  var p: Type
  set(value: Type) = delegate.setValue(..., value)
  get() = delegate.getValue(...)
 */