package com.acorn;

import java.util.Scanner;

public class study04 {
    public static void main(String[] args) {
        // 1. 출력메시지 저장: System.out.println()
        // 1.1 합격 메시지: 축하합니다, 합격입니다!
        // 문자열 변수: String sPassMsg
        String sPassMsg = "축하합니다, 합격입니다!";
        // 1.2 불합격 메시지 : 불합격 입니다.
        // 문자열 변수: sFailMsg
        String sFailMsg = "불합격 입니다.";

        // 2. 키보드로 점수를 입력받고 국어, 영어, 수학 세 과목 점수 저장
        Scanner sc = new Scanner(System.in);
        System.out.print("국어 점수를 입력하세요: ");
        int iNlScore = sc.nextInt();
        System.out.print("영어 점수를 입력하세요: ");
        int iEngScore = sc.nextInt();
        System.out.print("수학 점수를 입력하세요: ");
        int iMathScore = sc.nextInt();
        sc.close();

        // 3. 합계와 평균을 계산
        int iSum = iNlScore + iEngScore + iMathScore;
        double dAvg = (double) iSum / 3;

        // 4. 합격 / 불합격 처리
        if ((iNlScore >= 40) && (iEngScore >= 40) && (iMathScore >= 40) && (dAvg >= 60)) {
            System.out.println(sPassMsg);
        } else {
            System.out.println(sFailMsg);
        }
    }
}