package convertingTemp;

public class App {

	public static void main(String[] args) {
		// 섭씨(Celsius)를 화씨(Fahrenhiet)로 변환
		double c = 25;
		double f = (c * 9/5) + 32; // 화씨 공식
		System.out.println("섭씨 " +c+ "는 화씨 " + f+"이다.");
	}

}
