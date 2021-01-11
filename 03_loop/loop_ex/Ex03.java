package loop_ex;

public class Ex01 {

	public static void main(String[] args) {
		// break문: break가 써진 곳의 가장 가까운 반복문에서 빠져나온다.
		
		// 무한루프에서 Hello world! 다섯번 찍기
		int i = 0; 
		while (true) {
			// 0 1 2 3 4 
			if (i == 5) {
				break;
			}
			
			System.out.println("Hello world! " + i);
			i++;
		}
		
		// for문 무한루프
		for (int j = 0; ; j++) { // 조건식이 없으면 무한루프
			if (j == 5) {
				break;
			}
			System.out.println("Hello world " + j);
		}
		
		// continue : skip. 아래 코드들을 수행하지 않고 즉시 조건을 본다.
		
		// 1 ~ 10까지의 수 중에서 4의 배수일 때는 숫자를 출력하지 않기 : 1 2 3 5 6 7 9 10
		// (1) if문으로 처리
		for (int j = 1; j <= 10; j++) {
			if (j % 4 != 0) {
				System.out.print(j + " ");
			}
		}
		System.out.println();
		
		// (2) continue로 처리
		for (int j = 1; j <= 10; j++) {
			if (j % 4 == 0) {
				continue;
			}
			System.out.print(j + " ");
		}
	}
}
