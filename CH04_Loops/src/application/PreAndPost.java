package application;

public class PreAndPost {

	public static void main(String[] args) {
		// 증감연사자 위치에 따라 먼저 증감하고 할당(=), 먼저 할당(=)하고 증가
		int cats=5;
		System.out.println("후위연산자 : "+ cats++); // 먼저 할당한 후 증감
		System.out.println(cats);
		
		int dogs = 3;
		System.out.println("전위 연산자 : " + ++dogs); // 먼저 증감한 후 할당
		System.out.println(dogs);
		
		int chickens = 10;
		
		int animals = cats + chickens++; // 6 + 10(연산끝난 후 증감)
		
		System.out.println(animals);
		
		int apples =5;
		int bananas = 4;
		
		int fruits = ++apples + bananas++;
		System.out.println(fruits);
		

	}

}
