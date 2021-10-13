package application;

import java.util.Scanner;

public class IfElse {

	public static void main(String[] args) {
		// If else문
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("사과의 갯수는 ? ");
		int apples = scanner.nextInt();
		
		System.out.print("바나나의 갯수는 ? ");
		int bananas = scanner.nextInt();
		
		scanner.close(); // 쓰고나면 닫아줘야함
		
		if(apples > bananas) {
			System.out.println("사과가 바나나보다 많음");
		}
		else { // if 문이 false 일때 실행
			System.out.println("바나나가 사과보다 많음");
		}
		
		System.out.println("프로그램 종료.");
		
	}

}