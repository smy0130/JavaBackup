package acorn.study;

import java.util.Scanner;

public class BusinessMainTEACHER2 {
	//함수로 변경 하는 부분 
    public static void main(String[] args) {
        // 적정재고 초기화(2종류 상품)
        int iAdjustedStock1 = 10;
        int iAdjustedStock2 = 10;

        // 현재 재고 초기화(2종류 상품)
        int iCurrentStock1 = 0;
        int iCurrentStock2 = 0;

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < 10; ++i) {
            // 각 상품에 대한 보충 및 주문 처리 함수 호출
            iCurrentStock1 = processProduct(iAdjustedStock1, iCurrentStock1);
            iCurrentStock2 = processProduct(iAdjustedStock2, iCurrentStock2);

            // 입력 대기
            System.out.println("계속하려면 아무 키나 누르세요...");
            sc.nextLine();
        }

        // 최종적인 출력
        System.out.println("최종적인 적정재고:" + iAdjustedStock1 + " 현재재고:" + iCurrentStock1);
        System.out.println("최종적인 적정재고:" + iAdjustedStock2 + " 현재재고:" + iCurrentStock2);

        sc.close();
    }

    // 상품에 대한 보충 및 주문 처리 함수
    public static int processProduct(int adjustedStock, int currentStock) {
        if (currentStock < adjustedStock) {
            currentStock += (adjustedStock - currentStock);
        }

        int customerOrderQty = (int) (Math.random() * adjustedStock);
        currentStock -= customerOrderQty;

        System.out.println("적정재고:" + adjustedStock + " 현재재고:" + currentStock);

        return currentStock;
    }
}