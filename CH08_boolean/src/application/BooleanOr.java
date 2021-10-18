package application;

public class BooleanOr {

	public static void main(String[] args) {
		// And Or 동시에 사용
		boolean isRaining = false; // 비오나?
		boolean mightRain = true; // 우산이 있는가?
		boolean haveUmbrella = true; // 우산이 있는가?
		
		if((isRaining || mightRain) && haveUmbrella) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지 않는다");
		}
		
		boolean rainCheck = isRaining || mightRain; // 비가오거나 안오거나 둘중 하나
		
		if(rainCheck = isRaining || mightRain) {
			System.out.println("우산을 쓴다!");
		} else {
			System.out.println("우산을 쓰지않 는다.");
		}

	}

}
