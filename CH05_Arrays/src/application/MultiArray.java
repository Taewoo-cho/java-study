package application;

public class MultiArray {

	public static void main(String[] args) {
		// 이중배열
		String[][] texts = {
				{"하나", "둘", "셋"},		// (0,0~2)
				{"넷", "다섯", "여섯"},		// (1,0~2)
				{"일곱", "여덟", "아홉"}	// (2,0~2)
		};
		
		for(int i=0; i<texts.length; i++ ) {
			String[] innerArray = texts[i]; // 첫번째 배열의 주소
			
			for(int j=0; j<innerArray.length; j++) {
				System.out.printf("%s\t", innerArray[j]);
			}
			System.out.println();
		}
		
		

	}

}
