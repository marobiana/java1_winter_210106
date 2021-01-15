package string_quiz;

import java.util.Scanner;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. jpg 파일 개수
		String[] files = {"cat.jpg", "dog.png", "kakao.exe", "tree.jpg", "eclipce.exe", "tmp.txt", "phone.jpg"};
		int count = 0;
		for (int i = 0; i < files.length; i++) {
			String fileName = files[i];
			boolean isJpg = fileName.endsWith("jpg");
			if (isJpg) {
				count++;
			}
		}
		System.out.println("jpg의 파일 개수:"  + count);
		
		// 2. 
//		1. 승리을 영어로 입력하세요 :victory
//		2. 사랑을 영어로 입력 하세요 :lobe
//		3. 컴퓨터를 영어로 입력 하세요 :computer
//		4. 노트북을 영어로 입력하세요 :notebook
		
//		Scanner scan = new Scanner(System.in);
//		int score = 0;
//		
//		System.out.print("승리을 영어로 입력하세요 :");
//		String answer = scan.next();
//		if (answer.equals("victory")) {
//			score += 100 / 4;
//		}
//		
//		System.out.print("사랑을 영어로 입력 하세요 :");
//		answer = scan.next();
//		if (answer.equals("love")) {
//			score += 100 / 4;
//		}
//		
//		System.out.print("컴퓨터를 영어로 입력 하세요 :");
//		answer = scan.next();
//		if (answer.equals("computer")) {
//			score += 100 / 4;
//		}
//		
//		System.out.print("노트북을 영어로 입력 하세요 :");
//		answer = scan.next();
//		if (answer.equals("notebook")) {
//			score += 100 / 4;
//		}
//		
//		System.out.println("점수: " + score);
		
		// 3. 동명이인 종류 수
		String memberStr = "김혜수:송강호:정우성:이민정1:송강호:이민정2:이민정3:이정재1:이병헌:이정재2";
		String[] names = memberStr.split(":");
		int sameCount = 0;
		
		for (int i = 0; i < names.length; i++) {
			String name = names[i];   // 검사할 기준 이름
			boolean isSame = false;
			
			if (name.equals("")) { // 동명이인으로 체크되서 빈칸인 경우 skip
				continue;
			}
			
			for (int j = i + 1; j < names.length; j++) {
				if (name.equals(names[j])) {
					isSame = true;
					names[j] = "";
				}
			}
			
			if (isSame) {
				sameCount++;
			}
		}
		
		System.out.println("동명이인 종류 수 :" + sameCount);
	}
}
