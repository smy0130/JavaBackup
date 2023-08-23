package study.class_.inheritancetest1;

import java.util.Scanner;

public class TestMain {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Test1 test1 = new Test1(20, 30);
		Test2 test2 = new Test2(10, 60);
		
		int a = test1.getA();
		int b = test1.getB();
		int c = test2.getC();
		int d = test2.getD();
		
		System.out.println("###객체 복사 이전 값###");
		System.out.println("Test1 클래스의 필드값:" + a + ":" + b);
		System.out.println("Test2 클래스의 필드값:" + c + ":" + d);
		System.out.println();
		
		test1.setA(c);
		test1.setB(d);
		a = test1.getA();
		b = test1.getB();
		
		sc.nextLine();
		
		System.out.println();
		System.out.println("###객체 복사 이후 값###");
		System.out.println("Test1 클래스의 필드값:" + a + ":" + b);
		System.out.println("Test2 클래스의 필드값:" + c + ":" + d);
		
		sc.close();
	}

}
