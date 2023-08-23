package com.acorn;

import java.util.Scanner;

public class Study04 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("성별을 입력하세요 (남/여) : ");
        String gender = scanner.nextLine();

        System.out.print("나이를 입력하세요 : ");
        String age = scanner.nextLine();

        System.out.print("키를 입력하세요 (cm) : ");
        int height = scanner.nextInt();
        scanner.nextLine(); 

        
        System.out.println("결과값 : 키 " + height + "cm인 " + age + "세" +" "+ gender + "성 " +name+ "님 반갑습니다^^");

        scanner.close();
    }
}
//이름, 성별, 나이, 키를 사용자에게 입력 받아 각각의 값을 변수에 담고 출력하세요.
//ex) 
//	이름을 입력하세요 : 유승민
//	성별을 입력하세요 (남/여) : 남
//	나이를 입력하세요 : 30세
//	키를 입력하세요(cm) :172
//	
//	결과값 : 키 172cm인 30살 남자 유승민님 반갑습니다^^