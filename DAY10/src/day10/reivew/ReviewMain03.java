package day10.reivew;

import java.util.Scanner;

public class ReviewMain03 {

	public static void main(String[] args) {
		// 입력된 네 개의 수가 있습니다.
		Scanner sc = new Scanner(System.in);
		// 두 개는 실수, 두개는 정수
		int iA, iB, iC;
		System.out.println("정수 3개를 입력:>>> ");
		iA = sc.nextInt();		
		iB = sc.nextInt();
		iC = sc.nextInt();
		

		// 세 개 중 하나라도 5보다 작은 수가 출력 
//	if (iA < 5) {
//            System.out.println(iA + "는 5보다 작습니다");
//        } else {
//            System.out.println(iA + "는 5보다 큽니다");
//        }
//
//       if (iB < 5) {
//           System.out.println(iB + "는 5보다 작습니다");
//        } else {
//           System.out.println(iB + "는 5보다 큽니다");
//       }
//
//        if (iC < 5) {
//            System.out.println(iC + "는 5보다 작습니다");
//       } else {
//            System.out.println(iC + "는 5보다 큽니다");
//        }
	
        if (iA < 5 || iB < 5 || iC < 5) {
        	 if(iA < 5) {System.out.println(" 5보다 작은수 ");}
        	 if(iB < 5) {System.out.println(" 5보다 작은수 ");}
        	 if(iC < 5) {System.out.println(" 5보다 작은수 ");} 
        	 
        	 
        } else {
        	System.out.println(" 정답을 알려주 ");
        }
        
        
        sc.close();
        
        
        	 
        	 }
}
