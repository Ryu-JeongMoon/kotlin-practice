package kotlininaction.chap07.overloading.collection

import java.time.LocalDate

fun main() {
  for (c in "yaho")
    println(c)

  val newYear = LocalDate.ofYearDay(2022, 1)
  val daysOff = newYear.minusDays(1)..newYear
  for (dayOff in daysOff)
    println(dayOff)
}

operator fun ClosedRange<LocalDate>.iterator(): Iterator<LocalDate> =
  object : Iterator<LocalDate> {
    var current = start
    override fun hasNext(): Boolean = current <= endInclusive
    override fun next(): LocalDate = current.apply { current = plusDays(1) }
  }

/*
for loop 도 in 연산자를 사용하는데 membership check 하는 in 과 다르다
이 때의 in 은 iterator 를 호출하여 반복되는 데이터를 얻는다

코틀린에서는 split 으로 자르거나 toCharArray() 써서 배열로 만들지 않아도 일반적인 문자열에 대한 for loop 도 가능하다
operator fun CharSequence.iterator(): CharIterator
 */