package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 2의 제곱 함수
		Scanner scan = new Scanner(System.in);
		System.out.print("제곱값을 구할 숫자를 입력하세요:");
		int num = scan.nextInt();
		System.out.println(num + "의 제곱은" + getSquared(num));
		
		// 2. 평균 구하기 함수
		System.out.print("점수를 입력하세요:");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		int s4 = scan.nextInt();
		double average = getAverage(s1, s2, s3, s4);
		System.out.println("평균은 " + average);
		
		// 3. 몫과 나머지 출력 함수
		System.out.print("숫자와 나눌 수를 입력하세요:");
		int number1 = scan.nextInt();
		int number2 = scan.nextInt();
		printQuotientRemainder(number1, number2);
		
		// 4. 홀짝 함수
		System.out.print("숫자를 입력하세요:");
		int number = scan.nextInt();
		System.out.println(isEvenNumber(number));
	}

	// 1. 2의 제곱 함수
	public static int getSquared(int x) {
		return x * x;
	}
	
	// 2. 평균 구하기 함수
	public static double getAverage(int score1, int score2, int score3, int score4) {
		return (score1 + score2 + score3 + score4) / (double)4;
	}
	
	// 3. 몫과 나머지 출력 함수
	public static void printQuotientRemainder(int number1, int number2) {
		int quotient = number1 / number2;
		int remainder = number1 % number2;
		System.out.println("몫:" + quotient);
		System.out.println("나머지:" + remainder);
	}

	// 4. 홀짝 함수
	public static boolean isEvenNumber(int number) {
// 		if (number % 2 == 0) {
// 			return true;
// 		}
// 		return false;
		
		return number % 2 == 0 ? true : false; // 삼항 조건문
	}
}
