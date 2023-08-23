package com.acorn;

import java.util.Scanner;

public class Study03 {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("계산기 프로그램");
			System.out.println("<< menu >>");
			System.out.println("1. 더하기");
			System.out.println("2. 빼기");
			System.out.println("3. 곱하기");
			System.out.println("4. 나누기");
			System.out.println("(종료 : 99) >>");
			int option = sc.nextInt();
			
			if(option == 99) {
				System.out.print("프로그램 종료");
				System.exit(0);
			}
			else {
				System.out.print("첫 번째 수 >> ");
				int num1 = sc.nextInt();
				System.out.print("두 번째 수 >> ");
				int num2 = sc.nextInt();
				
				switch(option) {
				case 1:
					System.out.println(num1 + num2);
					break;
				case 2:
					System.out.println(num1 - num2);
					break;
				case 3:
					System.out.println(num1 * num2);
					break;
				case 4:
					System.out.println(num1 / num2);
					break;
				}
			}
			
			System.out.println();
		}
	}
	
}
