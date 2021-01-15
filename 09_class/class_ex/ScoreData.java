package class_ex;

// 설계도
public class ScoreData {
	// 속성: 멤버변수 또는 필드(field)
	int score;
	String subject;
	int ranking;
	
	// 행위: 메소드
	void printInfo() {
		System.out.println("과목명:" + this.subject);
		System.out.println("점수:" + this.score);
		System.out.println("등수:" + this.ranking);
	}
}
