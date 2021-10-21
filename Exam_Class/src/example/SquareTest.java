package example;

public class SquareTest {

	public static void main(String[] args) {
		// 1. 객체 생성
		Square s = new Square();
		
		// 2. 필드 초기화
		s.length = 4;
		
		// 3. 결과 출력
		System.out.println("한 변의 길이가 "+ s.length + "인 정사각형의 넓이: " +s.area());

	}

}
