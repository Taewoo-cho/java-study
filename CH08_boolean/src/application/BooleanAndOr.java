package application;

public class BooleanAndOr {

	public static void main(String[] args) {
		// || or 논리 연산자
		// ==, !=, !, &&, ||
		boolean isRaining = true; // 비오나?
		boolean mightRain = false; // 우산이 있는가?
		boolean takeUmbrella = false; // 우산이 있는가?
		
		takeUmbrella = isRaining || mightRain; // 비가 오거나 올수도 있거나 하더라도 하나가 참이면 참
		
		System.out.println(takeUmbrella);

	}

}
