package com.acorn.practice1;

import java.util.Scanner;

public class Run3 {

	public static void main(String[] args) {
		
		// 메소드 명 : public void practice3(){}
		// 모든 사람이 사탕을 골고루 나눠가지려고 한다. 인원 수와 사탕 개수를 키보드로 입력 받고
		// 1인당 동일하게 나눠가진 사탕 개수와 나눠주고 남은 사탕의 개수를 출력하세요.
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("인원 수 : ");
		int p = sc.nextInt();
		System.out.print("사탕 개수 : ");
		int c = sc.nextInt();
		
		practice3(p, c);
		
	}
	
	public static void practice3(int p, int c) {
		System.out.println("1인당 사탕 개수 : " + (c/p));
		System.out.println("남는 사탕 개수 : " + (c%p));
	}
}
