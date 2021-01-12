package method_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 합 구하기. 단, 100이 넘으면 중단
		Scanner scan = new Scanner(System.in);
//		System.out.print("수를 입력하세요:");
//		int number = scan.nextInt();
//		
//		System.out.println(getSumUntil100(number));
		
		// 2. 5개의 수를 입력 받아서 최소값을 출력하는 함수를 만드세요.(리턴값 없음)
//		System.out.print("5개의 수를 입력하세요:");
//		int number1 = scan.nextInt();
//		int number2 = scan.nextInt();
//		int number3 = scan.nextInt();
//		int number4 = scan.nextInt();
//		int number5 = scan.nextInt();
//		
//		printMin(number1, number2, number3, number4, number5);
		
		// 3. 소수 판별
		System.out.print("수를 입력하세요:");
		int number = scan.nextInt();
		System.out.println(isPrimeNumber(number));
	}

	// 1. 
	public static int getSumUntil100(int num) {
		int sum = 0;
		for (int i = 1; i <= num; i++) {
			sum += i;
			if (sum > 100) {
				break;
			}
		}
		return sum;
	}
	
	// 2.
	public static void printMin(int n1, int n2, int n3, int n4, int n5) {
		int min = n1;
		if (min > n2) {
			min = n2;
		}
		if (min > n3) {
			min = n3;
		}
		if (min > n4) {
			min = n4;
		}
		if (min > n5) {
			min = n5;
		}
		System.out.println("최소값은 " + min);
	}
	
	// 3. 
	public static boolean isPrimeNumber(int number) {
		// 2+ 3+ 4- 5+ 6- 7+ 8- 9- 10-
		if (number == 2) {
			return true;
		}
		
		// 2가 아닌 애들이 여기 온다.
		for (int i = 2; i < number; i++) {
			if (number % i == 0) {
				// 하나라도 나누어 떨어지면 소수가 아니다.
				return false;
			}
		}
		
		// 이곳까지 도달하면 나누어진 수가 없었으므로 소수이다.
		return true;
	}
}
