package method;

import java.util.Random;

public class Gamble {

	public static void main(String[] args) {

		double dollar = dice() + dice() + dice();
		double won = exchange(dollar);
		System.out.printf("휙득 금액: $%.2f(%.0f원)\n", dollar, won);

	}

	private static double exchange(double dollar) {
		return dollar*1082.25108;
	}

	private static int dice() {
		Random random = new Random();
		int dice = random.nextInt(6)+1;
//		System.out.print(" "+ dice);
		return dice;
	}

}
