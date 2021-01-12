package nested_loop_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. 두 개의 주사위를 굴렸을 때, 나올 수 있는 모든 경우의 수
		// 1 ~ 6, 1 ~ 6
		for (int i = 1; i <= 6; i++) {
			for (int j = 1; j <= 6; j++) {
				System.out.print("(" + i + ", " + j + ")");
			}
			System.out.println();
		}
		
		// 2. 구구단 전체 출력
		for (int i = 2; i <= 9; i++) {
			for (int j = 1; j <= 9; j++) {
				// 2 X 1 = 2
				System.out.println(i + " X " + j + " = " + (i * j));
			}
		}
		
		// 3. 별 삼각형
		// *       - 1번째 행   : 별 한개
		// **      - 2번째 행   : 별 두개
		// ***
		// ****
		// *****   - 5번째 행   : 별 다섯개
		for (int i = 1; i <= 5; i++) {  // 행  1 2 3 4 5
			for (int j = 1; j <= i ; j++) { // 별의 개수 5
				System.out.print("*");
			}
			System.out.println();
		}
	}
}
