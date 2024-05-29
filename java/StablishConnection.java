import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

class SQLiteConnection {
    public static void main(String[] args) {
        // 1. Loading the Driver 
		Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//2. Establish the connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid="system";
		String pwd="orcl";
		Connection con = DriverManager.getConnection(url,uid,pwd);

        try{
            if (con != null) {
                System.out.println("Connected to the database");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
