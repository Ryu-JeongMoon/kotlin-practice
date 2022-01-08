package kotlininaction.chap03.strings;

import java.util.Arrays;

public class JavaSplit {

  public static void main(String[] args) {
    String[] split1 = "12.345-6.A".split(".");
    System.out.println("split1 = " + Arrays.toString(split1));

    String[] split2 = "12.345-6.A".split("\\.");
    System.out.println("split2 = " + Arrays.toString(split2));
  }
}

/*
Java split() parameter 정규식이라서 . 대신 \\. 써야하지롱
 */