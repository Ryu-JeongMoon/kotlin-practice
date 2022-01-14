package kotlininaction.chap08.highorder

fun main() {
  // 배송비 계산하는 함수를 반환
  val calculator = getShippingCostCalculator(Delivery.EXPEDITED)
  val order = Order(5)
  println(calculator.invoke(order))
}

enum class Delivery { STANDARD, EXPEDITED }

class Order(val itemCount: Int)

fun getShippingCostCalculator(delivery: Delivery = Delivery.STANDARD): (Order) -> Double {
  return if (delivery == Delivery.EXPEDITED)
    { order -> 6 + 2.1 * order.itemCount }
  else
    { order -> 1.2 * order.itemCount }
}