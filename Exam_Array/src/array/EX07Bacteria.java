package array;

public class EX07Bacteria {

	public static void main(String[] args) {
		// 배열 생성
		int[] bacteriaCountLogs = new int[10];
		
		// 개체 수 기록
		writeLog(bacteriaCountLogs);
		
		// 결과 출력
		printLog(bacteriaCountLogs);

	}

	private static void printLog(int[] arr) {
		System.out.print("[");
		for (int i = 0; i<arr.length; i++) {
			System.out.printf("%d", arr[i]);
			if(i != arr.length -1) {
				System.out.print(", ");
			}
		}
		System.out.print("]");
		
	}

	private static void writeLog(int[] logs) {
		for(int i = 0; i < logs.length; i++) {
			logs[i] = (int)Math.pow(2, i);
		}
	}

}
