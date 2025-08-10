import java.sql.*;

public class DAOClass {
	Connection conn;

	    public DAOClass() throws Exception {
	        Class.forName("oracle.jdbc.driver.OracleDriver"); 
	        conn = DriverManager.getConnection("jdbc:oracle:thin:@//localhost:1521/xe", "hr", "hr");
	    }

	    public void insert(int roll, String name, String course, String doj, double fees) throws Exception {
	        String sql = "INSERT INTO students VALUES (?, ?, ?, ?, ?)";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        pst.setInt(1, roll);
	        pst.setString(2, name);
	        pst.setString(3, course);
	        pst.setDate(4, Date.valueOf(doj));
	        pst.setDouble(5, fees);
	        pst.executeUpdate();
	        System.out.println("Record inserted.");
	    }

	    public void delete(int roll) throws Exception {
	        String sql = "DELETE FROM students WHERE rollno = ?";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        pst.setInt(1, roll);
	        pst.executeUpdate();
	        System.out.println("Record deleted.");
	    }

	    public void modify(int roll, double newFees) throws Exception {
	        String sql = "UPDATE students SET fees = ? WHERE rollno = ?";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        pst.setDouble(1, newFees);
	        pst.setInt(2, roll);
	        pst.executeUpdate();
	        System.out.println("Record updated.");
	    }

	    public void display(int roll) throws Exception {
	        String sql = "SELECT * FROM students WHERE rollno = ?";
	        PreparedStatement pst = conn.prepareStatement(sql);
	        pst.setInt(1, roll);
	        ResultSet rs = pst.executeQuery();
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDate(4) + " " + rs.getDouble(5));
	        }
	    }

	    public void displayAll() throws Exception {
	        String sql = "SELECT * FROM students";
	        Statement stmt = conn.createStatement();
	        ResultSet rs = stmt.executeQuery(sql);
	        while (rs.next()) {
	            System.out.println(rs.getInt(1) + " " + rs.getString(2) + " " + rs.getString(3) + " " + rs.getDate(4) + " " + rs.getDouble(5));
	        }
	    }
	}
