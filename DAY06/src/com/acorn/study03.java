package com.acorn;

import java.util.Scanner;

public class study03 {

	public static void main(String[] args) {
		// 1. 키보드: Scanner 객체 생성
		Scanner sc = new Scanner(System.in);
		// 2. 입력 받은
		int iInputValue = 0;
		//	2.1 정수 : 데이터 - 변수
		System.out.print("정수를 입력하세요: ");
		iInputValue = sc.nextInt();
		// 3.입력한 수를 체크
		// 3.1 양수가 아니면
		//	 3.1.1 "양수만 입력해주세요."를 출력
		if(iInputValue <= 0) {
			System.out.println("양수만 입력해주세요.");
		}
		//   3.2 양수면
		else {
		//	 3.2.1 짝수면
			  if((iInputValue % 2) ==0) {
		//	 	3.2.1.1 "짝수다" 출력하고: 출력
				  System.out.println("짝수다.");
			  } else if((iInputValue % 2) !=0) {
		//   3.2.2 홀수면
		//		3.2.2.1 "홀수다"를 출력하세요.
				  System.out.println("홀수다.");
			  }
		}
		
		sc.close();
	}

}

