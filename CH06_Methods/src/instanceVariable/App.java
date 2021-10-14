package instanceVariable;

public class App {

	public static void main(String[] args) {
		// 같은 패키지의 Person 클래스는 바로 불러와서 사용가능
		Person p1 = new Person();
		p1.name = "펭수";
		p1.age = 7;
		Person p2 = new Person();	//p1 p2는 다른 객체, 메모리 공간이 다름
		p2.name="무야호";
		p2.age = 17;
		
		System.out.println(p1.name);
		System.out.println(p1.age);
		System.out.println(p2.name);
		System.out.println(p2.age);
	}

}
