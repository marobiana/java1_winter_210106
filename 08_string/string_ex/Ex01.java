package string_ex;

public class Ex01 {

	public static void main(String[] args) {
		// String 변수에 값 저장하기
		String a = "안녕하세요";
		String b = new String("안녕하세요"); // 객체
		String c = new String("안녕하세요");
		String d = "안녕하세요";
		
		System.out.println(a);
		System.out.println(b);
		
		// String끼리 값 비교하기
		System.out.println(a == d); // true
		System.out.println(b == c); // false : 값을 비교한 것이 아니라 객체의 주소가 같은지를 비교한 것
		System.out.println(a == b); // false
		System.out.println(a.equals(b)); // true
	}
}
