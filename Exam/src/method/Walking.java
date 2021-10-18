package method;

public class Walking {

	private static int walk;
	public static void main(String[] args) {
		// 칼로리 계산을 위해 메소드를 호출하시오.
		walk = 5000;
		double cal = calculate(walk);
		// 결과를 출력하시오
		System.out.println("소모칼로리: " + cal + "kcal");
		
		
	}

	private static double calculate(int i) {
		// 칼로리 계산을 위해 메소드를 정의하시오
		return 0.02 * walk;
	}

}
