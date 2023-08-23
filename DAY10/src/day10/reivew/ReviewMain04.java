package day10.reivew;

import java.util.Scanner;

public class ReviewMain04 {
	public static void main(String[] args) {
		// 입력된 네 개의 수가 있습니다.
		Scanner sc = new Scanner(System.in);
		// 두 개는 실수, 두 개는 정수
		int iType = 1; // 1:정수로, 2: 실수로
		//함수명A(sc, 어떤값1, 어떤값2);  // 함수명A(1)
		keyInputProcess(sc, iType);  // 함수 호출
		// 세 개 중 하나라도 5보다 작은 수가 출력

	}
	
	//  키 입력 처리 함수
	public static void keyInputProcess(
			Scanner sc, int iType)  // 함수 선언
	{
		// 함수 정의
		if(iType == 1) {
			System.out.print("정수:>>> ");
			System.out.println(sc.nextInt());
		} else if(iType == 2) {
			System.out.print("실수:>>> ");
			System.out.println(sc.nextDouble());
		} else {
			System.out.println("정해진 타입 아님");
		}
	}
}
