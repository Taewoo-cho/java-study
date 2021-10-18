package test;


import java.util.Random;

public class text {

	public static void main(String[] args) {
		// 테스트용
		//RandomWord word = new RandomWord();
		
		//word.getWords();
		
		//System.out.println(word.toString());
		
		Random random = new Random();
		
		String[] words = {"펭수", "고양이", "라이언" , "늑대" , "소"};
		
		
		
		for(int i =0; i<100; i++) {
			int n = random.nextInt(words.length);
			System.out.println(words[n]);
		}
		
	}

}
