package com.acorn;

import java.util.Scanner;

public class Study10 {

	public static void main(String[] args) {
		// 0. 입력값 저장 : 데이터 저장 -> 변수선언 데이터타입(int) 변수명 (iMenuNum)
		// 1. 메뉴를 출력하고		
		//  1.1 입력 출력 : System.out.println()	
		//  1.2 수정 출력
		//  1.3 조회 출력
		// 	1.4 삭제 출력
		//  1.5 종료 출력
		//  1.6 메뉴 번호를 입력하세요 :System.out.print()
		System.out.println("1. 입력");
		System.out.println("2. 수정");
		System.out.println("3. 조회");
		System.out.println("4. 삭제");
		System.out.println("5. 종료");
		System.out.print("6. 메뉴 번호를 입력하세요:>>>");
		//1. 메뉴선택 - Scanner
		Scanner sc = new Scanner(System.in);
		int iUserInputValue = sc.nextInt();
		//  1.1 1번을 누르면,
		//		가. 조건식(iMenuNum ==1 )
		//		나. 실행문자 : "입력메뉴입니다"를 출력,		
		//  1.2 2번을 누르면, "수정메뉴입니다"를 출력,
		//  1.3 3번을 누르면, "조회메뉴입니다"를 출력,
		// 	1.4 4번을 누르면, "삭제메뉴입니다"를 출력,
		//  1.5 7번을 누르면, "프로그램이 종료됩니다."를 출력,
		System.out.println("");
		if(iUserInputValue == 1) {
			System.out.println("입력메뉴입니다");
		} else if(iUserInputValue == 2) {
			System.out.println("수정메뉴입니다");
		}else if(iUserInputValue == 3) {
			System.out.println("조회메뉴입니다");
		}else if(iUserInputValue == 4) {
			System.out.println("삭제메뉴 입니다.");
		}else if(iUserInputValue == 5) {
			System.out.println("프로그램이 종료 됩니다.");
		} else {
			System.out.println("실행할 수 없는 메뉴 입니다.");
		}
		
		
		sc.close();

	
	}
}
