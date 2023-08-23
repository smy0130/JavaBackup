package com.acorn;

import java.util.Scanner;

public class Study06 {
	
	public static void main(String[] args) {
		
		 Scanner scanner = new Scanner(System.in);
		 
		 System.out.print("정수를 입력해 주세요. : ");
		 int number = scanner.nextInt();
		 if (number > 0)  {
			 System.out.println("양수다");
		 } 
		 else if (number < 0){
			 System.out.println("음수다");
		 }
		 else {
			 System.out.println("0이다");
		 }
		 scanner.close();
 }
}
//키보드로 입력 받은 하나의 정수가 양수이면 "양수다",양수가 아니면 
//"양수가 아니다"를 출력하세요.