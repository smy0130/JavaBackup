package com.acorn.threadstream.divideandconquer;

public class RunMain03 {
	public long sum() {
		long lSum = 0L;
		
		long lBeforeTime = System.currentTimeMillis();
		for(int i = 650001; i < 1000000; i++) {
			for(int j = 0; j < 5000; j++) {
				lSum += i * j;
			}
		}
		long lAfterTime = System.currentTimeMillis();	
		System.out.println("실행시간: " + (lAfterTime - lBeforeTime));
		
		return lSum;
	}
}
