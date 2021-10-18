package application;

import java.util.Scanner;

public class Hangman {
	
	private boolean running = true;
	private RandomWord word = new RandomWord();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		/* 게임 시작
		1. 화면에 단어표시
		2. 철자 입력
		3. 철자가 맞는지 체크 (다맞으면 종료)
		4. 이 과정이 반복
		*/
		word.RandomWords();
		
		do {
			displayWord();		// 화면에 단어표시
			getUserInput();		// 입력받음
			checkUserInput();	// 맞는지 체크 다맞으면 running = false
			
		} while(running);
	}
	public void close() {
		// 게임 종료, 스캐너 닫기
		scanner.close();
	}
	private void checkUserInput() {
		// 유저가 단어 철자를 다 맞췄는지 체크해서 게임을 종료 running을 false
		// 게임종료 확인하는 메소드 isCompleted 만들기
		if(word.isCompleted()) {// boolean으로 리턴
			System.out.println("잘 맞췄어요!");
			System.out.print("정답은 : "); 
			word.getWords();
			running = false;
		}
	}
	
	private void getUserInput() {
		//System.out.println("단어맞추기");
		// 유저에게 한문자 입력 요구
		// 입력 받은 문자열에서 그 문자를 뽑아서 RandomWord 클래스에 전달 => addGuess(문자)
		System.out.print("한 문자 입력 : ");
		String guess = scanner.nextLine();
		word.addGuess(guess.charAt(0)); // 문자열 guess의 제일 첫번째 문자
		
	}
	
	private void displayWord() {
		// 랜덤단어 출력
		System.out.println(word.toString());
		
	} 

}
