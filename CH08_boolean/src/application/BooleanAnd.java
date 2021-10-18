package application;

public class BooleanAnd {

	public static void main(String[] args) {
		// ==, !=, !, &&, ||
				boolean isRaining = false; // 비오나?
				boolean haveUmbrella = true; // 우산이 있는가?
				boolean takeUmbrella = false; // 우산이 있는가?
				
				// 1. 비가오고 우산이 있으면 우산을 쓴다
				if(isRaining) {
					if(haveUmbrella) {
						takeUmbrella = true;
					}
				}
				System.out.println("첫번째 경우 : " + takeUmbrella);
				
				// 2. And 연산자 &&
				if(isRaining && haveUmbrella) {
					
				}
				System.out.println("AND 사용시 : " + takeUmbrella);
				
				// 3. 삼항조건 연산자
				takeUmbrella = isRaining && haveUmbrella ? true : false;
				System.out.println("삼항조건 사용 : " + takeUmbrella);

	}

}
