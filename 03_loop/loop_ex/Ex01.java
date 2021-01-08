package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// 안녕 3번 쓰기
		System.out.println("안녕");
		System.out.println("안녕");
		System.out.println("안녕");
		
		// while 반복문을 이용해서 "안녕" 3번 쓰기
		int i = 0; // 카운팅을 위한 변수    i, j, k
		while (i < 3) { // 0 1 2 => 3번
			System.out.println("안녕 " + i);
			//i = i + 1;
			//i += 1; // 복합 대입 연산자
			//i++; // 증감 연산자(후위)
			++i; // 증감 연산자(전위)
		}
		
		// ++i, i++ 차이점 
		int number = 1;
		System.out.println("number:" + number);   // 결과:1
		System.out.println("++number:" + (++number));  // 결과:2
		System.out.println("number++:" + number++);   // 결과:2
		System.out.println("number:" + number);   // 결과:3
		
		// 0 ~ 4: 5번 
		i = 0;
		while (i < 5) {
			System.out.println("Hello world! " + i);
			i++;
		}
		
		// 1 ~ 5: 5번 
		i = 1;
		while (i <= 5) {
			System.out.println("Hello world! " + i);
			i++;
		}
		
		// 5 ~ 0: 6번
		i = 5;
		while (i >= 0) {
			System.out.println("Hello " + i);
			i--;
		}
		
		// 1+2+3+4+5+...+10  합계 구하기
		i = 1;
		int sum = 0;
		while (i <= 10) {   // 1 2 3 4 5 6 7 8 9 10
			sum = sum + i;
			System.out.println("sum:" + sum);
			i++;
		}
		System.out.println("합계:" + sum);
	}
}
