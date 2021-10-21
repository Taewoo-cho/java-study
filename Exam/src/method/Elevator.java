package method;

public class Elevator {

	public static void main(String[] args) {
		//변수
		int F1 = 13;
		int F2 = 7;
		int F3 = 10;
		
		// 출력
		System.out.printf("%d층 -> %s 엘리베이터\n", F1, guide(F1));
		System.out.printf("%d층 -> %s 엘리베이터\n", F2, guide(F2));
		System.out.printf("%d층 -> %s 엘리베이터\n", F3, guide(F3));
		

	}

	private static String guide(int f) {
		String result;
		if(f>10) {
			result = "고층";
		} else {
			result = "저층";
		}
		return result;
	}

}
