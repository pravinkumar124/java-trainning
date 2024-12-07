package mysqltask;


	import java.sql.*;

	public class Q1 {
	    public static void main(String[] args) {
	    
	        String url = "jdbc:mysql://localhost:3306/EMPL";
	        String user = "root"; 
	        String password = "Pravin@123"; 
	        try {
	      
	            Connection conn = DriverManager.getConnection(url, user, password);
	    
	            String queryA = "SELECT ename, sal FROM Empl WHERE sal >= 2200";
	            Statement stmtA = conn.createStatement();
	            ResultSet rsA = stmtA.executeQuery(queryA);
	            System.out.println("Query A: Employees with salary >= 2200");
	            while (rsA.next()) {
	                System.out.println(rsA.getString("ename") + ": " + rsA.getDouble("sal"));
	            }
	          
	            String queryB = "SELECT * FROM Empl WHERE comm IS NULL";
	            Statement stmtB = conn.createStatement();
	            ResultSet rsB = stmtB.executeQuery(queryB);
	            System.out.println("\nQuery B: Employees not getting commission");
	            while (rsB.next()) {
	                System.out.println(rsB.getString("ename") + ": " + rsB.getString("job"));
	            }

	            String queryC = "SELECT ename, sal FROM Empl WHERE sal NOT BETWEEN 2500 AND 4000";
	            Statement stmtC = conn.createStatement();
	            ResultSet rsC = stmtC.executeQuery(queryC);
	            System.out.println("\nQuery C: Employees whose salary is not in the range 2500 to 4000");
	            while (rsC.next()) {
	                System.out.println(rsC.getString("ename") + ": " + rsC.getDouble("sal"));
	            }

	            String queryD = "SELECT ename, job, sal FROM Empl WHERE mgr IS NULL";
	            Statement stmtD = conn.createStatement();
	            ResultSet rsD = stmtD.executeQuery(queryD);
	            System.out.println("\nQuery D: Employees without a manager");
	            while (rsD.next()) {
	                System.out.println(rsD.getString("ename") + " - " + rsD.getString("job") + ": " + rsD.getDouble("sal"));
	            }
	            
	         String queryE = "SELECT ename FROM Empl WHERE ename LIKE '__A%'";
	            Statement stmtE = conn.createStatement();
	          ResultSet rsE = stmtE.executeQuery(queryE);
	           System.out.println("\nQuery E: Employees whose name contains 'A' as third alphabet");
	            while (rsE.next()) {
	                System.out.println(rsE.getString("ename"));
	            }

	         String queryF = "SELECT ename FROM Empl WHERE ename LIKE '%T'";
	           Statement stmtF = conn.createStatement();
	            ResultSet rsF = stmtF.executeQuery(queryF);
	          System.out.println("\nQuery F: Employees whose name ends with 'T'");
	            while (rsF.next()) {
	                System.out.println(rsF.getString("ename"));
	            }

	            conn.close();

	        } catch (SQLException e) {
	            e.printStackTrace();
	        }
	    }
	}


