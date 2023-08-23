package com.acorn.practice1;

import java.util.Scanner;

public class Run4 {

	public static void main(String[] args) {
	
		// 영어 문자열 값을 키보드로 입력 받아 문자에서 앞에서 세 개를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("문자열을 입력하세요 : ");
		String s = sc.next();
		
		System.out.println("첫 번째 문자 : " + s.substring(0, 1));
		System.out.println("두 번째 문자 : " + s.substring(1, 2));
		System.out.println("세 번째 문자 : " + s.substring(2, 3));

	}
	
}
