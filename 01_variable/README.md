# 용어 정리
## 프로그램 수행 단계 
`컴파일(Compile) -> 빌드(build) 단계`  
- 컴파일(Compile): 소스코드를 컴퓨터가 알아듣는 기계어로 바꾼다.  
   .class 파일이 생성된다.
- 빌드(build): .class 파일을 JVM(자바 가상 머신)에 올려서 수행시킨다.

## JVM(Java Virtual Machine): 자바 가상 머신
JVM은 JAVA와 OS(운영체제) 사이에서 중개자 역할을 수행하여 자바 바이너리 파일(.class)을 실행시킨다.  
어떤 플랫폼에서도 JVM이 있으면 자바 프로그램을 수행시킬 수 있다.  

## JRE
자바 프로그램이 실행될 수 있는 환경을 제공. 즉, JVM을 포함한다.

## JDK
자바 프로그램을 개발할 때 필요한 도구들을 포함한다.  
(컴파일을 할 수 있는 javac, java 등)

# 변수명 규칙
- 숫자로 시작할 수 없음
- 공백은 포함할 수 없음
- 대소문자 구별됨
- 영문자, 숫자, _ (under bar)로 구성 가능
- 예약어는 사용불가

## Java의 기본 자료형(Data Type)
  
|type|크기|범위|
|:---:|:---:|:---:|
|byte|1 byte|-128 ~ 127|
|short|2 byte|-32,768 ~ 32,767|
|int|4 byte|-2,147,483,648 ~ 2,147,483,647|
|long|8 byte|-9,223,372,036,854,775,808 ~ 9,223,372,036,854,775,807|
|float|4 byte|1.4E-45 ~ 3.4028235E38|
|double|8 byte|4.9E-324 ~ 1.7976931348623157E308|
|boolean|1 bit|true, false|
|char|2 byte|문자|

## 산술연산자 종류

|산술연산자|설명|
|------|------|
|+| 더하기|
|-| 빼기 |
|*|곱하기|
|/| 나눈 후 결과|
|%|나눈 후 나머지|
  
## 이클립스 유용한 단축키
|기능 |단축키 |
|------|------|
|파일 이름 변경 | F2 |
|주석 처리/해제(한 줄 씩) | 선택된 영역에서 Ctrl + /|
|주석 처리/해제(한 줄 씩) | 선택된 영역에서 Ctrl + Shift + /|
|커서 위치한 줄 복사| Ctrl + alt + ↓ |
|커서 위치한 줄 삭제| Ctrl + d|
|System.out.println| syso를 타이핑 한 후 Ctrl + space bar|
|자동으로 import 및 불필요한 import 제거|Ctrl + Shift + o|
|커서 위치한 클래스 import 하기|Ctrl + 1|
|코드 정렬|선택된 영역에서 Ctrl + i|

## 예제
### [예제 1](variable_ex/Ex01.java) : 출력(printf 함수), 변수, 자료형 종류
### [예제 2](variable_ex/Ex02.java) : 변수, 산술 연산자
### [예제 3](variable_ex/Ex03.java) : 형변환(casting)
### [예제 4](variable_ex/Ex04.java) : 입력(scanf 함수)

## 문제
### [문제 1](variable_quiz/quiz01/README.md) : 변수, 자료형, 출력하기(printf), format
### [문제 2](variable_quiz/quiz02/README.md) : 변수, 산술 연산자
### [문제 3](variable_quiz/quiz03/README.md) : 실수 연산
### [문제 4](variable_quiz/quiz04/README.md) : 입력 함수(scanf_s) 