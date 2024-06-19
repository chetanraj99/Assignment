package com.examples.project.utilities;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnections {
	
	public static Connection getDbConnection() throws ClassNotFoundException, SQLException {
		Class.forName("oracle.jdbc.driver.OracleDriver");

		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid = "system";
		String pwd = "orcl";
		Connection con = DriverManager.getConnection(url, uid, pwd);
		return con;
	}

}
