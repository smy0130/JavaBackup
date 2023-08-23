package acorn.study;

import java.util.Scanner;

public class BusinessMainTEACHER3 {
	public static void main(String[] args) {
		// 적정재고 초기화(4종류 상품)
		int iProperStock1 = 10; int iProperStock2 = 10;
		// 현재 재고 초기화(4종류 상품)
		int iCurrentStock1 = 0; int iCurrentStock2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// 반복문(10)
		for(int i = 0; i < 10; ++i) {
			// 사용자 주문 처리 함수
			iCurrentStock1 = goodStockProcess(iCurrentStock1, iProperStock1);
			iCurrentStock2 = goodStockProcess(iCurrentStock2, iProperStock2);

			// 입력대기(Thread.sleep(1000))	
			System.out.println("계속하려면 아무키나 누르세요...");
			sc.nextLine();
		}
		// 최종적인 출력: 적정재고, 현재재고
		System.out.println("적정재고:" + iProperStock1 + 
				"현재재고:" + iCurrentStock1);
		System.out.println("적정재고:" + iProperStock2 + 
				"현재재고:" + iCurrentStock2);
		sc.close();
	}

	public static int goodStockProcess(int iCurrentStock, int iProperStock) {
		// 현재재고와 적정재고 확인
		// 현재재고가 적정재고보다 작은지
		if(iCurrentStock < iProperStock) {
			// 적정재고와의 차이만큼 현재 재고를 보충
			// iCurrentStock1 = iCurrentStock1 + (iAdjustedStock1 - iCurrentStock1);
			iCurrentStock += (iProperStock - iCurrentStock);
		}

		// 사용자 주문 시뮬레이션(랜덤을 사용)
		int iCustomerOrderQty = (int)(Math.random()*iProperStock);
			// 현재재고 - 사용자주문량
		iCurrentStock -= iCustomerOrderQty;
		// 출력: 적정재고, 현재재고
		System.out.println("적정재고:" + iProperStock + "현재재고:" + iCurrentStock);	
		
		return iCurrentStock;
	}
	
}
