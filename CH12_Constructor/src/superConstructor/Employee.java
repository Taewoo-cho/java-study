package superConstructor;

public class Employee extends Person {
	
	public Employee() {  
		super("익명"); // (생략되어 있음) 
					// 상속 받은경우 부모객체->자식객체
		System.out.println("Employee 생성자");
	}

}
