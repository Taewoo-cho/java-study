package method;

public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person(); // (사용할 클래스) (객체이름) = new (클래스)
		System.out.println(p1.name); //참조 자료형 String은 null값이 초기값
		System.out.println(p1.age);	// int는 0이 초기값
		
		p1.name = "무야호";
		p1.age = 7;
		
		System.out.println(p1.name); 
		System.out.println(p1.age);

		p1.sayHello(); // 메소드 호출
		
		Person p2 = new Person();
		p2.name = "응애";
		Person p3 = new Person();
		p3.name = "라이언";
		
		p2.sayHello();
		p3.sayHello();
		
	}

}
