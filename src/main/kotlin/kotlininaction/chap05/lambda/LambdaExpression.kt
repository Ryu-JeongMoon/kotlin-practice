package kotlininaction.chap05.lambda

fun main() {

}


/*
lambda expression 은 다른 함수에 인자로 넘길 수 있는 작은 코드 조각을 의미한다
람다를 사용하면 공통 코드 구조를 쉽게 라이브러리 함수로 뽑아낼 수 있다?!
처음부터 람다를 고려하지 않고 만든 라이브러리에도 적용할 수 있다?!?!
lambda with receiver ?? 이건 또 뭐시여


람다란 무엇인가
- 이벤트 발생 시 실행한 핸들러 지정
- 데이터 구조의 모든 원소에 특정 연산 수행
위와 같은 작업을 코드로 표현하기 위해 동작을 변수에 저장할 필요가 있다, 기존 자바에서는 이를 익명 클래스로 표현
클래스를 선언하고 해당 클래스의 인스턴스를 인자로 넘긴다

기존 자바
button.setOnClickListener(new OnClickListener() {
  @Override
  public void onClick(View view) {
    클릭 시 수행할 동작
  }
});

람다 사용 후
button.setOnClickListener { 클릭 시 수행할 동작 }

FP 에서는 함수를 값으로 다뤄 해결한다
코틀린 코드는 자바의 익명 클래스와 같은 기능을 하지만 훨씬 더 간결하다
 */