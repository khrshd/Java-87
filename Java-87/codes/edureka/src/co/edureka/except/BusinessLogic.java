package co.edureka.except;

import java.sql.SQLException;

public class BusinessLogic {
	public String getEmployeeById(Integer id) throws SQLException {
		//logic to get employee name from DB
		System.out.println("-- getting employee name for empno -> "+ id);
		return null;
	}
}
