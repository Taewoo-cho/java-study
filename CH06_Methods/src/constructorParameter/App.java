package constructorParameter;

public class App {
	public static void main(String[] args) {
		Person p1 = new Person("무야호", 120.0);
		Person p2 = new Person("테에엥", 135.2);
		Person p3 = new Person("라이언", 165.5);
		Person p4 = new Person();
		
		System.out.println(p1.toString());
		System.out.println(p2.toString());
		System.out.println(p3.toString());
		System.out.println(p4.toString());
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
		System.out.println(p4.getName());
		System.out.println(p4.getHeight());
	}
}
