package stdudy.singleton;

public class Main {

	public static void main(String[] args) {
		int a;
		int b;
		int c;
		
		// 객체 힙에 생성됩니다. (메모리): 주소값으로 표현(레퍼런스)
//		SingleTonTest singleTonTest1 = new SingleTonTest();
//		SingleTonTest singleTonTest2 = new SingleTonTest();
//		SingleTonTest singleTonTest3 = new SingleTonTest();
//		
//		System.out.println(singeTonTest1);
//		System.out.println(singeTonTest2);
//		System.out.println(singeTonTest3);
		
		SingleTonTest st1 = SingleTonTest.getInstance("YSM");
		System.out.println(st1);
		
		SingleTonTest st2 = SingleTonTest.getInstance("YSM2");
		System.out.println(st2);
			
		
	}

}
