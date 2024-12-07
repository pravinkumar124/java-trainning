package mysqltask;

	import java.sql.*;

	public class Q2 {
	    public static void main(String[] args) {
	        
	        String url = "jdbc:mysql://127.0.0.1:3306/EMPLOYEE"; 
	        String user = "root";  
	        String password = "Pravin@123";
	       
	        String insertQuery = "INSERT INTO Employee (empcod, empnam, empage, esalary) VALUES (?, ?, ?, ?)";
	        
	        try {
	          
	            Connection conn = DriverManager.getConnection(url, user, password);
	    
	            PreparedStatement stmt = conn.prepareStatement(insertQuery);
	            
	            stmt.setInt(1, 101);
	            stmt.setString(2, "Jenny");
	            stmt.setInt(3, 25);
	            stmt.setDouble(4, 20000.00);
	            stmt.executeUpdate();
	           
	            stmt.setInt(1, 102);
	            stmt.setString(2, "Jacky");
	            stmt.setInt(3, 20);
	            stmt.setDouble(4, 10000.00);
	            stmt.executeUpdate();

	            stmt.setInt(1, 103);
	            stmt.setString(2, "Joe");
	            stmt.setInt(3, 25);
	            stmt.setDouble(4, 40000.00);
	            stmt.executeUpdate();

	            stmt.setInt(1, 104);
	            stmt.setString(2, "John");
	            stmt.setInt(3, 40);
	            stmt.setDouble(4, 80000.00);
	            stmt.executeUpdate();

	            stmt.setInt(1, 105);
	            stmt.setString(2, "Shameer");
	            stmt.setInt(3, 25);
	            stmt.setDouble(4, 90000.00);
	            stmt.executeUpdate();

	            System.out.println("Employee data inserted successfully!");
	            conn.close();
	            
	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


