package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws ClassNotFoundException, 
	SQLException {
		// TODO Auto-generated method stub
		
		// 1. Loading the Driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Establish the connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid="system";
		String pwd="orcl";
		Connection con = DriverManager.getConnection(url,uid,pwd);
		
		
		//3. Create the Statement Object
		Statement st = con.createStatement();
		
		//4. WRite the query and execute it
		String query = "create table posts(pid number(4), title varchar(20), author varchar(20))";
		st.executeUpdate(query);
		System.out.println("Table Created....");
		
			
		// 6. close the objects
		st.close();
		con.close();

	}

}
