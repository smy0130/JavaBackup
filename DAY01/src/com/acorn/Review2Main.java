package com.acorn;

public class Review2Main {
	
	public static void main(String[] args) {
		// 연산자
		// 할당연산자: =
		// 산술연산자: +, -, *, /, %(나머지)
		// 복합 할당 연산자: +=, -=, /=, %=
		// 증감연산자: ++, --
		// 비교연산자: ==, !=, >=, <, <=
		// 논리연산자: &&, ||, !
		
		// 변수 정수(int)
		
		int num = 2;
		if(num % 2 == 0)
		{
			System.out.println("짝수");
		}
		else
		{
			System.out.println("홀수");
		}
		
		if(num > 0)
		{
			System.out.println("양수");
		}
		else if(num < 0)
		{
			System.out.println("음수");
		}
		else
		{
			System.out.println("0입니다.");
		}
	}
}
