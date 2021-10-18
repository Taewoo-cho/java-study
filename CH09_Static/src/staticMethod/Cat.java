package staticMethod;

public class Cat {
	private String name; // 고양이 이름
	private int id;
	public static final String FOOD = "고양이 사료";
	// 스테틱 변수는 객체에서 공유가 가능하다
	private static int count = 0; // 생성한 고양이 숫자
	
	public Cat(String name) {
		this.name = name;
		// 코드 추가
		count++; // 고양이 객체 생성시 스테틱 count +1됨
		id = count;
	}
	
	@Override
	public String toString() { // toString 자동생성
		return "고양이 [아이디=" + id +", 이름=" + name + "]";
	}

	public static int getCount() { 
		//String n = name;  스테틱 메소드에서 인스턴스(객체)를 사용할 수 없다.
		return count;
	}
}
