package class_quiz;

public class Student {
	String name;
	String className;
	int age;
	String phoneNumber;
	
	public void isAdult() {
		if (age >= 20) {
			System.out.println(name + "은 성인입니다.");
		} else {
			System.out.println(name + "은 미성년자입니다.");
		}
	}
}
