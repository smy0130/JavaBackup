package goodsandrawmaterial;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Rawmaterial {
	private static String DB_URL 
		= "jdbc:oracle:thin:@192.168.0.126:1521:xe";
	private static String USER = "teamora";
	private static String PASS = "1234";
	private static String QUERY2
		= "SELECT RAWMATERIALCODE, RAWMATERIALNAME, RAWMATSTOCK_QUANTITY "
				+ "FROM RAWMATERIAL WHERE RAWMATERIALNAME IS NOT NULL";
				
	public static void main(String[] args) {

		Connection conn = null;
		Statement stmt = null;
		ResultSet rs = null;
		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			stmt = conn.createStatement();
			Rawmaterial(stmt, rs);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void Rawmaterial(
			Statement stmt, ResultSet rs) throws SQLException {
		
		rs = stmt.executeQuery(QUERY2);
		while(rs.next()) {
			System.out.print("상품코드: " + rs.getInt("RAWMATERIALCODE") + "");
			System.out.print(" 상품이름: " + rs.getString("RAWMATERIALNAME") + "");
			System.out.println(" 상품가격: " + rs.getString("RAWMATSTOCK_QUANTITY") + "");
		}
		
		
		rs.close();
	}	
	
}
