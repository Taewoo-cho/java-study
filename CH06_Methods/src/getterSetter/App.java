package getterSetter;

public class App {

	public static void main(String[] args) {
		// 접근제어자 private는 같은 클래스에서만 접근이 가능하다
		Person p1 = new Person();
		
		p1.setName("응애");
		System.out.println(p1.getName());
		
		p1.setAge(5);
		System.out.println(p1.getAge());
	}

}
