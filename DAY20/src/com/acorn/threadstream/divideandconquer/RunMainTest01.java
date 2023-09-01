package com.acorn.threadstream.divideandconquer;

public class RunMainTest01 {

	public static void main(String[] args) {
		long lTotalum = 0L;
		
		lTotalum += new RunMain01().sum();
		lTotalum += new RunMain02().sum();
		lTotalum += new RunMain03().sum();
		
		System.out.println("합계: " + lTotalum);

	}

}
