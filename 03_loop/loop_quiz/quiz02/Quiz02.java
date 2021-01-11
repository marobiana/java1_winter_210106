package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 35 ~ 40 출력
		// 35 36 37 38 39 40 
		for (int i = 35; i <= 40; i++) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		// 2. 5 ~ -5 출력
		// 5 4 3 2 1 0 -1 -2 -3 -4 -5
		for (int i = 5; i >= -5; i--) {
			System.out.print(i + " ");
		}
		System.out.println(); // 줄바꿈
		
		// 3. 1 ~ 50 사이에 3의 배수만 출력하세요.
		// 3 6 9 12 15 18 21 24 27 30 33 36 39 42 45 48 
		for (int i = 1; i <= 50; i++) {  // 1 ~ 50
			if (i % 3 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		
		// 다른 방법
		for (int i = 3; i <= 50; i += 3) { // 3 6 9 ... 48
			System.out.print(i + " ");
		}
		System.out.println();
		
		// 4. 1 ~ 100 사이에 7의 배수 갯수를 구하세요.
		int count = 0;
		for (int i = 7; i <= 100; i += 7) {
			count++;
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("7의 배수의 개수는:" + count);
		
		// 5. 입력 받은 수의 단수 출력
		Scanner scan = new Scanner(System.in);
		System.out.print("단수를 입력하세요:");
		int number = scan.nextInt();
		for (int i = 1; i <= 9; i++) {
			// number X i = number * i
			// 8 X 1 = 8
			System.out.println(number + " X " + i + " = " + (number * i));
		}
	}
}
