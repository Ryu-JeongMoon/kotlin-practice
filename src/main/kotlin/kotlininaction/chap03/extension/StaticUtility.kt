package kotlininaction.chap03.extension

fun main() {

}


/*
자바에서는 모든 것이 클래스
그러나 특정 클래스에 속할 필요가 없는 메서드들이 있는데
이런 애들을 모아두는 용도로 사용하는 것이 XXUtil 네이밍을 사용한 유틸 클래스 (ex. Collections)

코틀린에서는 이를 적폐로 바라봤다
메서드를 코틀린 파일의 최상위 프로퍼티로 선언한다
코틀린에서는 클래스 내부의 메서드로 생성되고 다른 JVM 언어에서 요놈을 호출할 때는
파일 이름이 클래스 이름이 되어 내부에 public static final String joinToStringWithDefaultValue() 요렇게 생성된 놈을 호출

파일에 대응하는 클래스 이름을 변경하고 싶다면 파일 최상위에 @file:JvmName("지정할 클래스 이름")으로 설정하면 된다
 */