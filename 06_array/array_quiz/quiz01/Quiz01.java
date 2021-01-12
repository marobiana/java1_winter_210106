package array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int[] numbers = {3, 8, 9, 4, 2, 1, 7, 5};
		
		// 1. 배열 값 접근
		numbers[3] = 6;
		
		// 2. 배열 출력
		for (int i = 0; i < numbers.length; i++) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 3. 배열 역순 출력
		for (int i = numbers.length - 1; i >= 0; i--) {
			System.out.print(numbers[i] + " ");
		}
		System.out.println();
		
		// 4. 배열 출력
		for (int i = 0; i < numbers.length; i++) {
			if (i % 2 != 0) {
				System.out.print(numbers[i] + " ");
			}
		}
		System.out.println();
		
		// 5. index
		for (int i = 0; i < numbers.length; i++) {
			if (numbers[i] == 2) {
				System.out.println("2가 들어있는 index는 " + i);
			}
		}
		
		// 6. 최대값
		int max = numbers[0];
		for (int i = 1; i < numbers.length; i++) {
			if (max < numbers[i]) {
				max = numbers[i];
			}
		}
		System.out.println("가장 큰 값은 " + max);
		
		// 7. 최소값
		int min = numbers[0];
		int minIndex = 0;
		for (int i = 1; i < numbers.length; i++) {
			if (min > numbers[i]) {
				minIndex = i;
			}
		}
		System.out.println("최소값의 index는 " + minIndex);
		
		// 8. 평균
		int sum = 0;
		for (int i = 1; i < numbers.length; i++) {
			sum += i;
		}
		double average = sum / (double)numbers.length;
		System.out.println("평균은 " + average);
	}

}
