package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class InsertData {

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
		String query = "insert into posts values(1002,'dotnet','kumar')";
		int k = st.executeUpdate(query);
		if(k>0)
			System.out.println("Record inserted...");
		else
			System.out.println("Record not inserted...");
		// 6. close the objects
		
		st.close();
		con.close();

	}

}
