package com.acorn.practice;

import java.util.Scanner;

public class Practice3 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("비밀번호 입력 (1000~9999): ");
        int password = sc.nextInt();
        
        // 입력받은 정수를 문자열로 변환하여 각 자리 수를 배열에 저장
        String passwordStr = String.valueOf(password);
        char[] digits = passwordStr.toCharArray();

        // 비밀번호 자리수 확인
        if (passwordStr.length() != 4) {
            System.out.println("자리 수 안 맞음");
        } else {
            // 각 자리수에 중복된 값이 있는지 확인
            boolean isDuplicate = false;
            for (int i = 0; i < digits.length; i++) {
                for (int j = i + 1; j < digits.length; j++) {
                    if (digits[i] == digits[j]) {
                        isDuplicate = true;
                        break;
                    }
                }
                if (isDuplicate) {
                    break;
                }
            }

            // 결과 출력
            if (isDuplicate) {
                System.out.println("중복 값 있음");
            } else {
                System.out.println("생성 성공");
            }
        }

        sc.close();
    }
}
//정수를 이용해서 4자리 비밀번호를 만들려고 하는데 이때 4자리 정수를 입력 받아 각 자리 수에 중복되는 값이 없을 경우 '생성 성공'
		// 중복 값이 있으면 '중복 값 있음'
		// 자리수가 안 맞으면 '자리 수 안 맞음' 출력
		// 단, 제일 앞자리 수의 값은 1~9 사이 정수
		//ex. 비밀번호 입력 (1000~9999) :56555 자리수 안맞음, 비밀번호 입력(1000~9999) : 5685 실패, 비밀번호 입력(1000~9999) :1234 성공
		
