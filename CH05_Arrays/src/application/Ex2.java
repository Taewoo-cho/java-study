package application;

public class Ex2 {

	public static void main(String[] args) {
		// 3x3 정수배열을 만든다 숫자는 1,5,7 / 9,6,3 / 2,4,6 을넣음
		// 정수 배열을 for문을 사용해 전체 숫자의 합을 구한다
		// 그 합 total 값을 출력한다
		int[][] number = {
				{1,5,7},
				{9,6,3},
				{2,4,6},
				{1,2,3,4,5}
		};
		int total = 0;
		for(int i =0; i<number.length; i++) {		// 행의 갯수
			for(int j=0; j<number[i].length; j++) {	// 열의 갯수
				total+=number[i][j];
			}
		}
		System.out.println("총합은 : "+total);
	}

}
