package application;

import java.util.Scanner;

public class CheckPointLimit {

	public static void main(String[] args) {
		// 패스워드가 틀리더라도 3번 기회를 준다.
		// 패스워드가 맞으면 접속승인 출력 후 반복문을 빠져나옴
		// 패스워드가 3회 틀릴시 접속 거부

		final String USER_PASSWORD = "hello";
		
		Scanner scanner = new Scanner(System.in);
		
		boolean accessOK = false; // 플래그: 불린변수로 상태에 따라 처리
		
		int count=3;
		String input;
		
		for(int i=0; i<3; i++) {
			System.out.print("비밀번호를 입력하시오(남은횟수 : " + count-- + " ) : ");
			input = scanner.nextLine();
			if(USER_PASSWORD.equals(input)) {
				accessOK = true;
				System.out.println("접속승인");
				break;
			}
		}
		
		scanner.close();
		if(!accessOK) {
			System.out.println("접속거부");
		}
	}

}
