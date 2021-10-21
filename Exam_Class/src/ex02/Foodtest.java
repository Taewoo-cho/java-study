package ex02;

public class Foodtest {

	public static void main(String[] args) {
		// 객체 생성
		Food chicken = new Food("치킨", 18000);
		Food pizza = new Food("피자", 28000);
		Food sushi = new Food("초밥", 22000);
		
		// 객체 배열에 음식 담기
		Food[] foods = { chicken, pizza, sushi };
		
		// 모든 음식정보 출력
		for(int i = 0; i< foods.length; i++) {
			System.out.println(foods[i].toString());
		}
		
	}

}
