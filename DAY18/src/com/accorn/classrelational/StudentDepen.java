package com.accorn.classrelational;

public class StudentDepen {
	private int id;
	private String subject;
	private int rank;
	
	public StudentDepen(Resident rd) {
		this.id = 1234;
		this.subject = "history";
		this.rank = 3;
		rd.setName("홍길동");
		rd.setAddr("인천시");
		
		displayAllStudentInfo(rd);
	}
	
	public void displayAllStudentInfo(Resident rd) {
		System.out.println("학과정보");
		System.out.println(id + ":" + subject + ":" + rank);
		System.out.println("신상정보");
		System.out.println(rd.getName() + ":" + rd.getAddr());
	}
}
