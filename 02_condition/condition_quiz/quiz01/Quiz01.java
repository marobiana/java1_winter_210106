package condition_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 큰수, 작은수, 같은수
		Scanner scan = new Scanner(System.in);
//		System.out.print("숫자를 입력하세요 : ");
//		int number = scan.nextInt();
//		boolean condition = number > 10;
//		
//		if (condition) {
//			System.out.println("10보다 큽니다.");
//		}
//		if (number < 10) {
//			System.out.println("10보다 작습니다.");
//		}
//		if (number == 10) {
//			System.out.println("10과 같습니다.");
//		}
		
		// 2.
//		System.out.print("두 개의 수를 입력하세요:");
//		int a = scan.nextInt();
//		int b = scan.nextInt();
//		if (a == b) {
//			System.out.println("a와 b는 같다.");
//		}
//		if (a > b) {
//			System.out.println("a가 더 크다.");
//		}
//		if (a < b) {
//			System.out.println("b가 더 크다.");
//		}
//		
//		// 3. 70이상이면 합격
//		System.out.print("성적을 입력하세요 :");
//		int score = scan.nextInt();
//		if (score >= 70) {
//			System.out.println("합격입니다.");
//		}
		
		// 4. 홀짝
		System.out.print("수를 입력하세요 :");
		int number = scan.nextInt();
		// 짝수 : 2로 나누어 0으로 떨어지는 수
		boolean isEven = number % 2 == 0;
		if (isEven) {
			System.out.println("짝수");
		}
		// 홀수 : 2로 나누어 0으로 떨어지지 않는 수
		if (!isEven) {
			System.out.println("홀수");
		}
	}
}
