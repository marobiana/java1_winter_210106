package two_d_array_quiz;

public class Quiz01 {

	public static void main(String[] args) {
		int[][] scores = {
			    {89, 93, 91, 93, 92, 78, 90, 90, 93, 90},
			    {91, 82, 72, 98, 92, 87, 77, 87, 74, 88},
			    {98, 93, 94, 91, 97, 94, 91, 96, 98, 90},
			    {65, 63, 57, 87, 88, 92, 78, 85, 100, 68},
			    {45, 50, 48, 63, 67, 58, 40, 66, 47, 64}
			};
		
		// 1. 학생별 평균
		for (int i = 0; i < scores.length; i++) { // i 학생
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) { // j 점수
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length;
			// 1번째 학생의 평균은 89.9
			System.out.println((i + 1) + "번째 학생의 평균은 " + average);
		}
		
		// 2. 각 학생의 최고 점수를 구해서 출력하세요.
		for (int i = 0; i < scores.length; i++) {  // 학생들
			int maxScore = 0;
			for (int j = 0; j < scores[i].length; j++) { // 점수들
				if (maxScore < scores[i][j]) {
					maxScore = scores[i][j];
				}
			}
			// i번째 학생의 최고점은 maxScore
			System.out.println((i + 1) + "번째 학생의 최고점은 " + maxScore);
		}
		
		// 3. 평균이 가장 높은 학생의 평균점수와 몇 번째 학생인지 출력하세요.
		// 출력 문구: 평균이 가장 높은 학생은 3번째 학생이고, 평균 점수는 94.2
		
		int maxIndex = 0;
		double maxAverage = 0;
		for (int i = 0; i < scores.length; i++) {  // 학생
			int sum = 0;
			for (int j = 0; j < scores[i].length; j++) {  // 점수
				sum += scores[i][j];
			}
			double average = sum / (double)scores[i].length;
			
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
		}
		// 평균이 가장 높은 학생은 3번째 학생이고, 평균 점수는 94.2
		System.out.println("평균이 가장 높은 학생은 " + (maxIndex + 1) + "번째 학생이고, 평균 점수는 " + maxAverage);
		
		// 4. 4번째 과목의 최고 성적의 학생이 몇 번째 학생인지와 점수를 출력하세요.
		// 출력 문구: 4번째 과목의 최고 성적자는 2번째 학생이고, 점수는 98
		int maxScore = 0;
		maxIndex = 0;
		for (int i = 0; i < scores.length; i++) { // 학생
			if (maxScore < scores[i][3]) {
				maxScore = scores[i][3];
				maxIndex = i;
			}
		}
		System.out.println("4번째 과목의 최고 성적자는 " + (maxIndex + 1) + "번째 학생이고, 점수는 " + maxScore);
		
		// 5. 시험과목 index 3~7 의 평균이 가장 높은 학생의 index를 구하여 출력하세요.
		// 출력 문구: 3~7 과목 평균이 가장 높은 학생은 3번째 학생이고, 평균은 93.8입니다. 
		maxIndex = 0;
		maxAverage = 0;
		for (int i = 0; i < scores.length; i++) { // i: 학생
			int sum = 0;
			for (int j = 3; j <= 7; j++) { // j: 과목
				sum += scores[i][j];
			}
			double average = sum / 5.0;
			if (maxAverage < average) {
				maxAverage = average;
				maxIndex = i;
			}
		}
		System.out.println("3~7 과목 평균이 가장 높은 학생은 " + (maxIndex + 1) + "번째 학생이고, 평균은 " + maxAverage);
	}
}
