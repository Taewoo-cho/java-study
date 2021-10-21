package array;

public class Ex04AEIOU {

	public static void main(String[] args) {
		// 변수 생성
		String str = "Programming is Fun! right?";
		
		// 자음 모음 개수 세기
		int[] result = count(str);
		
		// 결과 출력
		System.out.printf("%s\n => 자음 %d개, 모음 %d개", str, result[0], result[1]);

	}

	private static int[] count(String str) {
		int conso = 0;
		int vowel = 0;
		
		char[] arr = str.toLowerCase().toCharArray();
		
		for(int i = 0; i < arr.length; i++) {
			switch(arr[i]) {
				case 'a': case 'e': case 'i': case 'o': case 'u':
					vowel++;
					break;
				case '.': case ',': case '?': case '!': case ' ': case '\n':
					break;
				default: 
					conso++;
					break;	
			}
		}
		int[] result = {conso, vowel};
		return result;
	}

}
