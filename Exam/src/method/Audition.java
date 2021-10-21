package method;

public class Audition {

	public static void main(String[] args) {
		// 변수 생성
		double tomVocal = 8.8;
		double tomDance = 7.6;
		double kateVocal = 9.2;
		double kateDance = 7.8;
		
		// 결과출력
		System.out.printf("Tom의 오디션 결과: %s\n", test(tomVocal, tomDance));
		System.out.printf("Kate의 오디션 결과: %s\n", test(kateVocal, kateDance));
		

	}

	private static String test(double Vocal, double Dance) {
		double score = Vocal*Dance;
		String result = (score>=70.0) ? "합격" : "불합격";
		return result;
	}

}
