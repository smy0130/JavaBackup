package day10.reivew;

import java.util.Scanner;

public class ReviewMain02 {

	public static void main(String[] args) {
		 Scanner sc = new Scanner(System.in);
		// 입력된 네 개의 수가 있습니다.
		// 두개는 실수, 두개는 정수
		int a = 0;
		int b = 0;
		double c = 0;
		double d = 0;
		
				
		// 세 수를 검사해서 5보다 작은 수를 출력
		System.out.println("정수를 입력하세요: ");
		a = sc.nextInt();
		if(a<5) {System.out.println("정수입니다.");
		}else {System.out.println("5보다 큽니다");
		}
		System.out.println("정수를 입력하세요: ");
		b = sc.nextInt();
		if(b<5) {System.out.println("정수입니다.");
		}else {System.out.println("5보다 큽니다");
		}		
		System.out.println("실수를 입력하세요: ");
		c = sc.nextDouble();
		if(c<5) {System.out.println("실수입니다.");
		}else {System.out.println("5보다 큽니다");
		}
		System.out.println("실수를 입력하세요: ");
		d = sc.nextDouble();
		if(d<5) {System.out.println("실수입니다.");
		}else {System.out.println("5보다 큽니다");
		}
		sc.close();
	}
}
