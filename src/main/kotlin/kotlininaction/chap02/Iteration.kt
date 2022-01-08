package kotlininaction.chap02

fun main() {

  // 요놈은 half-closed range
  for (i in 1 until 10 step 2)
    println(i)

  for(i in 10 until 1 step 2)
    println(i)

  // 요놈은 closed range, 양 끝을 포함하는 구간을 폐구간이라 한다
  for (i in 1..50)
    println(fizzBuzz(i))

  for (i in 50 downTo 1 step 2)
    println(fizzBuzz(i))
}

fun fizzBuzz(i: Int) =
  when {
    i % 15 == 0 -> "fizz buzz"
    i % 3 == 0 -> "fizz"
    i % 5 == 0 -> "buzz"
    else -> "$i"
  }


/*
while, do-while 은 자바랑 똑같슴둥

코틀린에는 아래 형태의 for 문 없다
for (int i = 0; i < 어쩌구; i++) {}

요놈 대신 아래 두 형태를 사용하는고만
for (i in 1..10)
for (local 변수명 in 초기값 until 최종값 step 몇개씩 늘릴지)

 */