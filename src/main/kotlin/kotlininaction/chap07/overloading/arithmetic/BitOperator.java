package kotlininaction.chap07.overloading.arithmetic;

public class BitOperator {

  public static void main(String[] args) {
    // 왼쪽 시프트 = shl
    System.out.println(2 << 1);

    // 부호 비트 0으로 설정하여 >>
    System.out.println(4 >>> 1);

    // 비트 곱 = and
    System.out.println(4 & 1);

    // 비트 합 = or
    System.out.println(4 | 1);

    // 비트 배타 합
    System.out.println(4 ^ 1);

    // 비트 반전
    System.out.println(~4);
  }
}
