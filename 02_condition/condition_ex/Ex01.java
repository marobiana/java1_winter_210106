package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		// 비교 연산자 사용하기
		Scanner scan = new Scanner(System.in);
		
//		System.out.print("몸무게를 입력하세요:");
//		int weight = scan.nextInt();
//		
//		// 만약에 몸무게가 55키로 미만이면 "치킨"
//		if (weight < 55) {
//			System.out.println("치킨 먹자!!!");
//		}
//		
//		// 만약에 몸무게가 100키로 이상이면 "다이어트 시작"
//		if (weight >= 100) {
//			System.out.println("다이어트 시작!!!");
//		}
//		
//		// 만약에 몸무게가 68키로이면 "당신의 몸무게는 68kg이군요"
//		if (weight == 68) {
//			System.out.println("당신의 몸무게는 68kg이군요");
//		}
//		
//		// 만약에 몸무게가 75키로가 아니면 "당신의 몸무게는 75kg가 아닙니다."
//		if (weight != 75) {
//			System.out.println("당신의 몸무게는 75kg가 아닙니다.");
//		}
		
		
		// 두 개의 수를 입력받고 비교하기
		System.out.print("두 개의 수를 입력하세요:");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		System.out.println(number1 + " " + number2);
		
		// number1이 number2보다 크다
		if (number1 > number2) {
			System.out.println("number1이 number2보다 크다");
		}
		
		// number1이 number2보다 작다
		if (number1 < number2) {
			System.out.println("number1이 number2보다 작다");
		}
		
		// number1과 number2는 같다.
		if (number1 == number2) {
			System.out.println("number1과 number2는 같다.");
		}
	}
}
