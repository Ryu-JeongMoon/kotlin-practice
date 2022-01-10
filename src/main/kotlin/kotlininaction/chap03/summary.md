- 코틀린은 자체 컬렉션을 사용하기 보다 자바 컬렉션을 확장하는 방식으로 사용한다 <br>
이는 기존 코드와의 상호 운용성 때문이고, 확장 함수 기능을 이용해 더 풍부한 기능을 제공할 수 있다

- 코틀린 자체로 프로젝트 제작 시에 디폴트 값을 이용하면 오버로드할 필요가 적어진다 <br>
이 역시 상호 운용성을 위해 @JvmOverloads 를 이용해 자바를 위한 오버로드 함수를 생성할 수 있다

- 메서드나 프로퍼티를 코틀린 파일의 최상위에 선언할 수 있다 <br>
동작 자체는 컴파일 시 클래스의 내부 메서드, 프로퍼티로 정의된 것을 사용하는 방식이 된다

- 확장 함수는 소스 코드를 가지고 있지 않더라도 내부 메서드처럼 작동하게 만들 수 있다

- infix call 을 이용해 인자가 하나인 내부 메서드, 확장 메서드를 더 깔끔하게 호출할 수 있다

- 확장 함수를 이용해 문자열 처리에도 자바보다 풍부한 기능과 깔끔한 구문을 제공할 수 있다

- """어쩌구저쩌구""" 식으로 3중 따옴표 문자열을 이용해 escape 없이 깔끔한 문자열 처리가 가능하다