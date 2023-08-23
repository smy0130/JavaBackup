package com.acorn.practice;

import java.util.Scanner;

public class Practice5 {

    public static void main(String[] args) {
        String[] daysOfWeek = {"월요일", "화요일", "수요일", "목요일", "금요일", "토요일", "일요일"};
        Scanner sc = new Scanner(System.in);

        System.out.print("0 ~ 6 사이 숫자 입력: ");
        int inputNumber = sc.nextInt();

        if (inputNumber >= 0 && inputNumber <= 6) {
            System.out.println(daysOfWeek[inputNumber]);
        } else {
            System.out.println("잘못 입력하였습니다.");
        }

        sc.close();
    }
}



//"월"~"일"까지 초기화된 문자열 배열을 만들고 0부터 6까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을 출력하고
//범위에 없는 숫자를 입력 시 "잘못 입력하였습니다."를 출력하세요.
//ex. 0 ~ 6 사이 숫자 입력 : 4 금요일   0 ~ 6 사이 숫자 입력 : 7 잘못입력하였습니다.
