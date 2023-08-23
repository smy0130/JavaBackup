package acorn.self;

import java.util.Scanner;
import java.util.Random;


public class selftest01 {
    public static void main(String[] args) {
    	 Scanner scanner = new Scanner(System.in);
         Random random = new Random();
              
         int 현재재고 = 100; // 초기 재고 설정

         int 상품1재고 = 50;
         int 상품2재고 = 30;
         int 상품3재고 = 20;
         int 상품4재고 = 10;

         for (int i = 0; i < 10; i++) {
             int randInt = random.nextInt(10); // 0부터 9까지 랜덤한 값 생성
             현재재고 -= randInt; // 랜덤한 값만큼 재고에서 빼기

             // 상품 정보 입력 받기
             System.out.print("상품 정보를 입력하세요: ");
             String 상품정보 = scanner.nextLine();

             // 판매량 입력 받기 (10부터 30까지의 랜덤 값 생성)
             int 판매량 = random.nextInt(21) + 10;

             // 상품별 재고량 감소
             if (상품정보.equals("상품1")) {
                 if (판매량 <= 상품1재고) {
                     상품1재고 -= 판매량;
                 } else {
                     System.out.println("재고량보다 많이 판매할 수 없습니다.");
                 }
             } else if (상품정보.equals("상품2")) {
                 if (판매량 <= 상품2재고) {
                     상품2재고 -= 판매량;
                 } else {
                     System.out.println("재고량보다 많이 판매할 수 없습니다.");
                 }
             } else if (상품정보.equals("상품3")) {
                 if (판매량 <= 상품3재고) {
                     상품3재고 -= 판매량;
                 } else {
                     System.out.println("재고량보다 많이 판매할 수 없습니다.");
                 }
             } else if (상품정보.equals("상품4")) {
                 if (판매량 <= 상품4재고) {
                     상품4재고 -= 판매량;
                 } else {
                     System.out.println("재고량보다 많이 판매할 수 없습니다.");
                 }
             }

             // 재고량이 빠진 만큼 다시 채워준다.
             //만드는 느낌은 만약에 현재 재고량이 줄어든다면 줄어든 재고량 만큼 다시 채워줍니다. 
             if (상품1재고 < 현재재고) {
                 상품1재고 = 현재재고;
             }
             if (상품2재고 < 현재재고) {
                 상품2재고 = 현재재고;
             }
             if (상품3재고 < 현재재고) {
                 상품3재고 = 현재재고;
             }
             if (상품4재고 < 현재재고) {
                 상품4재고 = 현재재고;
             }

             System.out.println("현재 재고: " + 현재재고); // 결과 출력
             System.out.println("상품 정보: " + 상품정보); // 상품 정보 출력
             System.out.println("키보드 입력 끝난 후 엔터 진행");
             scanner.nextLine(); // 사용자 입력 대기
         }

         scanner.close(); // 스캐너 종료
     }
 }