package com.acorn;

// 가변인자 처리
public class MethodMain07 {

	public static void main(String[] args) {
		System.out.println("main함수 아큐먼트 처리 프로그램");
		System.out.println("arguments 갯수:" + args.length);
		for(String x : args) {
			System.out.println(x);
		}
	}
}