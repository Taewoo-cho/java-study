package application;

import java.util.Scanner;

public class Switch2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("계속 진행하시겠습니까? (Y/N): ");
		String input = scanner.nextLine(); // 스캐너 문자열 입력
		scanner.close();
		switch(input) {
		case "Y":
			System.out.println("진행합니다.");
			break;
		case "N":
			System.out.println("종료합니다.");
			break;
		default : 
			System.out.println("잘못된 입력입니다.");
		}
		
	}

}


