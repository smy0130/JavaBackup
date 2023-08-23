package acorn.study;

import java.util.Scanner;

public class BusinessMainTEACHER {

	public static void main(String[] args) {
		// 적정재고 초기화(4종류 상품)
		int iAdjustedStock1 = 10;
		int iAdjustedStock2 = 10;
		// 현재 재고 초기화(4종류 상품)
		int iCurrentStock1 = 0;
		int iCurrentStock2 = 0;
		
		Scanner sc = new Scanner(System.in);
		
		// 반복문(10)
		for(int i = 0; i < 10; ++i)
		{
			// 현재재고와 적정재고 확인
			// 현재재고가 적정재고보다 작은지
			if(iCurrentStock1 < iAdjustedStock1)
			{
				// 적정재고와의 차이만큼 현재 재고를 보충
				// iCurrentStock1 = iCurrentStock1 + (iAdjustedStock1 - iCurrentStock1);
				iCurrentStock1 += (iAdjustedStock1 - iCurrentStock1);
			}
	
			// 사용자 주문 시뮬레이션(랜덤을 사용)
			int iCustomerOrderQty = (int)(Math.random()*iAdjustedStock2);
				// 현재재고 - 사용자주문량
			iCurrentStock1 -= iCustomerOrderQty;
			// 출력: 적정재고, 현재재고
			System.out.println("적정재고:" + iAdjustedStock1 + 
					"현재재고:" + iCurrentStock1);
			
			if(iCurrentStock2 < iAdjustedStock2)
			{
				// 적정재고와의 차이만큼 현재 재고를 보충
				// iCurrentStock2 = iCurrentStock2 + (iAdjustedStock2 - iCurrentStock2);
				iCurrentStock2 += (iAdjustedStock2 - iCurrentStock2);
			}

			// 사용자 주문 시뮬레이션(랜덤을 사용)
			iCustomerOrderQty = (int)(Math.random()*iAdjustedStock2);
				// 현재재고 - 사용자주문량
			iCurrentStock2 -= iCustomerOrderQty;
			// 출력: 적정재고, 현재재고
			System.out.println("적정재고:" + iAdjustedStock1 + 
					"현재재고:" + iCurrentStock2);

			// 입력대기(Thread.sleep(1000))	
			System.out.println("계속하려면 아무키나 누르세요...");
			sc.nextLine();
		}
		// 최종적인 출력: 적정재고, 현재재고
		System.out.println("적정재고:" + iAdjustedStock1 + 
				"현재재고:" + iCurrentStock1);
		System.out.println("적정재고:" + iAdjustedStock2 + 
				"현재재고:" + iCurrentStock2);
		
		sc.close();
	}

}
