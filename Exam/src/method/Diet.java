package method;

public class Diet {

	public static void main(String[] args) {
		//변수
		double weight = 81.6;
		double height = 1.76;
		
		//BMI
		double BMI = Calculating(weight, height);
		
		String conclusion = result(BMI);
		
		// 출력
		System.out.printf("BMI: %.2f (%.1f kg, %.2f m)\n", BMI, weight, height);
		System.out.printf("결과: %s입니다.\n", conclusion);


	}

	private static String result(double BMI) {
		String result = "";
		if(BMI < 20) {
			result = "저체중";
		} else if (BMI <=24) {
			result = "정상체중";
		} else if (BMI <=29) {
			result = "과체중";
		} else {
			result = "비만";
		}
		return result;
	}

	private static double Calculating(double weight, double height) {
		double BMI = weight / (height * height);
		return BMI;
	}

}
