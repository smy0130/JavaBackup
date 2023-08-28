package com.accorn.classrelational;

public class Student {
	private int id;
	private String subject;
	private int rank;
	Resident rd;
	
	public Student() {
		this.id = 1234;
		this.subject = "소프트웨어";
		this.rank = 4;
		rd = new Resident(
				"홍길동", "서울시");
		System.out.println(rd.getName());
	}
	
	public void displayAllStudentInfo() {
		System.out.println(id + ":" +
				subject + ":" + rank);
		System.out.println(rd.getName());
		System.out.println(rd.getAddr());
	}
}
