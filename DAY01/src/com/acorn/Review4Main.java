package com.acorn;

public class Review4Main {
	
	public static void main(String[] args) {
		// 반복문
		// for(초기값;조건식;증감값)
		
		for(int i = 1; i <= 10; i++)
		{
			// 실행문
			System.out.print(i + "번째: ");
			if(i%2 == 0)
			{
				System.out.println("짝수");
			}
			else
			{
				System.out.println("홀수");
			}
		}
		
		for(int i = 20; i>0; i--)
		{
			
		}
		
		// 배열(array): 하나의 변수 이름에 같은 타입의 값들 여러 개를 저장하기 위한 데이터타입
		String[] names = {"K1", "K2", "K3", "K4", "K5"};
		System.out.println("세번째요소: " + names[2]);
		System.out.println("다섯번째요소 " + names[4]);
		for(int i = 0; i<names.length; i++)
		{
			System.out.println((i+1) + "번째 : " + names[i]);
		}
	}
}
