package loop_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		// 1. 무한 입력
		Scanner scan = new Scanner(System.in);
		while (true) {
			System.out.print("수를 입력하세요:");
			int number = scan.nextInt();
			if (number == 0) {
				System.out.println("끝");
				break;
			}
		}
		
		// 2. 배수의 합 구하기
		// 3부터 50까지 3의 배수의 합을 출력
		int sum = 0;
		for (int i = 3; i <= 50; i++) {
			// 3의 배수가 아닐 때 skip
			if (i % 3 != 0) {
				continue;
			}
			
			// 3의 배수
			sum += i;
		}
		
		System.out.println(sum);
	}
}
