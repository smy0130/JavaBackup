package stdudy.static01;

public class Main {
	int iMainValue = 0;
	public static void main(String[] args) {
		System.out.println(StaticTest.number1);
		StaticTest.number1 = 100;
		StaticTest.printInfo();
		
		StaticTest sTest = new StaticTest();
		sTest.printInfo2();
		
	
		
	}
}
