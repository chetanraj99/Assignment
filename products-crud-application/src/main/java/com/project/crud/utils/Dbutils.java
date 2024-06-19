package com.project.crud.utils;

import java.io.FileReader;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.util.Properties;

public class Dbutils {
	
	public static Connection getDatabaseConnection() {
		Connection con = null;
		Properties properties = new Properties();
		
		try {
			
			FileReader reader = new FileReader("c://data/db.properties");
			properties.load(reader);
			Class.forName(properties.getProperty("database.driver"));
			String url = properties.getProperty("database.url");
			String uid= properties.getProperty("database.username");
			String pwd=properties.getProperty("database.password");
			con = DriverManager.getConnection(url,uid,pwd);
		
		}
		catch(Exception e) {
			System.out.println(e);
		}
		return con;
	}


}
