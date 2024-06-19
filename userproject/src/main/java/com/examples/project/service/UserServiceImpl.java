package com.examples.project.service;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import com.examples.project.dao.UserDao;
import com.examples.project.model.User;

public class UserServiceImpl implements UserService {

	
	@Override
	public boolean validateUser(User user) {
		// TODO Auto-generated method stub
		//boolean isFound = false;
		PreparedStatement pst = null;
		Statement st=null;
		Connection con = null;
		ResultSet rs = null;
	    boolean isFound=false;
		System.out.println(user.getUsername()+" "+user.getPassword());
		try {
			con = UserDao.getDatabaseConnection();
			st= con.createStatement();
			rs = st.executeQuery("select * from users");
			while (rs.next()) {
				if (rs.getString(1).equals(user.getUsername()) && rs.getString(2).equals(user.getPassword())) {
					isFound = true;
					System.out.println(rs.getString(1)+" "+rs.getString(2));
					break;
				}
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		System.out.println(isFound);
		return isFound;
	}

	@Override
	public User registerUser(User user) {
		// TODO Auto-generated method stub
		PreparedStatement pst = null;
		Connection con = null;
		ResultSet rs = null;
		int k=0;
		try {
			con = UserDao.getDatabaseConnection();
			String query = "insert into users values(?,?)";
			pst = con.prepareStatement(query);
			pst.setString(1, user.getUsername());
			pst.setString(2, user.getPassword());
			k = pst.executeUpdate();

		} catch (Exception e) {

		}
		if (k == 1)
			return user;
		else
			return null;
	}

}
