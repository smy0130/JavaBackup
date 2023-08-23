package com.acorn;

import java.util.Scanner;

public class study06 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("마지막 숫자를 입력해주세요:>>>");
		int iInputValue = sc.nextInt();
		if(iInputValue >= 1) {
			for(int i = 0; i < iInputValue ; i++) {
				if((iInputValue-i)==1)System.out.print(iInputValue-i);
				else{System.out.print((iInputValue-i)+ " ");}
			}
		} else {
			System.out.println("1 이상의 숫자를 입력해주세요.");
		}
		
		sc.close();
	}

}