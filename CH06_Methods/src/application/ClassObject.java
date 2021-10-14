package application;

class Person {
	String name;
}

public class ClassObject {

	public static void main(String[] args) {
		// 클래스란 설계도로 실제 가능한 사용가능한 객체를 생성함
		Person p1 = new Person();	// 실제 객체를 생성
		p1.name = "펭수";
		
		Person p2 = new Person();	// 실제 객체를 생성
		p2.name = "무야호";
		
		System.out.println(p1.name);
		System.out.println(p2.name);

	}

}
