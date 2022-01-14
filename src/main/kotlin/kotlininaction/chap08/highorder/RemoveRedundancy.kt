package kotlininaction.chap08.highorder

fun main() {
  val averageMacDuration = log.averageDurationFor(OS.MAC)
  println("averageMacDuration = $averageMacDuration")

  val averageAndroidDuration = log.averageDurationFor(OS.ANDROID)
  println("averageAndroidDuration = $averageAndroidDuration")

  val averageMobileDuration = log.averageDurationBy { it.os in setOf(OS.ANDROID, OS.IOS) }
  println("averageMobileDuration = $averageMobileDuration")
}

// 재활용성 냠냠굿, 단 질의가 복잡해질수록 하드코딩 어려워짐
fun List<SiteVisit>.averageDurationFor(os: OS) = filter { it.os == os }.map(SiteVisit::duration).average()

// 재활용성을 더 향상시키기 위해 Behavior Parameterize, 요럴 때 람다
// 고전적인 Strategy Pattern 을 구현할 때, 인터페이스 만들고 구현 클래스를 여러개 만들어 적용했으나
// 람다를 넘기면 ?! 인터페이스나 구체 클래스 전부 안 써도 됨 !!
fun List<SiteVisit>.averageDurationBy(predicate: (SiteVisit) -> Boolean) =
  filter { predicate.invoke(it) }.map(SiteVisit::duration).average()

data class SiteVisit(val path: String, val duration: Double, val os: OS)

enum class OS { WINDOWS, LINUX, MAC, IOS, ANDROID }

val log = listOf(
  SiteVisit("/", 34.0, OS.WINDOWS),
  SiteVisit("/home", 91.0, OS.MAC),
  SiteVisit("/google", 59.0, OS.LINUX),
  SiteVisit("/yaho", 505.0, OS.IOS),
  SiteVisit("/melon", 3.0, OS.ANDROID),
  SiteVisit("/water", 11.0, OS.ANDROID),
  SiteVisit("/panda", 34.0, OS.ANDROID)
)