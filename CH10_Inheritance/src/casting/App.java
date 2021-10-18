package casting;

public class App {

	public static void main(String[] args) {
		
		Cat cat1 = new HouseCat(); // 집고양이 개체
		cat1.vocal(); 				// 오버라이딩
		cat1.hunt();				// 상속
		//cat1.call();
		// Cat에 사용된 메소드만 사용이 가능하다(오버라이딩은 가능함)

		
		//다운캐스팅
		HouseCat cat2 = (HouseCat)cat1;
		cat2.call();
	}

}
