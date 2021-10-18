package constructorParameter;

public class Person {
	private String name;
	private double height;
	// 기본생성자
	public Person() {
		name = "신원미상";
		height = 0.0;
		System.out.println("생성자를 생성합니다.");
		
	}
	//생성자
	public Person(String name, double height) {
		System.out.println("생성자를 생성합니다.");
		this.name=name;
		this.height = height;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public void setHeight(double height) {
		this.height = height;
	}
	public double getHeight() {
		return height;
	}
	
	public String toString() {
		String text = "이름: " + name + " 키: " + height;
		return text;
	}
}
