package loop_quiz;

import java.util.Scanner;

public class Quiz03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// 1. 입력받은 수까지의 합
//		System.out.print("수를 입력하세요:");
//		int number = scan.nextInt();
//		int sum = 0;
//		for (int i = 1; i <= number; i++) {
//			//sum = sum + i;
//			sum += i;
//		}
//		System.out.println(sum);
		
		// 2. 팩토리얼
//		System.out.print("수를 입력하세요:");
//		int number = scan.nextInt();
//		int fact = 1;
//		for (int i = 2; i <= number; i++) {
//			// 1 * 2 * 3 * 4 * 5    number:5
//			fact = fact * i;
//		}
//		System.out.println(fact);
		
		// 3. 약수
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		for (int i = 1; i <= number; i++) {
			// 1 2 3 4 5... 24
			if (number % i == 0) {
				System.out.print(i + " ");
			}
		}
		
		System.out.println();
	}
}
