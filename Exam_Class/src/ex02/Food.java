package ex02;

public class Food {
	// 필드 추가
	String food;
	int price;
	// 생성자 추가
	public Food(String food, int price) {
		this.food = food;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Food [food: " + food + ", price: " + price + "원]";
	}
	
	
	//
	
	
}
