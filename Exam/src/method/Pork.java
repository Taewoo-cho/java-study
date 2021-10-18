package method;

public class Pork {

	public static void main(String[] args) {
		// 1. 변수를 생성하시오
		int serving = 3;
		// 2. 메소드를 통한 칼로리를 계산하시오
		double cal =  calculateCalory(serving);
		// 3. 결과를 출력하시오
		System.out.printf("삼겹살 3인분: %.2f kcal\n", cal);
		

	}

	private static double calculateCalory(int serving) {
		// 4. 칼로리 계산을 위한 메소드를 작성하시오.
		return serving * 180 * 5.179;
	}

}
