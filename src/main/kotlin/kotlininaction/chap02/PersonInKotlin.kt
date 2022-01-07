package kotlininaction.chap02

class PersonInKotlin(val name: String)

/*
신통방통하구만, 코틀린에서 변수의 기본 가시성이 public
기본 가시성이 왜 public 인가
OCP 깨는 것일터인디

personInKotlin.name 이렇게 사용하더라도 필드에 직접 접근하는 것이 아닌
getter 호출이고 만약 var 로 선언하고 값을 변경한다면 setter 호출
*/