package myjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class OracleConnection {
	public static void main(String[] args) {
		Connection conn = null;
		
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			
			String url = "jdbc:oracle:thin:@localhost:1521/xe";
			String username = "hr";
			String password = "hr";
			
			conn  = DriverManager.getConnection(url,username,password);
			System.out.println("Connection Established");
		}
		
		catch(ClassNotFoundException e){
			System.out.println("Oracle JDBC Driver not found.");
			e.printStackTrace();
		}catch(SQLException e) {
			System.out.println("Connection could not be established.");
			System.out.println("Error: " + e.getMessage());
		}finally {
			try {
				 if (conn != null) conn.close();
			}catch(SQLException e) {
                e.printStackTrace();
            }
		}
	}
}
