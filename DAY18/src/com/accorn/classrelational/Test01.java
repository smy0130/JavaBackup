package com.accorn.classrelational;

public class Test01 {
	private int iTest01Value01;
	private int iTest01Value02;
	private Test02 objTest02;

	public Test01() {
		System.out.println("Test01()");
		// Test02 클래스와 Test02 클래스는 association관게
		objTest02 = new Test02();
		System.out.println(objTest02.getiTestValue01());
		System.out.println(objTest02.getiTestValue02());
		objTest02.setiTestValue01(1);
		objTest02.setiTestValue02(2);
		System.out.println(objTest02.getiTestValue01());
		System.out.println(objTest02.getiTestValue02());
	}

	public int getiTest01Value01() {
		return iTest01Value01;
	}

	public void setiTest01Value01(int iTest01Value01) {
		this.iTest01Value01 = iTest01Value01;
	}

	public int getiTest01Value02() {
		return iTest01Value02;
	}

	public void setiTest01Value02(int iTest01Value02) {
		this.iTest01Value02 = iTest01Value02;
	}
}