## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

## Dependency Management

The `JAVA DEPENDENCIES` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-pack/blob/master/release-notes/v0.9.0.md#work-with-jar-files-directly).


# 5단원 - 참조 타입 

자바의 데이터 타입에는 크게 기본 타입(원시 타입 : primitive type) 과 참조 타입(reference type)으로 분류된다. 
* 기본타입 
  - 정수타입(byte, char, short, int, long)
  - 실수타입(float, double)
  - 논리타입(boolean) 
* 참조타입 (배열 타입, 열거 타입, 클래스, 인터페이스)

기본타입으로 선언된 변수와, 참조 타입으로 선언된 변수의 차이점은 저장되는 값이 무엇이냐이다. 
기본타입인 byte, char, short, int, long, float, doulbe, boolean을 이용해서 선언된 변수는 실제 값을 변수 안에 저장하지만, 참조 타입인 배열, 열거, 클래스, 인터페이스를 이용해서 선언된 변수는 메모리지의 **번지**를 값으로 갖는다. 번지를 통해 객체를 참조한다는 뜻에서 참조 타입이라고 부른다. 

기본 타입 변수 - 실제값
참조 변수 (100 번지) -> 100번지(객체)

ex) 
[기본타입변수]
int age =25;
double price = 100.5;

[참조 타입 변수]
String name = "신용권";
String hobby = "독서";

변수가 스택 영역에 생성되고, 객체는 힙 영역에 생성된다.

int와 double 변수는 age와 price는 직접 값을 저장하ㅓ고 있지만, String 클래스 변수인 name과 hobby는 힙 영역의 String 객체 주소 값을 가지고 있다. 주소를 통해 객체를 참조한다는 뜻에서 String 클래스 변수를 참조 타입 변수라고 한다.

## jvm에서 사용하는 메모리 영역
jvm은 운영체제에서 할당받은 메모리 영역(Runtime Data Area)을 다음과 같이 세부 영역으로 구분해서 사용한다.
Runtime Data Area
메소드 영역 | 힙 영역 | 스레드-1

* 메소드 영역 - 메소드 영역에는 코드에서 사용되는 클래스(~.class)들을 클래스 로더로 읽어 클래스별로 런타임. 상수풀(runtime constant pool), 필드(field) 데이터, 메소드(method) 데이터, 메소드 코드, 생성자(constructor) 코드 등을 분류해서 저장한다. 메소드 영역은 jvm이 시작할 때 생성되고 모든 스레드가 공유하는 영역이다.

* 힙 영역 - 힙 영역은 객체와 배열이 생ㅇ성되는 영역이다. 힙 영역에 생성된 객체와 배열은 jvm 스ㅐㄱ 영역의 변수나 다른 객체의 필드에서 참조한다. 참조하는 변수나 필드가 없다면 의미 없는 객체가 되기 때문에 이것을 쓰레기로 취급하고 jvm은 쓰레기 수집기를 실행시ㅣ켜 쓰레기 객체를 힙 영역에서 자동으로 제거한다. 

* JVM 스택(Stack) 영역
jvm 스택 영역은 각 스레드마다 한아씩 존재하며 스레드가 시작될 때 할당된다. 자바 프로그램에서 추가적으로 스레드를 생성하지 않았다면 main 스레드만 존재하므로 jvm 스택도 하나이다. jvm 스택은 메소드를 호출할 대마다 프레임(Frame)을 추가(push)하고 메소드가 종료되면 해당 프레임을 제거(pop)하는 동작을 수행한다. 예외 발생 시 printStackTrace() 메소드로 보여주는 Stack Trace의 각 라인은 하나의 프레임을 표현한다. printStackTrace()메소드는 예외 처리에서 설명할게~

참조 변수의 ==, != 연산 

기본 타입 변수의 ==, != 연산은 변수의 값이 같은지, 아닌지를 조사하지만 참조 타입 변수들 간의 ==, != 연산은 동일한 객체를 참조하는지, 다른 객체를 참조하는지 알아볼 때 사용된다. 참조 타입 변수의 값은 힙 영역의 객체 주소이므로 결국 주소 값을 비교하는 것이 된다. 동일한 주소 값을 갖고 있다는 것은 동일한 객체를 참조한다는 의미이다. 따라서 동일한 객체를 참조하고 있을 경우 == 연산의 결과는 true != 이고 연산의 결과는 false이다.

## null과 NullPointerException
----
참조 타입 변수는 힙 영역의 객체를 참조하지 않느나는 뜻으로 null 값을 가질 수 있다.
null 값도 초기값으로 사용할 수 있기 때문에 null로 초기화된 참조 변수는 스택 영역에 생성된다.

참조 타입 변수를 잘못 사용하면 발생하는 예외 : NullPointerException이 있다. 참조 타입 변수가 null 을 가지고 있을 경우, 참조 타입 변수는 사용할 수 없다. 참조 타입 변수를 사용하는 것은 곧 객체를 ㄹ사용하는 것을 의미하는데, 참조할 객체가 없으므로 사용할수가 없는것이다. 

String name = "이혜지" 
이 경우엔 
문자열은 String 객체로 생성되고 변수는 String 객체를 참조한다.
"이혜지"는 힙 영역에 String 객체로 생성된다.
그리고 name 변수에는 String 객체의 주소 값이 저장된다.

자바는 문자열 리터럴이 동일하다면 String 객체를 공유하도록 되어 있다. 다음과 같이 

String name1 = "이혜지";
String name2 = "이혜지"; > 이 경우 같은 heap 힙 영역을 이용

하지만 new 연산자를 사용해서 직접 String 객체를 생성 시킬수도 있다. new 연산자는 힙영역에 새로운 객체를 만들때 사용하는 연산자로 객체 생성 연산자 라고 한다.

boolean result = str1.equals(str2);
                원본문자열    비교문자열
