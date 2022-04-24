package co.edureka.jdbc;

import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.Types;

public class ProcedureCall {

	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDBConnection();
		
		CallableStatement cst = con.prepareCall("{call hike_salary(?,?,?)}");
		
		int empno = 101;
		int hike = 10;
		
		cst.setInt(1, empno);
		cst.setInt(2, hike);
		cst.registerOutParameter(3, Types.FLOAT);
		
		cst.execute();
		
		float hikedSal = cst.getFloat(3);
		System.out.println("Updated Salary of Employee with empno:"+empno+" = "+hikedSal);
		
		cst.close();
		con.close();
	}

}
