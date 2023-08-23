package day10.reivew;

import java.util.Scanner;

public class ReviewMain09 {
	public static void main(String[] args) {
		
		//키보드에서 생성하고자 하는
		Scanner sc = new Scanner(System.in);
		//배열 사이즈를 받아 배열 생성 - 정수
		System.out.println("배열사이즈:>>>>");
		int iArrSize = sc.nextInt();
		int [] iArr01 = new int[iArrSize];
		int [] iArr02 = new int[iArrSize];
		System.out.println("배열값:>>>");
		int iValue = sc.nextInt();
		// iArr02를 반복문 이용해 짝수 인덱스 값을 저장
		for(int iArr01 % 2 == 0;) {
			
		}
		dynamicMakeArr(iArr01, iArr02);
		
		sc.close();
		
	}

	private static void dynamicMakeArr(int[] iArr01, int[] iArr02) {
		
		   for (int i = 0; i < iArr02.length; i+=2) {
	        	 iArr01[i] = iArr02[i];
	            
	        }
	        
	        // iArr02 -> iArr01: 엇갈린 위치 (짝수 -> 홀수)
	       
	        for (int i = 0; i < iArr02.length; i+=2) {
	         
	                iArr01[oddIndex] = iArr02[i];
	                
	            
	        }
	        
	     
	}
}

