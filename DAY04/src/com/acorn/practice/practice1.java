package com.acorn.practice;

import java.util.Scanner;

public class practice1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("중간>>> ");
        int middleTerm = sc.nextInt();
        System.out.print("기말>>> ");
        int finalTerm = sc.nextInt();
        System.out.print("과제>>> ");
        int report = sc.nextInt();
        System.out.print("출석횟수>>> ");
        int attendCnt = sc.nextInt();
        
        int conMiddleTerm = (int)(middleTerm * 0.2);
        int conFinalTerm = (int)(finalTerm * 0.3);
        int conReport = (int)(report * 0.3);
        double attendanceRate = (double) attendCnt / 20; // 출석 비율 계산
        int conAttendCnt = (int)(attendanceRate * 100 * 0.2); // 출석 비율을 백분율로 변환하여 계산
        
        int totalScore = conMiddleTerm + conFinalTerm + conReport + conAttendCnt;
        
        if (totalScore >= 70 && attendanceRate >= 0.3) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }
        
        sc.close();
        
     
    }
}
	//중간고사, 기말고사, 과제점수, 출석회수를 입력하고 Pass 또는 Fail을 출력하세요.
			// 평가비율은 중간고사 20%, 기말고사 30%, 과제 30% 출석 20%러 이루어져 있고 이때 , 출석비율은 출석회수의 총 강의 회수 20회 중에서 출석한 날만 따진 값으로 계산하세요
			// 70점 이상일 경우 pass, 70점 미만이거나 전체 강의에 30% 이상 결석 시 Fail을 출력하세요.