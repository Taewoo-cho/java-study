package staticMethod;

public class App {

	public static void main(String[] args) {
		// 스테틱 메소드 getCount 사용
		//final String CAT_COUNT = "고양이 숫자: %d\n";
		
		// String.format은 printf를 사용하는 문자열로 리턴된다.
		String catCount =String.format("고양이 숫자: %d\n", Cat.getCount());
		System.out.println(catCount);
		
		Cat cat1 = new Cat("마틸다");
		Cat cat2 = new Cat("라이언");
		Cat cat3 = new Cat("울버린");
		
		System.out.println(cat1);
		System.out.println(cat2);
		System.out.println(cat3);
		
		
		catCount = String.format("고양이 숫자: %d\n", Cat.getCount());
		System.out.println(catCount);
		
		int x = add(1,1);
		System.out.println(x);
		// static 메모리에 한번 할당하면 프로그램이 종료될 때 해제되는 것
		
	}

	private static int add(int a, int b) {
		// TODO Auto-generated method stub
		return a+b;
	}



}
