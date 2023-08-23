package study.maintoclass;

import java.util.Scanner;

import study.maintosub1.Add;
import study.maintosub1.Div;
import study.maintosub1.Mul;
import study.maintosub1.Sub;

public class Main03 {

	public static void main(String[] args) {
		// 필드 영역
		Scanner sc = new Scanner(System.in);
		String sInputMsg01 = "첫번째수:>>> "; 
		String sInputMsg02 = "두번째수:>>> ";
		
		// 문자열 입력 변수
		String sAddFirstNum; String sAddSecondNum; 
		// 문자열 정수/실수 변환 변수
		int iAddResultValue01 = 0; double dAddResultValue01 = 0.0;

		// 동적 객체 선언 및 생성
		Add add = new Add();
		
		// 키보드 입력(정수, 정수)
		System.out.print(sInputMsg01); sAddFirstNum = sc.nextLine();
		System.out.print(sInputMsg02); sAddSecondNum = sc.nextLine();
		// 동적 더하기 메소드(정수, 정수) 호출
		iAddResultValue01 = add.addOperation(Integer.parseInt(sAddFirstNum), 
				Integer.parseInt(sAddSecondNum));
		System.out.println(iAddResultValue01);
		
		// 키보드 입력(실수, 실수)
		System.out.print(sInputMsg01); sAddFirstNum = sc.nextLine();
		System.out.print(sInputMsg02); sAddSecondNum = sc.nextLine();
		// 동적 더하기 메소드(실수, 실수) 호출
		dAddResultValue01 = add.addOperation(Double.parseDouble(sAddFirstNum), 
				Double.parseDouble(sAddSecondNum));
		System.out.println(dAddResultValue01);
			
		sc.close();
	}

}
