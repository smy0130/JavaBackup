package com.acorn;

import java.util.Scanner;

public class Study03 {
    public static void main(String[] args) {
        // 키보드 입력 객체 생성
        // 두 개의 숫자를 키보드 입력

        int[] numArray = new int[100];
        int num1 = 0, num2 = 0;
        while (true) {
            System.out.println("======메뉴=====");
            System.out.println("1. 컴퓨터 배열 생성");
            System.out.println("2. 변수 입력");
            System.out.println("3. 우승 판별");
            System.out.println("ETC. 종료 ");
            System.out.println("==============");
            System.out.print("입력>>>");
            Scanner sc = new Scanner(System.in);
            int selectNum = sc.nextInt();
            if (selectNum > 3) {
                System.out.println("=============시스템 종료================");
                sc.close();
                break;
            }
            switch (selectNum) {
                case 1:
                    numArray = createIntArray();
                    continue;
                case 2 :
                    System.out.print("입력 ex) 10 20 : ");
                    num1 = sc.nextInt();
                    num2 = sc.nextInt();
                    System.out.println("입력된 변수 : " + num1 + " " + num2);
                    continue;
                case 3:
                    int randomIndex1 = (int)(Math.random()*100);
                    int randomIndex2 = (int)(Math.random()*100);
                    System.out.printf("%d번 배열 %d번 배열, 각 숫자 : %d %d\n",
                            randomIndex1, randomIndex2, numArray[randomIndex1], numArray[randomIndex2]);
                    System.out.printf("컴퓨터 선택 변수 : %d %d, 차이 : %d\n",
                            numArray[randomIndex1], numArray[randomIndex2], absNum(numArray[randomIndex1], numArray[randomIndex2]));
                    System.out.printf("사용자 입력 변수 : %d %d, 차이 : %d\n", num1, num2, absNum(num1, num2));
                    System.out.println(winner(absNum(numArray[randomIndex1], numArray[randomIndex2]), absNum(num1, num2)));
                    continue;
                default:
                    break;
            }
        }
    }

    // TODO 뺄셈 절대값 제조
    public static int absNum(int a, int b){
        if (a> b){
            return a-b;
        }else return b-a;
    }
    // TODO 배열 100개 생성
    public static int[] createIntArray(){
        System.out.println("=================배열 생성==================");
        int[] numArray = new int[100];
        for (int i = 0; i < 10; i++) {
            System.out.printf("Column%2d : ", i+1);
            for(int j=0; j<10;j++){
                numArray[10*i + j] = (int) (Math.random() * 100);
                System.out.printf("%3d",numArray[10*i + j]);
            }
            System.out.println();
        }
        System.out.println("=================생성 완료==================");
        return numArray;
    }
    // TODO 우승 조건 함수
    public static String winner(int num1, int num2){
        // 차이값 받아서 작은 수가 이김
        return num1 < num2 ? "사용자 우승":"컴퓨터 우승";
    }
}
