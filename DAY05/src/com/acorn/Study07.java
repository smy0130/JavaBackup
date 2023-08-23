package com.acorn;

import java.util.Scanner;

public class Study07 {
    public static void main(String[] args) {
        // 이름, 성별, 나이 : 데이터 -> 변수
        // 사용자(실행사용자) - 프로그램 논외
        // (키보드)입력 받아 : Scanner(java.util) 객체 필요
        // 각각의 값을 변수에 담고
        // 출력(대상 : 데이터(값, 변수) : System.out.println(값, 변수);

        Scanner scanner = new Scanner(System.in);

        System.out.print("이름을 입력하세요 : ");
        String name = scanner.nextLine();

        System.out.print("성별을 입력하세요 (남/여) : ");
        String gender = scanner.nextLine();

        System.out.print("나이를 입력하세요 : ");
        int age = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("이름: " + name);
        System.out.println("성별: " + gender);
        System.out.println("나이: " + age + "세");

        scanner.close();
    }
}