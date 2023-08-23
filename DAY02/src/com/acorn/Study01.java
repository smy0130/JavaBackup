package com.acorn;

public class Study01 {
	public static void main(String[] args) {

//		// 변수 선언(초기화)
//		byte bNumber = 0;
//		short sNumber = 0;
//		int iNumber = 0;
//		sNumber = (short)iNumber;
//		long lNumber = 0L;
////		float fNumber = 0.0;
//		float fnumber = 0.0F;
//		char cChar = 'c';
//		String str = "str";
//		
//		// 특수 변수
//		byte[] bNumberArr = {1, 2, 3, 4, 5};
//		
//		// 조건문: if/switch-case
//		// 1~10
		
		
		int[] iNumberArr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int iIndex = 0;
		
		if(iNumberArr[iIndex] % 2 == 0) {
			System.out.println("짝수");
			System.out.println("2의 배수");
		}
		else if (iNumberArr[iIndex] % 3 == 0){

		}
		else {
			
		}
		iIndex++;
		
		
		
		// 반복문: for
		for(int i = 2; i <= 9; i++) {
			System.out.println(i + "단");
			for(int j = 1; j  <= 9; j++) {
				System.out.println(i + " x " + j + " = " + (i*j));
			}
			System.out.println("");
		}
		
		
		for(int i = 0; i <= 5; i++) {
			for(int j = 0; j < i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		
		int[] iEvenOddCountArr = {0, 0};
		
		int iWhileValue = 1;
		while(iWhileValue <= 30) {
//			System.out.println(iWhileValue);
			
			if(iWhileValue % 2 == 0)
				iEvenOddCountArr[0]++;
			else
				iEvenOddCountArr[1]++;
			
			
			iWhileValue++;
		}
		System.out.println("짝수 개수 : " + iEvenOddCountArr[0] + "개");
		System.out.println("홀수 개수 : " + iEvenOddCountArr[1] + "개");
	}
}
