package day10.reivew;

import java.util.Scanner;

	// 반복문
	// for(초기값; 조건식; 증감값) {
//		반복적으로 실행할 명령문;
	//}
	public class ReviewMain08 {

		public static void main(String[] args) {
		
			// 키보드에서 생성하고자 하는 
			Scanner sc = new Scanner(System.in);
			// 배열 사이즈를 받아 배열 생성 - 정수
			System.out.print("배열사이즈:>>> ");
			int iArrSize = sc.nextInt();
			dynamicMakeArr(sc, iArrSize);
			
			sc.close();

		}
		
		public static void dynamicMakeArr(Scanner sc, int iArrSize) {
			int[] iArr  = new int[iArrSize]; 
			// 배열의 가운데 위치에 키보드 입력받은
			int halfIdx = iArrSize / 2;
			System.out.print("입력배열값:>>> ");
			int iValue = sc.nextInt();
			// 값을 저장
			iArr[halfIdx] = iValue;	
		}
		
 

	}