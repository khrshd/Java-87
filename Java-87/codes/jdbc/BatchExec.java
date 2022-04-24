package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDBConnection();
		
		Statement st = con.createStatement();
		
		con.setAutoCommit(false);
		
		st.addBatch("insert into emp values(111,'Employee-1',2500)");
		st.addBatch("insert into emp values(112,'Employee-2',3500)");
		//st.addBatch("insert into emp values(111,'Employee-3',4500)");
		st.addBatch("insert into emp values(113,'Employee-3',4500)");
		st.addBatch("update emp set sal=5000");
		
		try {
			int[] rowsAffected = st.executeBatch();
			for(int n : rowsAffected) {
				System.out.println("rows affected = " + n);
			}
			con.commit();
		}
		catch(Exception ex) {
			System.out.println(ex);
			con.rollback();
		}
		st.close();
		con.close();
	}

}
