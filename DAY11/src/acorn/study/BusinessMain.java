package acorn.study;

import java.util.Random;
import java.util.Scanner;

public class BusinessMain {

    public static void main(String[] args) throws InterruptedException {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // 적정재고 초기화(4종류 상품)
        int 상품1_적정재고 = random.nextInt(31) + 20;
        int 상품2_적정재고 = random.nextInt(31) + 20;
        int 상품3_적정재고 = random.nextInt(31) + 20;
        int 상품4_적정재고 = random.nextInt(31) + 20;

        // 현재 재고 초기화 (4종류 상품)
        int 상품1_현재재고 = 상품1_적정재고;
        int 상품2_현재재고 = 상품2_적정재고;
        int 상품3_현재재고 = 상품3_적정재고;
        int 상품4_현재재고 = 상품4_적정재고;

        // 반복문(10)
        for (int i = 0; i < 10; i++) {
            // 현재재고와 적정재고 확인 후 보충
            상품1_현재재고 += (상품1_적정재고 - 상품1_현재재고);
            상품2_현재재고 += (상품2_적정재고 - 상품2_현재재고);
            상품3_현재재고 += (상품3_적정재고 - 상품3_현재재고);
            상품4_현재재고 += (상품4_적정재고 - 상품4_현재재고);

            // 사용자 주문 시뮬레이션
            System.out.println("주문할 상품을 선택하세요 (1~4): ");
            int 선택 = scanner.nextInt();
            int 주문량 = random.nextInt(21) + 10;

            // 현재재고 감소
            if (선택 == 1 && 주문량 <= 상품1_현재재고) {
                상품1_현재재고 -= 주문량;
            } else if (선택 == 2 && 주문량 <= 상품2_현재재고) {
                상품2_현재재고 -= 주문량;
            } else if (선택 == 3 && 주문량 <= 상품3_현재재고) {
                상품3_현재재고 -= 주문량;
            } else if (선택 == 4 && 주문량 <= 상품4_현재재고) {
                상품4_현재재고 -= 주문량;
            } else {
                System.out.println("주문량이 재고량을 초과하거나 잘못된 상품을 선택했습니다.");
            }

            // 출력 : 적정재고, 현재재고
            System.out.println("상품1 적정재고: " + 상품1_적정재고 + ", 현재재고: " + 상품1_현재재고);
            System.out.println("상품2 적정재고: " + 상품2_적정재고 + ", 현재재고: " + 상품2_현재재고);
            System.out.println("상품3 적정재고: " + 상품3_적정재고 + ", 현재재고: " + 상품3_현재재고);
            System.out.println("상품4 적정재고: " + 상품4_적정재고 + ", 현재재고: " + 상품4_현재재고);

            // 입력 대기 (1초)
            Thread.sleep(1000);
        }

        scanner.close(); // 스캐너 종료
    }
}