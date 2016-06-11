package com.dao;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.bean.User;

public class DAO {

	/**
	 * 查询数据
	 * 
	 * @return
	 */
	public List<User> query() {
		Statement st = null;
		ResultSet rs = null;
		List<User> list = new ArrayList<User>();
		try {
			st = new Util().getConnection().createStatement();
			rs = st.executeQuery("select * from user;");
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				list.add(user);

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return list;
	}

	/**
	 * 添加数据
	 * 
	 * @param username
	 * @param password
	 */
	public void add(String username, String password) {

		try {
			System.out.println(username + ";" + password);
			Util u = new Util();
			Connection conn = u.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate("insert into user(username,password) values('" + username + "','" + password + "');");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * 更新数据
	 * 
	 * @param id
	 * @param username
	 * @param password
	 */
	public void update(int id, String username, String password) {
		try {
			Util u = new Util();
			Connection conn = u.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate(
					"update user set username='" + username + "', password='" + password + "' where id=" + id + ";");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	/**
	 * 删除数据
	 * 
	 * @param id
	 */
	public void delete(int id) {
		try {
			Util u = new Util();
			Connection conn = u.getConnection();
			Statement st = conn.createStatement();
			st.executeUpdate("delete from user where id=" + id + ";");
		} catch (Exception e) {
			e.printStackTrace();

		}

	}

	/**
	 * 根据id查询数据
	 * 
	 * @param id
	 * @return
	 */
	public User findUserById(int id) {
		Statement st = null;
		ResultSet rs = null;
		User user = new User();

		try {
			st = new Util().getConnection().createStatement();
			rs = st.executeQuery("select * from user where id=" + id + ";");
			while (rs.next()) {
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

		return user;
	}

	/**
	 * 登陆操作
	 * 
	 * @param username
	 * @param password
	 * @return
	 */
	public List<User> login(String username, String password) {
		List<User> list = new ArrayList<User>();
		try {
			Util u = new Util();
			Connection conn = u.getConnection();
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(
					"select * from user where username='" + username + "' and password='" + password + "';");
			while (rs.next()) {
				User user = new User();
				user.setId(rs.getInt("id"));
				user.setUsername(rs.getString("username"));
				user.setPassword(rs.getString("password"));
				list.add(user);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		return list;
	}

	public static void main(String[] args) {
		DAO dao = new DAO();
		// List<User> list = dao.query();
		// System.out.println(list.size());
		// dao.add("username", "password");
		// dao.update(23, "username", "123456abcde");
		dao.delete(23);

	}

}
