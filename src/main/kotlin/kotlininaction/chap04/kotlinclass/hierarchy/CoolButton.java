package kotlininaction.chap04.kotlinclass.hierarchy;

import org.jetbrains.annotations.NotNull;

public class CoolButton implements View {

  @NotNull
  @Override
  public State getCurrentState() {
    return new ButtonState();
  }

  @Override
  public void restoreState(@NotNull State state) {
    System.out.println("YAHOO");
  }

  // 다른 클래스 안에 정의한 클래스는 자동으로 inner class 가 된다
  // ButtonState 는 Button 의 참조를 묵시적으로 포함한다, 이 참조 때문에 ButtonState 를 직렬화할 수 없다
  public class ButtonState implements State {

  }

  // 위 문제를 해결하기 위해서는 static class 로 선언해 Button 에 대한 참조를 끊어야 한다
  static class SerializableButtonState implements State {}
}
