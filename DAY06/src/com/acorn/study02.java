package com.acorn;

import java.util.Scanner;

public class study02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("1월 부터 12월 사이의 정수를 입력하시오(숫자만 입력하시오) :");
		int season = sc.nextInt();
				
		switch(season) {
			case 11: 
			case 12: 
			case 1: 
			case 2:			
				System.out.println(season + "월은 겨울 입니다.");
				break;
			case 3:
			case 4: 
				System.out.println(season + "월은 봄 입니다.");
			    break;
			case 5:
			case 6:
			case 7:
			case 8: 
				System.out.println(season + "월은 여름 입니다.");
				break;
			case 9:
			case 10:
				System.out.println(season + "월은 가을 입니다.");
				break;
			default:
				System.out.println("잘못된 정수입니다");
	            break;
		}
		  sc.close();
	
	}

}
