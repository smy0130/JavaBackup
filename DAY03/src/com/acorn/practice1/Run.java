package com.acorn.practice1;

import java.util.Scanner;

public class Run {

	public static void main(String[] args) {
		// 이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("이름을 입력하세요 : ");
		String name = sc.next();
		
		System.out.print("성별을 입력하세요(남/여) : ");
		String sex = sc.next();
		
		System.out.print("나이를 입력하세요 : ");
		String age = sc.next();
		
		System.out.print("키(cm)를 입력하세요 : ");
		String height = sc.next();

		System.out.println("키 " + height + "cm인 " + age + "살 " + sex + "자 " + name + "님 반갑습니다 ^^");
		
		sc.close();
		
	}

}
