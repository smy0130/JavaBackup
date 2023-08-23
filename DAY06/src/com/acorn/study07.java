package com.acorn;

import java.util.Scanner;

public class study07 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		int iInputValue = 0;
		int breakFlag = 0;
		while(true) {
			// 입력된 값
			System.out.println("정수입력:>>>");
			iInputValue = sc.nextInt();
			//조건 체크
			//조건2(예외사항) continue;
			if(iInputValue < 1) { //예외사항 발생
				continue;
			}else {
				for(int i = 0; i < iInputValue; i++) {					
					System.out.println((i + 1)+ " ");					
				}
				System.out.println();
				breakFlag = 1;
			}
			 if(breakFlag == 1) break;
		}
		sc.close();
	}

}
