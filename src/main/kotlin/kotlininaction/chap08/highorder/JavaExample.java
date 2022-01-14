package kotlininaction.chap08.highorder;

import kotlin.Unit;

public class JavaExample {

  public static void main(String[] args) {
    // 자바에서는 void 로 아무것도 넘기지 않지만, 코틀린 함수를 가져다 사용하는 경우
    // 명시적으로 Unit.INSTANCE 로 Unit 반환 타입 넘겨줘야함
    HighOrderFunctionKt.performRequest("https://java.com", (code, content) -> {
      System.out.println("YAHOO");
      return Unit.INSTANCE;
    });
  }
}
