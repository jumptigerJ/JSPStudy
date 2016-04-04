package com.study.test;

import java.sql.Connection;
import java.sql.SQLException;

import com.study.util.ConnectionFactory;

public class ConnectionFactoryTest{

	public static void main(String[] args) throws SQLException {
		ConnectionFactory factory = ConnectionFactory.getInstance();
		Connection conn = factory.makeConnection();
		System.out.println(conn.getAutoCommit());
	}

}
