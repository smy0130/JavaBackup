package day10.reivew;

public class ReviewMain10 {

	    public static void main(String[] args) {

	        // Employee 객체 생성
	        Employee employee = new Employee();
	        
	        // Employee 객체의 정보 설정
	        int empNO = 12345;
	        String name = "유승민";
	        int salary = 3000000;
	        employee.setEmployeeInfo(empNO, name, salary);
	        
	        // 연봉 계산
	        double salaryForYear = employee.getSalaryForYear();
	        System.out.println(name + "의 연봉은 " + salaryForYear + "원입니다.");
	    }
	}

	class Employee {
	    private int empNO;
	    private String name;
	    private double salary;
	    
	    // 정보 설정 메서드
	    public void setEmployeeInfo(int empNO, String name, double salary) {
	        this.empNO = empNO;
	        this.name = name;
	        this.salary = salary;
	    }
	    
	    // 연봉 계산 메서드
	    public double getSalaryForYear() {
	        return salary * 12;
	    }
	}
