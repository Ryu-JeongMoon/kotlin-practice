package kotlininaction.chap06.nullability

import kotlin.random.Random

fun main() {
  val address = Address("yaho", 5, "seoul", "korea")
  val company = Company("baemin", address)

  val panda = Person("panda", company)
  val bear = Person("bear", null)

  println(panda.countryName())
  println(bear.countryName())

  println(panda.countryNameWithNullSafeOperator())
  println(bear.countryNameWithNullSafeOperator())

  var yaho: String?
  for (i in 0 until 5) {
    yaho = if (Random.nextInt(2) % 2 == 0)
      null
    else
      "bar"
    println(yaho ?: "foo")
  }

  printShippingLabel(panda)
  printShippingLabel(bear)
}

class Address(val streetAddress: String, val zipCode: Int, val city: String, val country: String)

class Company(val name: String, val address: Address?)

class Person(val name: String, val company: Company?)

fun Person.countryName(): String {
  val country = this.company?.address?.country
  return if (country != null) country else "Unknown"
}

// 한줄로 쏙~~
fun Person.countryNameWithNullSafeOperator(): String = company?.address?.country ?: "Unknown"

fun printShippingLabel(person: Person) {
  val address = person.company?.address ?: throw IllegalArgumentException("No address")
  with(address) {
    println("$streetAddress, $zipCode $city, $country")
  }
}

/*
elvis operator / null coalescing operator, ?:
null 대신 사용할 default 값을 지정하는 연산자
 */