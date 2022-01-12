package kotlininaction.chap06.nullability

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.BeforeEach
import org.junit.jupiter.api.Test

internal class LazyInitializationKtTest {
  class MyService {
    fun performAction(): String = "foo"
  }

  private lateinit var myService: MyService

  @BeforeEach
  fun setUp() {
    myService = MyService()
  }

  @Test
  fun testAction() {
    assertEquals("foo", myService.performAction())
  }
}

