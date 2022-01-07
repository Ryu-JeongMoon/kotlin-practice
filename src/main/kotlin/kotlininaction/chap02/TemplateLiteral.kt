package kotlininaction.chap02

fun main() {
  var name = "panda"
  println("Hello, $name")

  name = "팬더"
  println("$name, 안녕하세유")
  println("${name}, 안녕하세유")

  val s = "hello"
  println("${if(s.length < 2) "too short" else "normal string $s"}")
}

/*
문자열 템플릿에서 $var, ${var} 형태로 사용
$var 자리로 쏙 들어가는 것이 아니라
컴파일하면 $var 자리에 StringBuilder.append(var) 형태로 삽입됨

엥 문자열 템플릿에서 한글 써도 안 깨지는데요??
한글을 문자열 템플릿에서 사용할 때 이전에는 curly braces 형태로 감싸줘야 했나봄 ${}
코틀린 컴파일러가 영문자와 한글을 한꺼번에 식별자로 인식해서 unresolved reference 오류 발생했었다고 함

문자열 템플릿 중첩으로 사용 가능하지만 가독성을 위해 노노
 */