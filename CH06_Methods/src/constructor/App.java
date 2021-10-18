package constructor;

public class App {

	public static void main(String[] args) {
		
		Person p1 = new Person();
		p1.setName("무야호");
		p1.setHeight(172.5);
		
		Person p2 = new Person();
		p2.setName("응애");
		p2.setHeight(175.5);
		
		Person p3 = new Person();
		p3.setName("테에엥");
		p3.setHeight(182.5);
		
		System.out.println(p1.getName());
		System.out.println(p1.getHeight());
		System.out.println(p2.getName());
		System.out.println(p2.getHeight());
		System.out.println(p3.getName());
		System.out.println(p3.getHeight());
	}

}
