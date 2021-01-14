package two_d_array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		// 1. [2][3]  10
		int[][] arr1 = new int[2][3];
		
		// 입력
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr1[i].length; j++) {
				arr1[i][j] = 10;
			}
		}
		
		// 출력
		printArray(arr1); // argument 전달인자
		
		// 2. 
//		1 2 3 4 
//		1 2 3 4 
//		1 2 3 4 
		int[][] arr2 = new int[3][4];
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr2[i][j] = j + 1;
			}
		}
		
		// 출력
		printArray(arr2);
		
		// 3. 
//		1 1 1
//		2 2 2 
//		3 3 3 
		int arr3[][] = new int[3][3];
		for (int i = 0; i < arr3.length; i++) {
			for (int j = 0; j < arr3[i].length; j++) {
				arr3[i][j] = i + 1;
			}
		}
		
		printArray(arr3);
		
		
		// 4. 
//		0 0 1 0 0 
//		0 0 1 0 0 
//		1 1 1 1 1 
//		0 0 1 0 0 
//		0 0 1 0 0
		// 행의 i가 index가 2일 때, 열의 j가 index가 2일 때 1을 채운다.
		int[][] arr4 = new int[5][5];
		for (int i = 0; i < arr4.length; i++) {
			for (int j = 0; j < arr4[i].length; j++) {
				arr4[i][j] = 0;
				if ((arr4.length - 1) / 2 == i || (arr4.length - 1) / 2 == j) {
				//if (i == 2 || j == 2) {
					arr4[i][j] = 1;
				}
			}
		}
		
		printArray(arr4);
		
		// 5.
//		1 2 3    i:0 * 3 , j:j+1=1   = 1
//		4 5 6    i:1 * 3 , j:j+1=1   = 4
//		7 8 9    i:2 * 3 , j:j+1=1   = 7
		// 열이 1씩 증가되고 있다. j + 1
		int arr5[][] = new int[3][3];
		for (int i = 0; i < arr5.length; i++) {
			for (int j = 0; j < arr5[i].length; j++) {
				arr5[i][j] = (i * 3) + (j + 1);
			}
		}
		printArray(arr5);
		
		// 6. 
//		1 4 7    i+1=1 + j:0*3
//		2 5 8    i+1=1 + j:1*3
//		3 6 9    i+1=1 + j:2*3
		int[][] arr6 = new int[3][3];
		for (int i = 0; i < arr6.length; i++) {
			for (int j = 0; j < arr6[i].length; j++) {
				arr6[i][j] = (i + 1) + (j * 3);
			}
		}
		
		printArray(arr6);
	}
	
	public static void printArray(int[][] arr) { // parameter 매개 변수
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " "); // 값 출력
			}
			System.out.println(); // 줄바꿈
		}
		System.out.println(); // 줄바꿈
	}
	
}
