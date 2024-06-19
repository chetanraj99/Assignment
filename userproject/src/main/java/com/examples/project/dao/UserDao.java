package com.examples.project.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class UserDao {
	
	public static Connection getDatabaseConnection() {
		Connection con = null;
		try {
			
			Class.forName("oracle.jdbc.driver.OracleDriver");
			String url = "jdbc:oracle:thin:@localhost:1521:orcl";
			String uid="system";
			String pwd="orcl";
			con = DriverManager.getConnection(url,uid,pwd);
		
		}
		catch(Exception e) {
			
		}
		return con;
	}

}
