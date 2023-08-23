package com.acorn.inheritance;

public class Main {

	public static void main(String[] args) {
		TVChild objTV = new TVChild(false, 10, 20);
		objTV.watch();		

		AudioChild objChild = new AudioChild(true, 10);
		objChild.tune();		
	}

}

