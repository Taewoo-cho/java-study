package game;

import java.util.Random;
import java.util.Scanner;

import game.objects.*;


public class Game {
						// 가위 바위 보 객체
	private GameObject[] objects = { new Scissors(), new Rock(), new Paper() }; // 배열
	private Random random = new Random();
	private Scanner scanner = new Scanner(System.in);
	
	public void run() {
		System.out.println("삼세판 가위바위보를 시작합니다");
		int win = 0;
		int score = 0;
		for(int i=1; i<=3; i++) {
			System.out.println(i + "번째 게임을 시작합니다.");
		
			// 유저의 선택
			System.out.print("가위(0), 바위(1), 보(2) 중 숫자로 선택: ");
			int num1 = scanner.nextInt();
			// 랜덤으로 컴퓨터의 선택 Scissors(), Rock(), Paper() 실행
			int num2 = random.nextInt(objects.length);
			
			// 각각에 id와 name 부여
			GameObject ob1 = objects[num1]; 
			GameObject ob2 = objects[num2]; 
			
			// ob1에 id와 name이 있으며 name만 출력
			System.out.println("당신의 선택은 : " +ob1.getName());
			System.out.println("컴퓨터 선택은 : " +ob2.getName());
			
			// 2차 배열로 비교
			score = ob1.compare(ob2);
			// 승패 카운트
			win = win + score;
			
		//  for each 문 -> for(type 변수 : 배열)
			//	for(GameObject ob : objects) {
			//		System.out.println(ob.toString());
			//	}
				
		}
		
		
		if(win >0) {
			System.out.println("당신의 승리!");
		} else if(win < 0) {
			System.out.println("당신의 패배!");
		} else {
			System.out.println("비겼습니다");
		}
		 
	}
}
