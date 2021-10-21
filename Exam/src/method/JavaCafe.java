package method;

public class JavaCafe {

	public static void main(String[] args) {
		printPay(10.00, 40);
		printPay(10.00, 50);
		printPay(7.50, 38);
		printPay(8.50, 66);

	}

	private static void printPay(double basePay, int hours) {
		double pay = 0.0;
		double hourPay = 0.0;
		
		if(basePay < 8) {
			System.out.println("최저시급에러");
		} else if(hours > 60) {
			System.out.println("초과근무시간에러");
		} else if(hours > 40) {
			hourPay = (hours - 40) * (basePay*1.5);
			hours = 40;
			pay = basePay*hours;
			System.out.printf("$%.2f\n", pay+hourPay);
		} else {
			pay = basePay*hours;
			System.out.printf("$%.2f\n", pay);
		}	
	}

}
