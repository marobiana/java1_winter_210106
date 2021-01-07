package condition_ex;

import java.util.Scanner;

public class Ex03 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		// if-else문
		System.out.print("몸무게를 입력하세요:");
		int weight = scan.nextInt();
		
		// 몸무게가 70키로 이하이면 치킨, 아니면 샐러드 
		if (weight <= 70) {
			System.out.println("치킨 먹자!!!");
		} else {
			System.out.println("샐러드 먹자!!!");
		}
		
		
		// if - else if - else문
		if (weight <= 70) {   // 70 이하
			System.out.println("치킨 먹자");
		} else if (weight <= 75) {  // 70키로 초과이고 75키로 이하: 71~75
			System.out.println("닭가슴살 먹자");
		} else if (weight <= 80) {  // 75키로 초과이고 80키로 이하: 76~80
			System.out.println("샐러드나 먹자");
		} else {					// 80키로 초과
			System.out.println("굶자");
		}
	}
}
