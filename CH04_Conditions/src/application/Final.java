package application;

public class Final {

	public static void main(String[] args) {
		// 상수 키워드 final 변하지 않는 변수. 이름을 대문자로 만듦
		final int VALUE= 9;
		//VALUE = 10; // final 로 선언한 변수는 재선언 불가
		
		System.out.println(VALUE);
		
		final String USER_PASSWORD = "abc";
		//USER_PASSWORD = "abcd";
		System.out.println(USER_PASSWORD);
		
	}

}
