package variable_quiz;

import java.util.Scanner;

public class Quiz02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// 1. 몫, 나머지
//		System.out.print("입력1: ");
//		int number1 = scan.nextInt();
//		System.out.print("입력2: ");
//		int number2 = scan.nextInt();
//		
//		int quotient = number1 / number2;
//		int remainder = number1 % number2;
//		// 몫 : 105 나머지 : 3
//		System.out.println("몫:" + quotient + " 나머지:" + remainder);
		
		// 2. 교체 (swap) 알고리즘
//		System.out.print("x:");
//		int x = scan.nextInt();  // 6
//		System.out.print("y:");
//		int y = scan.nextInt();  // 4
//		System.out.println("x는 " + x + " y는 " + y);
//		
//		// swap 알고리즘
//		int temp = x;
//		x = y;
//		y = temp;
//		System.out.println("x는 " + x + " y는 " + y);
		
		
		// 3. 초 변환
		// 초 : 464
//		System.out.print("초:");
//		int seconds = scan.nextInt();
//
//		// 분, 초
//		int min = seconds / 60;
//		int sec = seconds % 60;
//		System.out.println(min + "분 " + sec + "초");
		
		// 4. 자리수 쪼개기
		// 1234 / 1000  => 1.234    몫:1  나머지:234
		// 234 / 100    => 2.34   몫:2   나머지:34
		// 34 / 10      => 3.4   몫:3  나머지:4
//		System.out.print("입력:");
//		int number = scan.nextInt();
//		
//		int q = number / 1000;  // 1
//		int r = number % 1000;  // 234
//		System.out.println(q);  // 1
//
//		q = r / 100;  // 2
//		r = r % 100;  // 34
//		System.out.println(q);  // 2
//		
//		q = r / 10; // 3
//		r = r % 10; // 4
//		System.out.println(q); // 3
//		System.out.println(r); // 4		
//		
//		scan.close();
		
		// 5. 자리수 쪼개고 합계
		System.out.print("입력:");
		int number = scan.nextInt();
		int sum = 0;
		
		int q = number / 1000;  // 1
		int r = number % 1000;  // 234
		sum = sum + q;
		
		q = r / 100;  // 2
		r = r % 100;  // 34
		sum = sum + q;
		
		q = r / 10; // 3
		r = r % 10; // 4
		sum = sum + q;
		sum = sum + r;
		
		System.out.println("합계는 " + sum + "입니다.");
	}
}
