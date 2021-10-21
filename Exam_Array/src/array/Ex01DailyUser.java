package array;

public class Ex01DailyUser {

	public static void main(String[] args) {
		// 배열생성
		int[] users = { 581, 512, 527, 495, 423, 141, 236 };
		
		// 총 유저 계산
		double totalUsers = sum(users);
		
		System.out.printf("총 사용자: %.0f명\n", totalUsers);
		
		// 평균 유저 계산
		double dailyUser = average(totalUsers, users.length);
		System.out.printf("총 사용자: %.2f명\n", dailyUser);
		
	}

	private static double average(double sum, int count) {
		
		return sum / count;
	}

	private static double sum(int[] users) {
		double sum = 0;
		for (int i = 0; i<users.length; i++) {
			sum +=users[i];
		}
		return sum;
	}

}

