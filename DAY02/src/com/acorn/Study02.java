package com.acorn;

import java.util.Scanner;

public class Study02 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어점수 >>> ");
		int nlpoint = sc.nextInt();
		System.out.println("영어점수 >>> ");
		int elpoint = sc.nextInt();
		System.out.println("수학점수 >>> ");
		int matpoint = sc.nextInt();
		
//		System.out.println("합계 : " + (nlpoint + elpoint + matpoint));
		
		
		
		// 과목별 과락 점수를 지정
		// 임의의 과목 3개에 대해 각각의 점수를 입력받는다.
		// 모든 점수를 합산
		// 모든 점수의 평균을 구한다.
		// 합산 점수의 합격/불합격 여부 결정
		// 평균 점수의 합격/불합격 여부 결정
		// 과락 기준 여부에 따른 합격/불합격 여부 결정
		// 합격 여부 출력 또는 불합격 및 이유 출력
		
		int total = nlpoint + elpoint + matpoint;
//		float average = total / 3;
		
		if (nlpoint < 50 && elpoint < 50 && matpoint < 50) {
			if(total > 150)
				System.out.println("합격");
			else
				System.out.println("불합격 (합산 점수 미달)");
		} else {
			if (nlpoint < 50) {
				System.out.println("불합격 (국어점수 미달)");
			if (elpoint < 50)
				System.out.println("불합격 (영어점수 미달)");
			if (matpoint < 50)
				System.out.println("불합격 (수학점수 미달)");
			}
		}
		
		sc.close();
	}
	
	public void totalJudge(int s1, int s2, int s3) {
		
	}
	
	public void scoreJudge(int s) {
		
	}
}
