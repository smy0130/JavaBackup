package day10.reivew;

import java.util.Scanner;

public class ReviewMain07 {

	public static void main(String[] args) {
		// 키보드를 생성하고자 하는
		Scanner sc = new Scanner(System.in);
		// 배열 사이즈 받아 배열 생성 - 정수
		System.out.println("배열사이즈:>>>>");
		int iArrSize = sc.nextInt();
		dynamicMakeArr(sc,iArrSize);
		
		sc.close();
	}

	private static void dynamicMakeArr(Scanner sc, int iArrSize) {
		int[] iArr  = new int[iArrSize]; 
		// 배열의 가운데 위치에 키보드 입력받은
		
		if(iArrSize > 3 && (iArrSize % 2 == 1 )) {
			int halfIdx = iArrSize / 2;
			System.out.print("입력배열값:>>> ");
			int iValue = sc.nextInt();
			// 값을 저장
			iArr[halfIdx] = iValue;
			// 입력한 값을 출력
			System.out.println(iArr[halfIdx-1] + ":" + iArr[halfIdx] + ":" + iArr[halfIdx+1]);
			
		} else {
			System.out.println("crtl  + f11을 누르세요");
			
		}
	
		sc.close();
	
	

	
	}
}
