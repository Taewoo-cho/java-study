package application;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);

		System.out.println("메뉴 ");
		System.out.println("====\n");
		System.out.println("1. 프린트 '헬로우'");
		System.out.println("2. 프린트 '안녕'");
		System.out.println("3. 프로그램 종료");
		for (;;) {

			System.out.print("옵션을 선택 > ");
			int opt = scanner.nextInt();

			if (opt == 1) {
				System.out.println("헬로우");
			} else if (opt == 2) {
				System.out.println("안녕");
			} else if (opt == 10000) {
				System.out.println("이스터에그를 발견하였습니다!");
			} else if (opt == 3) {
				System.out.print("프로그램 종료");
				break;
			} else {
				System.out.println("다시 입력하세요.");
			}
		}
		scanner.close();
		System.out.println("...\n");
	}

}
