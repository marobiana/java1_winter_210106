package condition_ex;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("숫자를 입력하세요:");
		int number = scan.nextInt();
		
		// if - else if - else문
		if (number == 1) {
			System.out.println("1이다.");
		} else if (number == 2) {
			System.out.println("2이다.");
		} else {
			System.out.println("1이나 2가 아니다.");
		}
		
		// switch 문: 조건이 '같다' 조건일 때 if문을 대체해서 사용할 수 있다.
		// case에 해당했을 때 조건을 빠져나오기 위해 break문을 사용한다.
		switch (number) {
		case 1:
			System.out.println("1이다.");
			break;
		case 2:
			System.out.println("2이다.");
			break;
		default:
			System.out.println("1이나 2가 아니다.");
		}
	}
}
