package constructor;

public class Person {
	private String name;
	private double height;
	
	//생성자
	public Person() {
		System.out.println("생성자를 생성합니다.");
		
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
}
