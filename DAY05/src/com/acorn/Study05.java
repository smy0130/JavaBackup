package com.acorn;

import java.util.Scanner;

public class Study05 {

	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("정수를 입력해주세요 : ");
		 int number = scanner.nextInt();
		 if (number % 2 == 0 && number != 0 ) {
	            System.out.println("짝수다");
	        } 
		 else if (number % 1== 0 && number != 0 ) {
	            System.out.println("홀수다");
	        } 
		 else 
		 	{
	            System.out.println("0이다");
	        }

	        scanner.close();
		
	}

}	
//키보드로 입력 받은 하나의 정수가 짝수이면 "짝수다", 짝수가 아니면 "홀수다",
//를 출력하세요
