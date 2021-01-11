package method_ex;

public class Ex02 {

	public static void main(String[] args) {
		/*
		 * 메소드(method) 만들기
		 * 
		 * 1. 어떤 기능을 만들지 메소드 명을 짓는다.
		 * 2. input: 무엇을 입력받을지 생각한다.
		 * 3. output: 무엇을 결과로 반환할 것인지 생각한다.
		 * 4. 구현하기(implement)
		 */
		
		int x = 3;
		int y = 5;
		int result = sum(x, y);
		System.out.println(result);
		
		int x1 = 1500;
		int y1 = 25891456;
		System.out.println(sum(1500, 2000));
		
		result = sum(1, 2) + sum(3, 4);
		System.out.println(result);
		
		printHelloWorld();
	}
	
	// static: 처음(수행전)부터 메모리에 할당시킨다.
	//    static 메소드가 다른 메소드를 부르는 경우, 메모리에 없으면 참조할 수 없기 때문에 static으로 정의해야 한다.
	// sum(합계) : a, b(정수) 둘의 합을 구한다. => 결과값 int로 반환한다.
	public static int sum(int a, int b) {  // 매개변수(parameter)
		int result = a + b;
		return result;  // return을 쓰는 순간 메소드가 끝난다.
	}

	// Hello world를 세번 찍는 메소드
	public static void printHelloWorld() {
		System.out.println("Hello world");
		System.out.println("Hello world");
		System.out.println("Hello world");
		return; // 메소드가 종료된다.
	}
}
