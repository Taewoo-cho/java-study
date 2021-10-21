package hashcode_this;

public class App {

	public static void main(String[] args) {
		
		Fox fox1 = new Fox();
		//System.out.println(fox1);
		System.out.printf("해시코드: %x\n", fox1.hashCode()); // 해시코드(주소값)을 16진수 변환
		System.out.println("toString: "+fox1.toString());
	
		
		Fox fox2 = fox1;
		System.out.println(fox2);
		System.out.println(fox2.name);
		
		Fox fox3 = new Fox();
		System.out.println(fox3);
		System.out.println(fox3.toString());
		
		
//		Fox fox1 = new Fox();
//		System.out.println(fox1);
//		//System.out.println(fox1.toString());
//		
//		Fox fox2 = new Fox();
//		System.out.println(fox2);
//		//System.out.println(fox2.toString());
//		
//		Fox fox3 = fox1;
//		System.out.println(fox3);
//		System.out.println(fox3.name);
		
		

	}

}
