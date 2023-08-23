package com.acorn;

public class MethodMain02 {

	public static void main(String[] args) {
		System.out.println("메서드");
		
		double dFirst = 11.1; double dSecond = 12.1;
//		double dRet = dFirst + dSecond;  	// => add
		double dRet = CalcDblJar02.add(dFirst, dSecond);  	// => add
		System.out.println(dRet);
//		dRet = dFirst - dSecond;  			// => subtract
		dRet = CalcDblJar02.subtract(dFirst, dSecond);  	
		System.out.println(dRet);
//		dRet = dFirst * dSecond;  			// => multiply
		dRet = CalcDblJar02.multiply(dFirst, dSecond); 
		System.out.println(dRet);
//		dRet = dFirst / dSecond; 			// => divide
		dRet = CalcDblJar02.divide(dFirst, dSecond); 
		System.out.println(dRet);
	}


	
}
