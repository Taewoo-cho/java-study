package school;

public class App {

	public static void main(String[] args) {
		Student s1 = new Student("무야호", 7, true, 36.5);
		Student s2 = new Student("테에엥", 17, false, 37.5);
		Student s3 = new Student("라이언", 27, true, 36.0);
		Student s4 = new Student();
		
		System.out.println(s1.toString());
		System.out.println(s2.toString());
		System.out.println(s3.toString());
		System.out.println(s4.toString());

	}

}
