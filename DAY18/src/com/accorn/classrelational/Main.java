package com.accorn.classrelational;

public class Main {

	public static void main(String[] args) {
//		Test01 objTest01 = new Test01();
	
		Resident rd = new Resident();
		StudentDepen std = new StudentDepen(rd);
		std.displayAllStudentInfo(rd);
	}

}
