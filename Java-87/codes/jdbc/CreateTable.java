package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTable {

	public static void main(String[] args) throws Exception {
		//initialize JDBC driver of MySQL
		Class.forName("com.mysql.cj.jdbc.Driver");
		
		//connect to MySQL "edureka" Database
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","root");
		
		//create an object for passing SQL queries to connected DB
		Statement st = con.createStatement();
		
		//pass the SQL query to create a DB Table
		String sql = "create table emp(empno int, ename varchar(30), sal float(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println("Database Table Created!");
		}
		catch(Exception ex) {
			System.out.println("Error: " + ex.toString());
		}
		
		//close the connection with DB
		st.close();
		con.close();
	}
}
