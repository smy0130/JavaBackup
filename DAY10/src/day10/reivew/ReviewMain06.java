package day10.reivew;

import java.util.Scanner;

public class ReviewMain06 {

	public static void main(String[] args) {
		// 배열: 같은 타입의 요소값을 저장하는 변수
		// 하나이상의 요소값을 하나의 변수로 저장
		// 문법: 위치값: 0~배열사이즈-1
		// 선언: 데이터타입[] 배열변수명;
		// 초기화: 배열변수 = new 데이터타입[사이즈];->사이즈 > 0
		// 값을 대입: 배열변수명[위치값] = 값(변수);
		// 값을 추출: int iArrValue = 배열변수명[위치값];
		
		// 키보드에서 생성하고자 하는 
		Scanner sc = new Scanner(System.in);
		// 배열 사이즈를 받아 배열 생성 - 정수
		System.out.print("배열사이즈:>>> ");
		int iArrSize = sc.nextInt();
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
