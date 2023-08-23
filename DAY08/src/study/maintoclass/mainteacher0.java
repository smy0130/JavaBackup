package study.maintoclass;

import java.util.Scanner;

public class mainteacher0 {
	public static void main(String[] args) {
		// 필드 영역
		// 개체 부분
		Scanner sc = new Scanner(System.in);
		// 공통 부분
		String sInputMsg01 = "첫번째수를 입력하세요:>>> ";
		String sInputMsg02 = "두번째수를 입력하세요:>>> ";
		String sResultMsg = "결과값";
		
		// 결과 저장 부분
		
		// 더하기 부분
		int iAddResultValue = 0;
		int iAddFirstNum;
		int iAddSecondNum;
		
		// 뺴기 부분
		int iSubResultValue = 0;
		int iSubFirstNum;
		int iSubSecondNum;
		
		// 곱하기 부분
		int iMulResultValue = 0;
		int iMulFirstNum;
		int iMulSecondNum;
		
		// 나누기 부분
		int iDivResultValue = 0;		
		int iDivFirstNum;
		int iDivSecondNum;
		
		// 오퍼레이션 영역		
		// 더하기 부분
			// 연산 대상 값 할당: 직접 or 키보드입력
			System.out.print(sInputMsg01);
			iAddFirstNum = sc.nextInt();
			System.out.print(sInputMsg02);
			iAddSecondNum = sc.nextInt();
			// + 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1+변수2)
			iAddResultValue = iAddFirstNum + iAddSecondNum;
			System.out.println(sResultMsg +"은 "+iAddResultValue);
			// 제약 조건: 값의 범위
		// 뺴기 부분
			// 연산 대상 값 할당: 직접 or 키보드입력
			System.out.print(sInputMsg01);
			iSubFirstNum = sc.nextInt();
			System.out.print(sInputMsg02);
			iSubSecondNum = sc.nextInt();
			// - 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1-변수2)
			iSubResultValue = iSubFirstNum - iSubSecondNum;
			System.out.println(sResultMsg +"은 "+iSubResultValue);
			// 제약 조건: 값의 범위
		// 곱하기 부분
			// 연산 대상 값 할당: 직접 or 키보드입력
			System.out.print(sInputMsg01);
			iMulFirstNum = sc.nextInt();
			System.out.print(sInputMsg02);
			iMulSecondNum = sc.nextInt();
			// * 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1*변수2)
			iMulResultValue = iMulFirstNum * iMulSecondNum;
			System.out.println(sResultMsg +"은 "+iMulResultValue);
			// 제약 조건:  - 결과 불가
		// 나누기 부분
			// 연산 대상 값 할당: 직접 or 키보드입력
			System.out.print(sInputMsg01);
			iDivFirstNum = sc.nextInt();
			System.out.print(sInputMsg02);
			iDivSecondNum = sc.nextInt();
			
			// 제약조건: 예외 처리
			if(iDivFirstNum == 0) { iDivResultValue = 0; System.out.println("분자가 0이므로 연산결과 0임");}
			else if(iDivSecondNum == 0) { iDivResultValue = 0; System.out.println("분모가 0이므로 연산불가"); }
			// / 연산: 결과값 할당연산자 좌항 연산자 우항(example:변수3=변수1/변수2)
			{ iDivResultValue = iDivFirstNum / iDivSecondNum; }
			System.out.println(sResultMsg +"은 "+ iDivResultValue);

		sc.close();
	}


}
