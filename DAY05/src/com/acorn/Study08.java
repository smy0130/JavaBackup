package com.acorn;

import java.util.Scanner;

public class Study08 {

	public static void main(String[] args) {
		// 1. 키보드로: Scanner 객체 변수 선언과 초기화
		 Scanner scanner = new Scanner(System.in);
		// 2. 변수 두 개를 선언하고 (초기화)
		 int num1 = 0; int num2 = 0;
		// 2. 정수(데이터 타입) 두 개를 입력 받아 : 변수 저장 
		 System.out.print("정수1를 입력하세요 : ");
		 num1 = scanner.nextInt();
		 System.out.print("정수2를 입력하세요 : ");
		 num2 = scanner.nextInt();
		 
		 scanner.nextLine(); 
		// 3. 3-1 두 수의 합: 산출 연산자
		 int sum = num1 + num2;		 
		 System.out.println("두 수의 합은 :"  + sum);
		// 3. 3-2 두 수의 차: 산술 연산자
		 int m = num1 - num2;		 
		 System.out.println("두 수의 차는 :"  + m);
		// 3. 3-3 두 수의 곱: 산술 연산자
		 int d = num1 * num2;		 
		 System.out.println("두 수의 곱은 :"  + d);
		// 3. 3-4 두 수의 나누기: 산술 연산자
		 int a = num1 / num2;		 
		 System.out.println("두 수의 나누기는 :"  + a);
		// 3. 3-4-1 나머지(%)
		 int c = num1 % num2;
		 System.out.println("이 수의 나머지는 : " + c);
		// 4. 출력
		 scanner.close();

	}

}
