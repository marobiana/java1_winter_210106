package condition_quiz;

import java.util.Scanner;

public class Quiz05 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		// 1. 평균 합격 구하기
		System.out.print("두 점수를 입력하세요:");
		int score1 = scan.nextInt();
		int score2 = scan.nextInt();
		double average = (score1 + score2) / 2.0;
		if (average >= 70) {
			System.out.println("합격");
		} else {
			System.out.println("불합격");
		}
		
		// 2. 큰 값 구하기
		System.out.print("세 개의 수를 입력하세요:");
		int s1 = scan.nextInt();
		int s2 = scan.nextInt();
		int s3 = scan.nextInt();
		int max = s1;
		
		if (s2 > max) {
			max = s2; 
		}
		if (s3 > max) {
			max = s3;
		}
		System.out.println(max);
		
		// 3. 과락 포함 합격 여부
		System.out.println("점수1:");
		score1 = scan.nextInt();
		System.out.println("점수2:");
		score2 = scan.nextInt();
		average = (score1 + score2) / 2.0;
		
		if (score1 <= 50 || score2 <= 50) {
			System.out.println("과락");
		} else if (average >= 60) {
			System.out.println("합격");
		} else { 
			System.out.println("불합격");
		}
		
		// 4. 윤년 구하기
		System.out.print("연도:");
		int year = scan.nextInt();
		
		// 2020 : 윤년, 2100: 평년
		
		/**
		 * 1. 4로 나누어 떨어지는 연도는 윤년이다.  
		   2. 100으로 나누어 떨어지는 연도는 윤년이 아니다.   
		   3. 400으로 나누어 떨어지는 연도는 무조건 윤년이다.   
		 */
		
		// 4-1: 비효율적인 
		if (year % 4 == 0) {
			if (year % 100 == 0) {
				if (year % 400 == 0) {
					System.out.println("윤년");
				} else {
					System.out.println("평년");
				}
			} else {
				System.out.println("윤년");
			}
		} else {
			System.out.println("평년");
		}

		// 4-2
		if (year % 400 == 0) {
			System.out.println("윤년");
		}
		else if (year % 100 == 0) {
			System.out.println("평년");
		} 
		else if (year % 4 == 0) {
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}

		// 4-3
		/*
		> 1. 4로 나누어 떨어지는 연도는 윤년이다.  
		> 2. 100으로 나누어 떨어지는 연도는 윤년이 아니다.  
		     => 윤년이 되도록 바꾸면
			    100으로 나누어 떨어지지 않으면 윤년이다.
			 => 1, 2번 문장을 합치면
			    4로 나누어 떨어지고, 100으로 나누어 떨어지지 않으면 윤년이다.
		> 3. 400으로 나누어 떨어지는 연도는 무조건 윤년이다.    
		*/

		if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) {
			System.out.println("윤년");
		}
		else {
			System.out.println("평년");
		}
		
		
		// 5. 윷놀이
		System.out.print("윷 상태를 입력하세요:");
		int st1 = scan.nextInt();
		int st2 = scan.nextInt();
		int st3 = scan.nextInt();
		int st4 = scan.nextInt();

		int sum = st1 + st2 + st3 + st4;
		switch (sum) {
		case 1:
			System.out.println("도");
			break;
		case 2:
			System.out.println("개");
			break;
		case 3:
			System.out.println("걸");
			break;
		case 4:
			System.out.println("윷");
			break;
		default:
			System.out.println("모");
		}
		
		// 또는
		if (sum == 1) {
			System.out.println("도");
		} else if (sum == 2) {
			System.out.println("개");
		} else if (sum == 3) {
			System.out.println("걸");
		} else if (sum == 4) {
			System.out.println("윷");
		} else {
			System.out.println("모");
		}
	}

}
