import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.Scanner;

class UserAuthentication {
    public static void main(String[] args) {
        try{
        Class.forName("oracle.jdbc.driver.OracleDriver");
		
		//Establish the connection
		String url = "jdbc:oracle:thin:@localhost:1521:orcl";
		String uid="system";
		String pwd="orcl";
		Connection con = DriverManager.getConnection(url,uid,pwd);
        Statement stmt = con.createStatement();
            // Create table
            String createTableSQL = "CREATE TABLE IF NOT EXISTS User (" +
                                    "UserID TEXT PRIMARY KEY, " +
                                    "Password TEXT NOT NULL)";
            stmt.execute(createTableSQL);

            // Insert sample data
            if (!userExists(conn, "user1")) {
                String insertSQL = "INSERT INTO User (UserID, Password) VALUES (?, ?)";
                try (PreparedStatement pstmt = conn.prepareStatement(insertSQL)) {
                    pstmt.setString(1, "user1");
                    pstmt.setString(2, hashPassword("password1"));
                    pstmt.executeUpdate();
                }
            }

            // User authentication
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter User ID: ");
            String userID = scanner.nextLine();
            System.out.print("Enter Password: ");
            String password = scanner.nextLine();

            if (authenticateUser(conn, userID, password)) {
                System.out.println("Access granted");
            } else {
                System.out.println("Access denied");
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static boolean userExists(Connection conn, String userID) throws SQLException {
        String query = "SELECT 1 FROM User WHERE UserID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, userID);
            ResultSet rs = pstmt.executeQuery();
            return rs.next();
        }
    }

    private static boolean authenticateUser(Connection conn, String userID, String password) throws SQLException {
        String query = "SELECT Password FROM User WHERE UserID = ?";
        try (PreparedStatement pstmt = conn.prepareStatement(query)) {
            pstmt.setString(1, userID);
            ResultSet rs = pstmt.executeQuery();
            if (rs.next()) {
                String storedHash = rs.getString("Password");
                return storedHash.equals(hashPassword(password));
            } else {
                return false;
            }
        }
    }

    private static String hashPassword(String password) {
        try {
            MessageDigest md = MessageDigest.getInstance("SHA-256");
            byte[] hash = md.digest(password.getBytes());
            StringBuilder hexString = new StringBuilder();
            for (byte b : hash) {
                hexString.append(String.format("%02x", b));
            }
            return hexString.toString();
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }
}
