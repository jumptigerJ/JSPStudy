package com.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class TransactionTest {
	
	public static Connection getConnection(){
		Connection conn = null;
		try {
//			Class.forName("com.mysql.jdbc.Driver");
//			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db","root","123456");
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "123456");
	
		} catch (Exception e) {
			e.printStackTrace();
		}
		return conn;
	}
	
	public static void insertUserData(Connection conn) throws SQLException{
		
		String sql = "insert into tbl_user(id,name,password,email) values(5,'tiger','11111','tiger@mail')";
		
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("向用户表插入了"+count+"次");
	
	}
	
	public static void insertAddressData(Connection conn) throws SQLException{
		
		String sql = "insert into tbl_address (id,city,country,user_id) values('1','tianjing','tianjing','2')";
		Statement st = conn.createStatement();
		int count = st.executeUpdate(sql);
		System.out.println("向地址表插入了"+count+"次");
	
	}

	public static void main(String[] args) {
		Connection conn = null;
		try {
			conn = getConnection();
			conn.setAutoCommit(false);
			insertUserData(conn);
			insertAddressData(conn);
			conn.commit();
			
		} catch (Exception e) {
			System.out.println("================捕获到异常=============");
			e.printStackTrace();
			try {
				conn.rollback();
				System.out.println("==============事务回滚成功==============");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}finally{
			try {
				if(conn != null){
					conn.close();
				}
			} catch (Exception e3) {
				e3.printStackTrace();
			}
			
		}
		

	}

}
