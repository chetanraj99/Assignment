package jdbcdemo;

import java.sql.*;

public class TestJdbc {

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
		String query = "select * from emp";
		ResultSet rs = st.executeQuery(query);
		
		
		//5. Fetch the results and Process it
		while(rs.next()) {
			System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
		}
		
		
		// 6. close the objects
		rs.close();
		st.close();
		con.close();

	}

}
