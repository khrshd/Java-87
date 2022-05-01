package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception {
		/*
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","root");
		*/
		
		Connection con = ConnectionFactory.getDBConnection();
		Statement st = con.createStatement();
		
		
		String sql = "insert into emp values(106, 'Srinivas', 2500.5)";
		/*
		String sql = "insert into emp(empno, ename, sal) values(102, 'Anil', 2500.5),"
				+ "(103, 'Praveen', 3500.5), (104,'Pankaj',3250),"
				+ "(105,'Sanjay',5500)";
		*/
		try {
			int rowsInserted = st.executeUpdate(sql);
			System.out.println("Employes Saved -> " + rowsInserted);
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.toString());
		}
		
		st.close();
		con.close();
	}

}
