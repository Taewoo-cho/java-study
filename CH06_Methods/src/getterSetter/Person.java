package getterSetter;

public class Person {
	//클래스 안에 만든 변수를 인스턴스 변수라 하고 => 객체 생성시 사용가능(생성됨)
	private String name;
	private int age;
	//클래스 안에 만든 함수를 메소드라고 한다 => 객체 생성시 사용가능(생성됨)
	public void setName(String name) {
		this.name = name;
	}
	public String getName() {
		return name;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public int getAge() {
		return age;
	}
}
