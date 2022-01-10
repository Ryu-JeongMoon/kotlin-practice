package kotlininaction.chap04.kotlinclass.constructor

fun main() {
  val delegatingCollection = DelegatingCollection<Int>()
  val delegatingCollectionBy = DelegatingCollectionBy<Int>()
}

// 우우 ~~
class DelegatingCollection<T> : Collection<T> {
  private val innerList = arrayListOf<T>()

  override val size: Int get() = innerList.size
  override fun isEmpty(): Boolean = innerList.isEmpty()
  override fun contains(element: T): Boolean = innerList.contains(element)
  override fun iterator(): Iterator<T> = innerList.iterator()
  override fun containsAll(elements: Collection<T>): Boolean = innerList.containsAll(elements)
}

// 오오 ~~
class DelegatingCollectionBy<T>(innerList: Collection<T> = ArrayList()) : Collection<T> by innerList

// 기존 기능은 다 위임시키고 CountingSet 에서는 연산의 횟수만 계산함
class CountingSet<T>(
  private val innerSet: MutableCollection<T> = HashSet()
) : MutableCollection<T> by innerSet {
  private var objectsAdded = 0

  override fun add(element: T): Boolean {
    objectsAdded++
    return innerSet.add(element)
  }

  override fun addAll(elements: Collection<T>): Boolean {
    objectsAdded += elements.size
    return innerSet.addAll(elements)
  }
}


/*
Class Delegation

implementation inheritance 가 대규모 시스템을 취약하게 만드는 원인이다
A 클래스를 상속해 B 클래스를 만든 후, A 클래스가 변경되면 B, C.. 등등에 영향을 미치고
A 클래스에 대한 기대 / 전제 조건이 충족되지 않아 시스템 폭발

코틀린에서는 이를 문제로 인식하고 기본적으로 final 로 작성되게 설계했다
상속을 위한 클래스는 open keyword 를 사용해야 하므로 작성 시에 조금 더 주의를 기울일 수 있다
open 남용하면 구현 상속 문제는 여전하다는 것이 문제

그렇다면 A 클래스에 변경이 필요하다면 코틀린은 어떻게 해결하는가
일반적인 해결 방법으로 Decorator Pattern 을 사용하는 방법이 있다
A를 포함하는 Decorator 를 만들어 기존 기능은 그냥 forwarding 하고, 추가될 기능을 새로 정의한다
이 방법의 단점은 준비 코드가 많다는 것, (A의 기능으로 넘겨버리는 것)
코틀린에서는 이를 언어 차원으로 지원?!
 */