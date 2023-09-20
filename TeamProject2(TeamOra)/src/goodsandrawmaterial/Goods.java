package goodsandrawmaterial;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Goods {
	private static String DB_URL 
		= "jdbc:oracle:thin:@192.168.0.126:1521:xe";
	private static String USER = "teamora";
	private static String PASS = "1234";
	private static String QUERY1
		= "SELECT goodscode, goodsname, goodsprice "
				+ "FROM goods WHERE goodsname IS NOT NULL";
				
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			stmt = conn.createStatement();
			goods(stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void goods(
			Statement stmt, ResultSet rs) throws SQLException {
		// 질의 수행
		rs = stmt.executeQuery(QUERY1);
		while(rs.next()) {
			System.out.print("상품코드: " + rs.getInt("goodscode") + "");
			System.out.print(" 상품이름: " + rs.getString("goodsname") + "");
			System.out.println(" 상품가격: " + rs.getString("goodsprice") + "");
		}
		
		rs.close();
	}	
	
}
