package com.acorn;

public class Main03 {

	public static void main(String[] args) {
		// 클래스 개체 선언 == 변수 선언
		Calc calc = new Calc();
		int[] iArrValue1 = {10, 20, 30, 40, 50};
		Calc.printArray(iArrValue1);
		int iStartNum = 5; int iEndNum = 20;
		Calc.printAcumVal(iStartNum, iEndNum);
		// 5. 계산기: +, -, *, /
		int iRet01 = 0; int iRet02 = 0; int iRet03 = 0; double dRet04 = 0;
		int iFirstVal = 15; int iSecondVal = 35;
		iRet01 = calc.add(iFirstVal, iSecondVal); 
		iRet02 = calc.sub(iFirstVal, iSecondVal); 
		iRet03 = calc.mul(iFirstVal, iSecondVal); 
		dRet04 = calc.div(iFirstVal, iSecondVal); 
		System.out.println("===========================");
		System.out.println(iRet01 + ":" + iRet02 + ":" + iRet03 + ":" + dRet04); 	
		
		// 7. 클래스
		//  7.1 데이터 타입
		// public class 클래스명 {
		//}
		// 7.2 클래스 구성 요소: 필드(변수)영역, 생성자영역(기본생성자/인자있는생성자), 
		// 메소드 영역(Getters/Setters, 정적, 동적)
		
	}
	

}




