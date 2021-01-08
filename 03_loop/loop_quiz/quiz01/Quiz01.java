package loop_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 수를 입력 받아서 그 수만큼 "화이팅!!!" 
		Scanner scan = new Scanner(System.in);
//		System.out.print("횟수를 입력하세요:");
//		int count = scan.nextInt();
//		int i = 0; // 0 ~ count-1: count개 만큼
//		while (i < count) {
//			System.out.println("화이팅!!");
//			i++;
//		}
		
		// 2. 카운트 다운
//		System.out.print("카운트 다운 수를 입력하세요:");
//		int countDown = scan.nextInt();  // 5 4 3 2 1 0 발사
//		while (countDown >= 0) {
//			System.out.println(countDown);
//			countDown--;
//		}
//		System.out.println("발사");
		
		
		// 3. 5번동안 입력, 출력
//		수를 입력하세요:  : 4
//		출력 : 4
//		수를 입력하세요:  : 5
//		출력 : 5
//		수를 입력하세요:  : 6
//		출력 : 6
//		수를 입력하세요:  : 7
//		출력 : 7
//		수를 입력하세요:  : 8
//		출력 : 8
		
//		int i = 0;   // 0 ~ 4: 5번
//		while (i < 5) {
//			System.out.print("수를 입력하세요:");
//			int number = scan.nextInt();
//			System.out.println("출력:" + number);
//			
//			i++;
//		}
		
		// 4. 구구단 3단 출력
		int number = 3;
		int i = 1;
		while (i <= 9) {
			// 3 X 1 = 3
			// 3 X 2 = 6...
			System.out.println(number + " X " + i + " = " + (number * i));
			i++;
		}
	}
}
