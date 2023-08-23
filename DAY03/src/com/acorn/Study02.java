package com.acorn;

import java.util.Scanner;
public class Study02 {

    public static void main(String[] args) {
        // 키보드 입력 개체 생성
        Scanner sc = new Scanner(System.in);

        // 게임을 반복적으로 실핼할 수 있는 루프
        while(true){
            // 타입 지정: 1(사람), 2(컴퓨터)
            byte iType = 1;
            // 두 개의 숫자를 키보드 입력
            System.out.println("숫자입력1:>>>");
            int iInputVal01 = sc.nextInt();
            System.out.println("숫자입력2:>>>");
            int iInputVal02 = sc.nextInt();

            // 두 개의 난수를 생성
            int iRanNum01;
            int iRanNum02;
            do{
                iRanNum01 = (int)((Math.random()*100))+1;
                iRanNum02 = (int)((Math.random()*100))+1;
            }while(iRanNum01 == iRanNum02);
            System.out.println(iRanNum01 + ":" + iRanNum02);
            // 우승 조건: 두 개의 수의 차가 가장 적은 수
            int diffHum = Math.abs(iInputVal01 - iInputVal02);
            int diffCom = Math.abs(iRanNum01 - iRanNum02);
            if( diffHum > diffCom){
                iType = 2;
            }
            // 우승 여부 출력
            if(iType == 2) System.out.println("컴퓨터 우승");
            else System.out.println("사람 우승");

            // 게임을 다시 진행하고 싶은지 묻기
            System.out.println("Do you want to play again (Y/N)");
            String playAgain = sc.next();
            if(playAgain.equalsIgnoreCase("N")){
                break; // 다시 플레이하고 싶지 않다면 루프를 벗어난다.
            }
        }

        sc.close();

    }

}

