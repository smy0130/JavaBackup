package com.acorn.practice1;

import java.util.Scanner;

public class Run2 {

	public static void main(String[] args) {
		// 키보드로 정수 두 개를 입력 받아 두 수의 합, 차, 곱, 나누기 한 몫을 출력하세요.

		Scanner sc = new Scanner(System.in);

//		System.out.print("첫 번째 정수 : ");
//		int num1 = sc.nextInt();
//		
//		System.out.print("두 번째 정수 : ");
//		int num2 = sc.nextInt();
//		
//		System.out.println("더하기 결과 : " + (num1 + num2));
//		System.out.println("빼기 결과 : " + (num1 - num2));
//		System.out.println("곱하기 결과 : " + (num1 * num2));
//		System.out.println("나누기 결과 : " + (num1 / num2));

		int selectedBtn1 = 0;
		int selectedBtn2 = 0;

		int userInputValue1 = 0;
		int userInputValue2 = 0;

		while (true) {

			System.out.println("=== menu ===");
			System.out.println("1. ADD");
			System.out.println("2. SUBSTRACT");
			System.out.println("3. MULTIPLY");
			System.out.println("4. DIVIDE");
			System.out.println("99. EXIT");
			System.out.println("원하는 기능을 선택하세요 >> ");

			selectedBtn1 = sc.nextInt();

			if (selectedBtn1 == 99)
				break;
			else if ((selectedBtn1 < 1) || (selectedBtn1 > 4)) {
				System.out.println("잘못된 선택입니다.");
				continue;
			}

			System.out.println("=== type menu ===");
			System.out.println("1. 정수");
			System.out.println("2. 실수");
			System.out.println("99. 뒤로");
			System.out.println("원하는 기능을 선택하세요 >> ");

			selectedBtn2 = sc.nextInt();

			if (selectedBtn2 == 99)
				continue;
			else if ((selectedBtn1 < 1) || (selectedBtn1 > 2)) {
				System.out.println("잘못된 선택입니다.");
				continue;
			}
			System.out.println("첫 번째 수 입력 : ");
			userInputValue1 = sc.nextInt();
			System.out.println("두 번째 수 입력 : ");
			userInputValue2 = sc.nextInt();

		}
		sc.close();
	}
}
