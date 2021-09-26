package fp.chap02

/*
 const val -> static constant, 기본값만 할당될 수 있고 컴파일 시점에 값이 결정된다
 val       -> dynamic constant, 런타임 시점에 값이 결정된다
 ex)
 val num = sumExam(40, 20)
 fun sumExam(a: Int, b: Int) = a + b
*/

const val value: Int = 10
var variable: Int = 10

/*
 val nonNull: Int = null
 언어 차원에서 안전한 널 처리를 지원하기 때문에 컴파일 시점에 오류 생김
 굳이 null 을 할당해야 한다면 ? 연산자 이용
 */
val nullable: Int? = null