package com.study.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.study.dao.UserDao;
import com.study.dtoEntity.User;

public class UserDaoImpl implements UserDao {

	/**
	 * 保存用户信息
	 */
	@Override
	public void save(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareCall("insert into tbl_user (name,password,email) values(?,?,?)");
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		
		ps.execute();
		
	}
	
	/**
	 * 根据用户指定的ID更新用户信息
	 */
	@Override
	public void update(Connection conn, Long id, User user) throws SQLException {
		String updateSql = "update tbl_user set name = ?,password = ?,email = ? where id =?";
		PreparedStatement ps = conn.prepareStatement(updateSql);
		
		ps.setString(1, user.getName());
		ps.setString(2, user.getPassword());
		ps.setString(3, user.getEmail());
		ps.setLong(4, user.getId());
		
		ps.execute();
	}
	/**
	 * 删除指定的用户信息
	 */
	@Override
	public void delete(Connection conn, User user) throws SQLException {
		PreparedStatement ps = conn.prepareCall("delete from tbl_user where id = ?");
		ps.setLong(1, user.getId());
		ps.execute();

	}

}
