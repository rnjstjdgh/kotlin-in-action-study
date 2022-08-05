# 코틀린 학습 공간

### 관련 정리 공간
1.  노션: https://keen-derby-c16.notion.site/a116f6e80f0c450a84142c8a6874269d
2.  블로그: 추가예정

### 학습 방향성
* 코틀린 vs 자바 비교하면서 코틀린 코드가 왜 좋고 그 사상이 뭔지 이해하기
    * 코틀린 코드와 자바 코드 동시에 작성해보자
* 코틀린 언어 특성 이해하기
* 코틀린과 친해지기
* 코틀린의 유틸과 친해지기
* 코루틴

### 부록
* kotlin 학습을 하게 되면서 얻는 부가적인 학습 경험은 `extra` 하위에 정리한다.

---
## 2장: 코틀린 기초
### 2장에서 다루는 내용
* 함수, 변수, 클래스, enum, 프로퍼티를 선언하는 방법
    * 프로퍼티가 뭘까?? 
* 제어 구조
* 스마트 캐스트
    * 타입 검사와 타입 캐스트, 타입 강제 변환을 하나로 엮은 기능!
* 예외 던지기와 예외 잡기

### 2.1 기본 요소: 함수와 변수
* 함수 작성 문법
    * ![img_2.png](img_2.png)
* 문(statement) vs 식(expression)
    * statement
      * 값을 만들어 낸다
      * 다른 식의 하위 요소로 계산에 참여할 수 있다
      * ex> 3항 연산자
    * expression
      * 가장 안쪽 블록의 최상위 요소로 존재
      * 아무 값을 만들어내지 않는다.
      * ex> java 의 while 문
    * 제어 구조와의 관계
      * java -> 모든 제어 구조가 문으로 구성
      * kotlin -> 루프를 제외한 대부분의 제어 구조가 식으로 구성
        * 제어 구조를 표현하는 방식이 다양할 수록 다양한 코드 패턴을 간결하게 표현할 수 있는 유연성이 생김
* 변수 작성 문법
  * ![img_3.png](img_3.png)
    * 특징 1 -> 자바와 달리 타입이 변수 이름 뒤에 선언된다.
    * 특징 2 -> 선언과 동시에 초기화 하는 경우 타입 추론이 동작하여 변수 타입 생략이 가능하다
      * 변수 선언만 할 경우 반드시 타입을 명시해야 함
    * 특징 3 -> 변수 이름 : 타입 말고도 val 이라는 키워드가 있다(뒤에서 다룸)
* val 과 var
  * val
    * 값을 뜻하는 value 에서 따옴
    * 변경 불가능한 참조를 저장하는 변수
    * 자바로 말하면 final 변수(constant 개념은 아님, 참조를 바꿀 수 없다는 의미이다!!!)
  * var
    * 변수를 뜻하는 variable 에서 따옴
    * 변경 가능한 참조
      * 변수의 타입은 한번 선언되면 바꿀 수 없음에 주의
    * 자바의 일반 변수와 같음
* 불변 변수와 함수형 프로그램
  * 가능하면 모든 변수를 val 키워드를 사용해 불변 변수로 선언하고 나중에 꼭 필요하면 var 로 변경할것
  * 변경 불가한 참조와 변경 불가한 객체를 부수 효과가 없는 함수와 조합해 사용하면 코드가 함수형 스타일에 가까워진다.

* 코틀린은 문자열 템플릿 기능을 지원
  * ex> println("Hello $name!")
  * 자바 문자열 접합보다 간결하게 사용 할 수 있도록 하기 위한 언어 차원의 지원
  * "Hello, ${args[0]}" 같은 복잡한 식도 중괄호로 둘러싸서 문자열 템플릿 안에 넣을 수 있다.
  * 되도록 중괄호를 사용하는 것을 습관화 하자
    * $namehello 이런식으로 하면 namehello 를 인식해버림 -> ${name}hello 로 써야 name 을 변수 명으로 인식

### 2.2 클래스와 프로퍼티
* 프로퍼티 -> 말 그대로 클래스의 특성 이라고 이해해야 한다.
  * 필드와 접근자를 한데 묶은 개념
  * val
    * 읽기 전용 프로퍼티를 선언
    * java 로 치면, private 필드와 getter 를 만들어 준다.
    * object.getter 방식이 아니라 object.field 방식을 통해 값을 getting 할 수 있다.
    * object 밖 말고 안쪽에서도 val 의 참조는 변경 불가하다
      * 즉, 일반 val 은 final 이고 클래스 프로퍼티의 val 은 final + private field + public getter 로 이해하기 
  * var
    * 변경 가능한 프로퍼티를 선언
    * java 로 치면, private 필드와 getter & setter 를 만들어 준다.
    * object.getter 방식이 아니라 object.field 방식을 통해 값을 getting & setting 할 수 있다.
  * 프로퍼티는 꼭 필드를 가져야 할까?
    * 대부분의 프로퍼티에는 그 프로퍼티의 값을 저장하기 위한 필드가 있다.
      * 이를 프로퍼티를 뒷받침하는 필드 라 한다.
    * 하지만 원한다면 프로퍼티 값을 그때그때 계산할 수도 있다.
      * 커스텀 게터를 작성하면 그런 프로퍼티를 만들 수 있다.
      * 아마 프로퍼티에 값을 setting 하고 싶을 경우 필드가 뒷받침 되는게 자연스러울 듯
  * 커스텀 접근자
    * ![img_4.png](img_4.png)
    * 이러한 방식을 통해 필드 없이도 값을 getting 할 수 있는 프로퍼티를 만들 수 있음
  * 파라미터가 없는 함수를 정의하는 것 vs 커스텀 케터를 정의하는 것
    * 구현상으론 완전히 동일
    * 일반적으로 클래스의 특성을 정의하고 싶다면 프로퍼티로 정의하는 것이 문법적으로 의도가 명확한 코드가 될 것이다.
* 코틀린의 소스 구조: 디렉터리와 패키지
  * java 보다 간결하게 구성할 수 있으나 java 호완성을 위해 java 규칙과 동일하게 구성하는 것을 추천

### 2.3 선택 표현과 처리: enum과 when
```
* when 은 자바의 switch 를 대치하되 훨씬 더 강력하며 자주 사용됨
```
* enum 클래스 정의
  * 

진행상황 Indexing: 77쪽 