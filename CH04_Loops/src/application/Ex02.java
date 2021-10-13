package application;

public class Ex02 {

	public static void main(String[] args) {
		// 카운트의 값을 증가한것처럼 감소를 시켜보자
		int counter =0;
		
		while(counter <5) {
			System.out.println(counter);
			counter++;
		}
		
		counter--;
		
		while(counter > 0) {
			counter--;
			System.out.println(counter);
		}
	}

}
