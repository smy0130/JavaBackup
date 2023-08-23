package com.acorn;

public class Review3Main {
	public enum Weekday {
		Mon, TUE, WED, THU, FRI, SAT, SUN;
	}

	public static void main(String[] args) {
		// switch-case
		// 해당 case로 break를 만날 때까지 실행
		// 사용가능한 변수: 정수, 문자, 문자열
		String day = "수";
		switch (day) {
		case "월":
			System.out.println("주중1");
			break;
		case "화":
			System.out.println("주중2");
			break;
		case "수":
			System.out.println("주중3");
			break;
		case "목":
			System.out.println("주중4");
			break;
		case "금":
			System.out.println("주중5");
			break;
		default:
			System.out.println("주말");
			break;
		}
	
		Weekday eday = Weekday.SAT;
		switch (eday) 
		{
		case Mon:
			System.out.println("주중1");
			break;
		case TUE:
			System.out.println("주중2");
			break;
		case WED:
			System.out.println("주중3");
			break;
		case THU:
			System.out.println("주중4");
			break;
		case FRI:
			System.out.println("주중5");
			break;
		default:
			System.out.println("주말");
			break;
		}
	}
}

