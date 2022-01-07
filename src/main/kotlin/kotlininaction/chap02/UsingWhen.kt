package kotlininaction.chap02

import kotlininaction.chap02.Color.*

fun main() {
  println(getMnemonic(RED))

  println(getWarmth(INDIGO))

  println(mix(YELLOW, BLUE))
}

// break 없어도 됨
fun getMnemonic(color: Color) =
  when (color) {
    RED -> "Richard"
    ORANGE -> "Of"
    YELLOW -> "York"
    GREEN -> "Gave"
    BLUE -> "Battle"
    INDIGO -> "In"
    VIOLET -> "Vain"
  }

// comma 를 통해 여러 조건을 같은 분기에 넣을 수 있듬
fun getWarmth(color: Color) =
  when (color) {
    RED, ORANGE, YELLOW -> "warm"
    GREEN -> "neutral"
    BLUE, INDIGO, VIOLET -> "cold"
  }

// enum 상수, 숫자 / 문자 리터럴만 허용 가능한 자바와는 달리
// 코틀린에서는 임의의 객체도 허용한다?! 미쳤다리
fun mix(c1: Color, c2: Color) =
  when (setOf(c1, c2)) {
    setOf(RED, YELLOW) -> ORANGE
    setOf(YELLOW, BLUE) -> GREEN
    setOf(RED, VIOLET) -> INDIGO
    else -> throw Exception("Dirty Color")
  }

// mix 에서는 비교할 때마다 set 이 생성된다
// 만약 mix 가 자주 호출되는 메서드라면 쓰잘데기 없는 객체 생성이 많아지는 것
// 그냥 조건 검사로 최적화 수행, 이는 가독성을 희생하여 성능 향상
fun mixOptimized(c1: Color, c2: Color) =
  when {
    (c1 == RED && c2 == YELLOW) || (c1 == YELLOW && c2 == RED) -> ORANGE
    (c1 == YELLOW && c2 == BLUE) || (c1 == BLUE && c2 == YELLOW) -> GREEN
    (c1 == RED && c2 == VIOLET) || (c1 == VIOLET && c2 == RED) -> INDIGO
    else -> throw Exception("Dirty~~")
  }


/*
kotlin when 은 java switch 를 대체하는 제어 구조, 코틀린 것이 훨씬 좋구먼
 */