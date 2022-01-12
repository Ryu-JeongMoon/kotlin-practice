package kotlininaction.chap06.collection

import kotlininaction.chap05.fpapi.Person
import java.io.File

fun main() {
  val source: Collection<Int> = arrayListOf(3, 5, 7)
  val target: MutableCollection<Int> = arrayListOf(1)

  copyElements(source, target)
  println("target = $target")
}

fun <T> copyElements(source: Collection<T>, target: MutableCollection<T>) {
  for (item in source)
    target.add(item)
}

class FileIndexer : FileContentProcessor {
  // 일부 파일은 이진 파일일 수 있으며 이진 파일은 텍스트로 표현할 수 없는 경우가 있으므로 리스트는 널이 될 수 있다?!
  override fun processContents(path: File, binaryContents: ByteArray?, textContents: List<String>?) {
    println("blah blah")
  }
}

class PersonParser : DataParser<Person> {
  // 오류를 항상 받을 수 있어야 하므로 errors 는 널이 되면 안 되고, 오류가 발생하지 않으면 그 요소는 널이 될 수 있다
  override fun parseDate(input: String, output: MutableList<Person>, errors: MutableList<String?>) {
    println("blah blah")
  }
}

/*
코틀린에서는 값을 읽는 인터페이스와 변경을 가하는 인터페이스를 분리했다
복잡한 대규모 시스템을 구성할 때 어떤 값이 변경될 수 있는지를 쉽게 파악할 수 있다
똘똘한걸?

단 읽기 전용 컬렉션이라고 해서 불변 컬렉션일 필요는 없다는 것을 주의하자
Collection 으로 받기 때문에 MutableCollection 이 그 자리에 들어갈 수 있고 ConcurrentModificationException 발생 가능할 수 있다
ex) copyElements(target, target) 넣으면 컴파일은 되지만 예외 터짐

코틀린에서는 Collection 으로 읽기 전용으로 선언했다고 하더라도
자바와 상호 운용할 때, 자바 코드에서 변경 불가로 만들 수는 없다
즉 자바와 함께 쓸 때는 코드 상에서 강제할 수는 없으므로 코딩 컨벤션을 정하거나, 개발자가 의식해서 작성하는 방법으로 해결해야 한다

반대로 자바에서 Collection parameter 가 있는 경우 코틀린에서는 어떻게 다뤄야 하는가
아래 사항을 고려해야한다
- 컬렉션이 널이 될 수 있는가
- 컬렉션 원소가 널이 될 수 있는가
- override 하는 메서드가 컬렉션을 변경할 수 있는가 (컬렉션을 변경할 수 있다면 MutableCollection)
 */