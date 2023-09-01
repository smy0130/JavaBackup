package com.acorn.threadstream.divideandconquer;

public class RunMain01 {

	public long sum() {
		long lSum = 0L;
		
		long lBeforeTime = System.currentTimeMillis();
		for(int i = 0; i < 300000; i++) {
			for(int j = 0; j < 5000; j++) {
				lSum += i * j;
			}
		}
		long lAfterTime = System.currentTimeMillis();
			
		System.out.println("실행시간: " + (lAfterTime - lBeforeTime));
		
		return lSum;
	}
}
