package study1;

public class Employee {
	// 필드(속성) 영역
	private int iEmpNo;
	private String sEmpName;
	private double dSalary;
	
	// 클래스를 작성할 떄 생성자를 만들지 않으면
	// 자바 컴파일러가 기본생성자를 자동으로 생성
	// 생성자 리턴타입이 없고 클래스이름과 동일
	// 기본 생성자: 필드값을 필드의 데이터 타입 기본값을 초기화 
	public Employee() { }
	
	// 인자있는 생성자
	public Employee(int iEmpNo, 
			String sEmpName, double dSalary) { 
		this.iEmpNo = iEmpNo;
		this.sEmpName = sEmpName;
		this.dSalary = dSalary;
	}
	
	// Getters/Setters 메소드
	public int getiEmpNo() { return iEmpNo; }
	public void setiEmpNo(int iEmpNo) {	this.iEmpNo = iEmpNo; }

	public String getsEmpName() { return sEmpName; }
	public void setsEmpName(String sEmpName) { this.sEmpName = sEmpName; }

	public double getdSalary() { return dSalary; }
	public void setdSalary(double dSalary) { this.dSalary = dSalary; }

//	dRetResult = ((dSalary*12) + (dSalary * 1.13)) * ratio;
	// 메소드 영역 - 동적 메소드
	/**
	 * 
	 * @param ratio
	 * @param type
	 * @return
	 */
	public double getReturnTax(double ratio) {
		// tax 금액 계산
		// 변수 선언
		double dRetResult = 0.0;
		// 리턴텍스 계산: dSalary * 0.075
		dRetResult = dSalary * ratio;

		// 계산된 결과를 변수에 저장
		// return 변수명
		return dRetResult;
	}
	
	// 메서드 오버로딩
	public double getReturnTax(double ratio, int months) {
		// tax 금액 계산
		// 변수 선언
		double dRetResult = 0.0;
		// 리턴텍스 계산: dSalary * 0.075
		if(months == 12)
			dRetResult = ((dSalary * months) + (dSalary * 1.3)) * ratio;
		else if( (months >= 1) && (months < 12))
			dRetResult = (dSalary * months) * ratio;
		// 계산된 결과를 변수에 저장
		// return 변수명
		return dRetResult;
	}

}