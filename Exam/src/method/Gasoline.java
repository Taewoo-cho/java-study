package method;

public class Gasoline {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double gasoline = 8.86;
		double driving = 182.736;
		double efficiency = fuelEfficiency(gasoline, driving);
		
		System.out.printf("연비: %.2f km/L\n", efficiency);

	}

	private static double fuelEfficiency(double gasoline, double driving) {
		// TODO Auto-generated method stub
		return 182.736/8.86;
	}

}
