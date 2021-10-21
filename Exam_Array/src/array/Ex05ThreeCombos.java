package array;

public class Ex05ThreeCombos {

	public static void main(String[] args) {
		// n을 만드는 3가지 수 출력
		printCombos(10);

	}

	private static void printCombos(int n) {
		// 변수, 배열 생성
		System.out.println(n + "을 만드는 3가지 정수의 곱");
		int count = 0;
		int i,j,k;
		for(i=0;i<=n;i++) {
			for(j=0;j<=n;j++) {
				for(k=0;k<=n;k++) {
					if(n==i*j*k) {
						System.out.printf("%d= %d * %d * %d \n", n, i, j, k);
						count++;
					}
				}
			}
		}
		System.out.println("===================");
		System.out.println("경우의 수는" + count + "가지");
		
	}

}
