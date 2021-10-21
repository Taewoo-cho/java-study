package array;

public class Ex03MergeTwoArray {

	public static void main(String[] args) {
		// 배열 생성
		int[] evens = {0,2,4,6,8};
		int[] odds = {1,3,5,7,9};
		
		// 배열 병합
		int[] result = merge(evens, odds);
		
		// 결과 출력
		for(int i = 0; i < result.length; i++) {
			System.out.print(result[i] + " ");
		}

	}

	private static int[] merge(int[] evens, int[] odds) {
		int[] mergeArr = new int[evens.length+odds.length];
		
		int j= 0;
		for(int i = 0; i < mergeArr.length; i+=2) {
			mergeArr[i] = evens[j];
			j++;
		}
		j = 0;
		for(int i = 1; i < mergeArr.length; i+=2) {
			mergeArr[i] = odds[j];
			j++;
		}
		return mergeArr;
	}

}
