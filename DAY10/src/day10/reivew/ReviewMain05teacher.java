package day10.reivew;

import java.util.Scanner;

public class ReviewMain05teacher {

	public static void main(String[] args) {
		// 입력된 네 개의 수가 있습니다.
		Scanner sc = new Scanner(System.in);
		// 두 개는 실수, 두 개는 정수
		//함수명A(sc, 어떤값1, 어떤값2);  // 함수명A(1)
		int iRetNum01 = keyInputProcess(sc);  // 함수 호출
		int iRetNum02 = keyInputProcess(sc);  // 함수 호출
		
		compareNum(iRetNum01, iRetNum02);
		// 세 개 중 하나라도 5보다 작은 수가 출력
		
	}
	
	//  키 입력 처리 함수	
	public static int keyInputProcess(
			Scanner sc)  // 함수 선언
	{
		// 함수 정의
		int iInputValue;  
		System.out.print("정수:>>> ");
		iInputValue = sc.nextInt();	
		
		return iInputValue;
	}
	
	// 비교 처리 함수
	public static void compareNum(int iRetNum01, int iRetNum02)
	{
		if(iRetNum01 < 5) {
			System.out.println(iRetNum01 + "은 5보다 작습니다.");
		} else if(iRetNum02 < 5) {
			System.out.println(iRetNum02 + "은 5보다 작습니다.");
		} else if(iRetNum01 == 5) {
			System.out.println(iRetNum01 + "은 5와 같습니다.");
		} else if(iRetNum02 == 5) {
			System.out.println(iRetNum02 + "은 5와 같습니다.");
		}
	}

}
