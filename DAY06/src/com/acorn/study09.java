package com.acorn;

public class study09 {

	public static void main(String[] args) {
		int[] arr = new int[10];
		
		for(int i = 9,  j = 0; i >= 0; i--, j++) {
			arr[j] = i+1;	
		}
		for(int i = 0; i < 10; i++) {
		System.out.print(arr[i] + " ");
		}
		
	}
}
