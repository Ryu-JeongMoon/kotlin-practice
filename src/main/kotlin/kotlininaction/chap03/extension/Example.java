package kotlininaction.chap03.extension;

import java.util.List;
import kotlininaction.chap03.DefaultParameterKt;
import kotlininaction.chap03.Strings;

public class Example {

  public static void main(String[] args) {
    List<Integer> integers = List.of(1, 3, 5);

    System.out.println(DefaultParameterKt.joinToStringWithDefaultValue(integers));
    System.out.println(DefaultParameterKt.joinToStringWithDefaultValue(integers, "."));
    System.out.println(DefaultParameterKt.joinToStringWithDefaultValue(integers, ".", "["));
    System.out.println(DefaultParameterKt.joinToStringWithDefaultValue(integers, ".", "[", "]"));

    System.out.println(Strings.lastChar("yahoo"));
  }
}

// 오왕 신기혀라