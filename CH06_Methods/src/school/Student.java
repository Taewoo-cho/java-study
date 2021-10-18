package school;

public class Student {
	//변수
	private String name;
	private int age;
	private boolean isVisible;
	private double temperature;
	
	public Student() {
		//이름모름
		name="이름모름";
		age=18;
		isVisible = false;
		temperature = 36.5;
	}
	// 우클릭 > 소스 > 제네레이터 게터세터, toString, Constructor using field
	public Student(String name, int age, boolean isVisible, double temperature) {
		super();
		this.name = name;
		this.age = age;
		this.isVisible = isVisible;
		this.temperature = temperature;
	}
	
	public String getName() {
		return name;
	}
	

	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public boolean isVisible() {
		return isVisible;
	}
	public void setVisible(boolean isVisible) {
		this.isVisible = isVisible;
	}
	public double getTemperature() {
		return temperature;
	}
	public void setTemperature(double temperature) {
		this.temperature = temperature;
	}

	@Override
	public String toString() {
		return "Student [이름=" + name + ","
						+ " 나이=" + age + ","
						+ " 집체=" + isVisible + ","
						+ " 온도=" + temperature
						+ "]";
	}
	
	// 게터 세터 자동
	
	
}
