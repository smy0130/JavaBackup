package com.acorn.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DynamicRunMain {
	private static String DB_URL 
		= "jdbc:oracle:thin:@localhost:1521:xe";
	private static String USER = "teamora";
	private static String PASS = "teamora";
	private static String QUERY = "select goodsname, goodsprice"
			+"from goods";
				
	public static void main(String[] args) {

		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			// 연결 설정
			conn = DriverManager.getConnection(DB_URL, USER, PASS);
			// 구문객체 생성
			pstmt = conn.prepareStatement(QUERY);

			rs = pstmt.executeQuery();
			
			while(rs.next()) {
				System.out.println(rs.getString(1));
			}
	
			rs.close();
			pstmt.close();
			conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
