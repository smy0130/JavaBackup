package com.acorn;

import java.util.Scanner;

// 메서드 오버로딩
public class MethodMain06 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] iFindMinValArr = new int[10];
        int[] iFindMaxValArr = new int[10];

        int iMaxVal = 0;
        int iMinVal = 0;

        // 사용자로부터 배열 데이터 입력 받기
        for (int i = 0; i < 5; i++) {
            System.out.print("값을 넣어보세요[" + i + "]: ");
            iFindMinValArr[i] = sc.nextInt();
        }

        // 최솟값과 최댓값 구하기
        iMinVal = getFindMinVal(iFindMinValArr);
        iMaxVal = getFindMaxVal(iFindMinValArr);

        System.out.println("최소값: " + iMinVal);
        System.out.println("최대값: " + iMaxVal);

        sc.close();
    }

    public static int getFindMinVal(int[] iFindMinValArr) {
        int iTempMinVal = iFindMinValArr[0];
        for (int x : iFindMinValArr) {
            if (iTempMinVal > x) {
                iTempMinVal = x;
            }
        }
        return iTempMinVal;
    }

    public static int getFindMaxVal(int[] iFindMaxValArr) {
        int iTempMaxVal = iFindMaxValArr[0];
        for (int x : iFindMaxValArr) {
            if (iTempMaxVal < x) {
                iTempMaxVal = x;
            }
        }
        return iTempMaxVal;
    }
}
	
	
	
	
	
	
	

