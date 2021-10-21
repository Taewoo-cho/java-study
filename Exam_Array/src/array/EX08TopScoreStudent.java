package array;

public class EX08TopScoreStudent {

	public static void main(String[] args) {
		// 배열 생성
		String[] names = {"Elena", "Suzie", "John", "Emily", "Neda", "Kate", "Alex", "Daniel", "Hamilton"};
		int[] scores = {65,74,23,75,68,96,88,98,54};
		
		// 1등 인덱스 검색
		int i = topIndex(scores);
		
		// 결과 출력
		System.out.println("1등: " + names[i]+ "("+ scores[i]+"점)");
		
	}

	private static int topIndex(int[] arr) {
		int top =0;
		int max=0;
		for(int i = 0; i<arr.length; i++) {
			if(max<arr[i]) {
				max=arr[i];
				top = i;
			}
		}
		return top;
	}

}
