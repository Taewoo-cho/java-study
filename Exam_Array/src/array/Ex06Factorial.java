package array;

import java.util.Scanner;

public class Ex06Factorial {
	public static void main(String[] args) {
		System.out.print("팩토리얼 구하기 : ");
		
		// 입력값 받기 
		Scanner scanner = new Scanner(System.in);
		int number = scanner.nextInt();
		scanner.close();
		
		// 결과 출력
		for(int i=1;i<=number; i++) {
			printFactorial(i);
		}
		
	}

	// 정수 n값을 받아 n!의 결과를 출력
	private static void printFactorial(int num) {
		
		int result = 1;
		System.out.print(num + "! = ");
		
		for(int i=num; i>=1; i-- ) {
			System.out.print(i); 
			if(i!=1) {
				System.out.print("x");
			}
			result *= i;
		}
		
		System.out.println(" = " + result);
	}
}
