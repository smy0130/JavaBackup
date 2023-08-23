package com.acorn;

import java.text.DecimalFormat;
import java.util.Scanner;

public class study01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
			 
		 int koscore = 0; int mascore = 0; int enscore = 0;
			// 국어점수 : 88
			System.out.print("국어 점수는: ");
			koscore = sc.nextInt();
			// 수학점수 : 50
			System.out.print("수학 점수는: ");
			 mascore = sc.nextInt();
			// 영어점수 : 40
			System.out.print("영어 점수는: ");
			enscore = sc.nextInt();
			// 불합격입니다.		
			 int sum = koscore + mascore + enscore;
			 int total = 3;
			 double average = (double)sum / total;
			 DecimalFormat df = new DecimalFormat("0.0");
			 System.out.println("총 합계는: " + sum + "입니다.");
			 System.out.println("평균은: " + df.format(average) + "입니다.");			
			 if (koscore < 40 || mascore < 40 || enscore < 40) {
		            System.out.println("불합격입니다. 과락으로 인해 합격하지 못하셨습니다.");
		        } else if (average >= 60) {
		            System.out.println("축하합니다! 합격입니다.");
		        } else {
		            System.out.println("불합격입니다.");
		        }
			 sc.close();
			}

}


