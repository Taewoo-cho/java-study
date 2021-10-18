package application;

import java.util.Random;

public class RandomWord {
	private String books = 
					"industry information magazine possession republic "
					+ "database criticism internet attention government "
					+ "reflection strategy preparation transportation replacement "
					+ "explanation direction historian secretary resource";
	private String[] words = books.split(" "); //문자열을 스페이스 기준으로 쪼개기
	
	private String selectWord;
	private char[] characters;
	private Random random = new Random();	// 랜덤 객체를 생성
	
	//---------------변수 / 메소드----------------------
	public void RandomWords() {
		selectWord = words[random.nextInt(words.length)]; 	// 랜덤으로 단어선택
		characters = new char[selectWord.length()]; 	// 문자 배열 공간 생성
	}
	
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for(char c: characters) {	// 문자 배열의 갯수만큼 언더바 생성		
			sb.append(c == '\u0000' ? '_' : c);
			sb.append(' ');
		}
		System.out.println(selectWord);
		return sb.toString();
	}	// 랜덤변수를 이용해 배열의 무작위 단어를 리턴

	
	public void addGuess(char c) {
		// 사용자가 입력한 한 문자를 선택된 단어에서 같은것이 있는지 확인
		// 있으면 characters 의 인덱스 위치에 입력.
		for(int i=0; i< selectWord.length(); i++) {
			if(c == selectWord.charAt(i)) {
				characters[i] = c;
			}
		}		
	}

	
	public void getWords() {
		System.out.println(selectWord);
//		for(String w : words) {
//			System.out.println(w);
//		}
	}


	public boolean isCompleted() {
		for(char c : characters) {
			if(c=='\u0000') {
				return false; //캐릭터즈 배열에 못맞춘 철자가 있음
			}
			
		}
		return true; // 다 맞춤
	}
			
}
