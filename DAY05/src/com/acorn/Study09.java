package com.acorn;

import java.util.Scanner;

public class Study09 {
	public static void main(String[] args) {
		// 키보드로 입력 받은 값들을 - Scanner
		Scanner scanner = new Scanner(System.in);
		// 변수에 기록하고 - 변수	
		String gender; //(String gender; <- 이것도 가능)		
		// 성별이 'M' 이면 남학생, 'M'이 아니면 여학생으로 - 조건문 if ~ else		
		do {
		System.out.print("성별을 선택해주세요 M/F : ");
		 gender = scanner.nextLine();
		}while (!gender.equalsIgnoreCase("M") && !gender.equalsIgnoreCase("F"));
		// 출력 - 저장된 변수 값 - System.out.println(값)
		
		if(gender.equals("M")) {
			 System.out.println("남자다");
		}
		else {
			System.out.println("여자다");
		}
		 scanner.close();
	}
}
