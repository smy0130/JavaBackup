package day10.reivew;

import java.util.Scanner;

public class ReviewMain05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//  두 개는 실수, 두 개는 정수
		// 함수명 A(sc, 어떤값1, 어떤값2); // 함수명A(1)
		int iRetNum01 = keyInputProcess(sc); //함수 호출
		int iRetNum02 = keyInputProcess(sc); //함수 호출
		
		compareNum(iRetNum01, iRetNum02);
		// 세 개 중 하나라도 5보다 작은 수가 출력

	}

	//키 입력 처리함수 
	public static int keyInputProcess(
			Scanner sc) // 함수 선언
	{
		// 함수 정의
		int iInputValue;
		System.out.println("정수:>>>");
		iInputValue = sc.nextInt();
		
		return iInputValue;
	}
	
	//비교 처리 함수 
	public static void compareNum(int iRetNum01, int iRetNum02)
	{
		if(iRetNum01 <5 || iRetNum02 < 5) {
			if(iRetNum01 < 5) {System.out.println(iRetNum01 + " 는5보다 작습니다");}
			if(iRetNum02 < 5) {System.out.println(iRetNum02 + " 는5보다 작습니다");}
		}else {
			System.out.println("틀렸습니다");
		}
	}
}
