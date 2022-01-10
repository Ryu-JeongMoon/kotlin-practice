package kotlininaction.chap04.kotlinclass.kotlinobject

import kotlininaction.chap01.Person
import java.io.File

fun main() {
  // 인스턴스 생성 불가
  // Payroll()

  // 유틸 클래스 쓰듯이 사용 오께이
  Payroll.calculateSalary()

  println(CaseInsensitiveFileComparator.compare(File("panda"), File("bear")))

  println(KotlinPerson.NameComparator.compare(KotlinPerson("java"), KotlinPerson("kotlin")))

  val persons = listOf(KotlinPerson("Bob"), KotlinPerson("Alice"))
  println(persons.sortedWith(KotlinPerson.NameComparator))
}

object Payroll {
  private val allEmployees = arrayListOf<Person>()

  fun calculateSalary() {
    for (person in allEmployees) {
      println("person = $person")
    }
  }
}

object CaseInsensitiveFileComparator : Comparator<File> {
  override fun compare(o1: File, o2: File): Int {
    // o1.length - o2.length
    // 양수 o1 > o2, 0 o1 == 02, 음수 o1 < o2
    return o1.path.compareTo(o2.path, ignoreCase = true)
  }
}

data class KotlinPerson(val name: String) {
  object NameComparator: Comparator<KotlinPerson> {
    override fun compare(o1: KotlinPerson, o2: KotlinPerson): Int = o1.name.compareTo(o2.name)
  }
}

/*
object keyword 는 다양한 상황에서 사용되는데 모든 경우 클래스를 정의하면서 인스턴스를 생성한다
- object declaration : 싱글턴 정의
- companion object : 인스턴스 메서드는 아닌데 관련 있는 메서드, 팩토리 메서드 담는 용도
- anonymous inner class

객체 선언이란 싱글턴을 언어 차원에서 지원하는 기능으로써 클래스 선언 + 단일 인스턴스 선언
 */