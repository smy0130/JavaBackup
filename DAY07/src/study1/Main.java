package study1;

public class Main {
	public static void main(String[] args) {
		Employee employee1 = new Employee(1, "홍길동", 1000.0);
			
		double dRet = employee1.getReturnTax(0.075);
		System.out.println("회수세금:" + dRet);
		
		dRet = employee1.getReturnTax(0.075, 1);
		System.out.println("회수세금:" + dRet);
		
//		Manager manager = new Manager(10, "홍길동관리자", 5000.0);
//		dRet = manager.getReturnTax(0.2);
//		System.out.println("회수세금:" + dRet);
	}
}
