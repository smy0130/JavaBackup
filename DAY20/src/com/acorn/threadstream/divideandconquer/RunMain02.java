package com.acorn.threadstream.divideandconquer;

public class RunMain02 {

	public long sum() {
		long lSum = 0L;
		
		long lBeforeTime = System.currentTimeMillis();
		for(int i = 300001; i < 650000; i++) {
			for(int j = 0; j < 5000; j++) {
				lSum += i * j;
			}
		}
		long lAfterTime = System.currentTimeMillis();
			
		System.out.println("실행시간: " + (lAfterTime - lBeforeTime));
		
		return lSum;
	}
}
