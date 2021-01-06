package variable_quiz;

public class Quiz02 {

	public static void main(String[] args) {
		// 1.
		/*
		 * 시험 성적이 90점 이상이면 'A'학점이고 평점은 4.0 입니다.
			시험 성적이 80점 이상이면 'B'학점이고 평점은 3.0 입니다.
		 */
		char grade = 'A';
		double point = 4.0;
		System.out.println("시험 성적이 90점 이상이면 '" + grade + "'학점이고 평점은 " + point + " 입니다.");
		
		grade = 'B';
		point = 3.0;
		System.out.println("시험 성적이 80점 이상이면 '" + grade + "'학점이고 평점은 " + point + " 입니다.");
		
		// 2. 
		int number1 = 33;
		double number2 = 35.325;
		double result = number1 * number2;
		System.out.println("두 수의 곱 :" + result);
		System.out.println("두 수의 곱 :" + (number1 * number2));
		
		// 3. 943시간은 39일  OO시간 입니다.
		int hour = 943;
		int day = hour / 24;
		int h = hour % 24;
		System.out.println(hour + "시간은 " + day + "일 " + h + "시간 입니다.");
		
		// 4. 가로 길이 8, 세로 길이 9인 사각형과 삼각형의 넓이를 각각 구하여 출력하세요.
		// 사각형의 넓이: 72
		// 삼각형의 넓이: 36
		int width = 8;
		int height = 9;
		int rectangleArea = width * height; // 사각형
		double triangleArea = width * height / 2; // 삼각형
		System.out.println("사각형의 넓이:" + rectangleArea);
		System.out.println("삼각형의 넓이:" + triangleArea);
	}
}
