package com.study.test;

import java.sql.Connection;

import com.study.dao.impl.UserDaoImpl;
import com.study.dtoEntity.User;
import com.study.util.ConnectionFactory;

public class UserDaoTest {

	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			conn = ConnectionFactory.getInstance().makeConnection();
			conn.setAutoCommit(false);
			
			UserDaoImpl userDao = new UserDaoImpl();
			User user = new User();
			user.setName("xingxing");
			user.setPassword("222222222");
			user.setEmail("xingxing@mail");
			
			userDao.save(conn, user);
			conn.commit();
			
		} catch (Exception e) {
			System.out.println("====执行数据库操作错误=======");
			try {
				conn.rollback();
				System.out.println("====回滚成功====");
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
