package com.study.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JDBCTest {
	public static Connection getConnection(){
		Connection conn = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "123456");
		} catch (Exception e) {
			// TODO: handle exception
		}
		return conn;
	}
	
	public static void insert(){
		Connection conn = getConnection();
		try {
			String sql  = "insert into tbl_user(name,password,email) values('Jack','11111','jack@mail')";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("向用户表中插入了"+count+"次");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void update(){
		Connection conn = getConnection();
		try {
			String sql  = "update tbl_user set email='xiaoxiao@mail' where name = 'Jack'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("用户表中更新了"+count+"次");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	
	public static void delete(){
		Connection conn = getConnection();
		try {
			String sql  = "delete from tbl_user where name = 'Jack'";
			Statement st = conn.createStatement();
			int count = st.executeUpdate(sql);
			System.out.println("用户表中删除了"+count+"次");
		} catch (Exception e) {
			// TODO: handle exception
		}
	}
	public static void main(String[] args) {
		//insert();
		//update();
		delete();
		
		
	/*
		String sql ="select * from tbl_user";
		Connection conn = null;
		Statement st = null;
		ResultSet rs = null;
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp_db", "root", "123456");
			st = conn.createStatement();
			rs = st.executeQuery(sql);
			
			while(rs.next()){
				System.out.print(rs.getInt("id")+"  ");
				System.out.print(rs.getString("name")+"   ");
				System.out.print(rs.getString("password")+"   ");
				System.out.print(rs.getString("email")+"   ");
				System.out.println();
			}
			
		} catch (Exception e) {
			// TODO: handle exception
		}finally{
			try {
				rs.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				st.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
			try {
				conn.close();
			} catch (Exception e2) {
				// TODO: handle exception
			}
		}
		*/
	}
 
}
