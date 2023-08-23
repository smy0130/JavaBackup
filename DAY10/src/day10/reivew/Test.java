package day10.reivew;

public class Test {
	// 변수 영역 - 필드(속성) 영역
	int empNo;
	String name;
	double salary;
	int deptno;
	// 함수 영역 - 메소드 영역
	
	// 생성자: 기본/인자있는 생성자
	public Employee() {}

	public Employee(int empNo, String name, double salary) {
		this.empNo = empNo;
		this.name = name;
		this.salary = salary;
	}
	// Getters/Setters 메소드 - OOP에서의 Data Encryption
	public int getEmpNo() {
		return empNo;
	}

	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getDeptno() {
		return deptno;
	}

	public void setDeptno(int deptno) {
		this.deptno = deptno;
	}
	
	// 일반메소드
	// 정적 메소드 
	// (동적) 메소드
	public double getSalaryForYear(double salary) {
		double salaryForYear= salary *12;
		return salaryFor
				Year;
	}
}
