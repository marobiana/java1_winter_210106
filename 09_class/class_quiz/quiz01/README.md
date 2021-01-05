## 문제) 클래스

### 1. 학생 명단
* 학생 Class를 설계하세요. 
*  멤버 변수(필드)는 아래를 참조하세요. 
> 이름, 수업명, 나이, 전화번호

* 메소드는 아래를 참조하세요.
> 나이가 20세 이상이면 "OOO(이름)은 성인입니다."  
> 나이가 20세 미만이면 "OOO(이름)은 미성년자입니다."

* 2개의 객체를 생성하고, 각각의 값 출력과 메소드를 호출해서 출력하세요.

> StudentTest.java 결과값 출력 코드
```
public static void main(String[] args) {
		// TODO: stu1 객체 생성 및 값 넣기 구현하기
		
		// 결과값 출력
		System.out.println(stu1.name);
		System.out.println(stu1.age);
		System.out.println(stu1.className);
		System.out.println(stu1.phoneNumber);
		stu1.isAdult();
		
		System.out.println();
		
		// TODO: stu2 객체 생성 및 값 넣기 구현하기
		
		// 결과값 출력
		System.out.println(stu2.name);
		System.out.println(stu2.age);
		System.out.println(stu2.className);
		System.out.println(stu2.phoneNumber);
		stu2.isAdult();
}
```

> 출력 예시

```
유재석
21
java
01023453223
성인입니다.

이효리
17
java
01096482734
미성년자 입니다.
```
        
[정답 보기: Student](Student.java)  
[정답 보기: StudentTest](StudentTest.java)
