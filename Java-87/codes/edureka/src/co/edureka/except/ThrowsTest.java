package co.edureka.except;

import java.sql.SQLException;

public class ThrowsTest {

	public static void main(String[] args) throws Exception {
		BusinessLogic logic = new BusinessLogic();
		try {
			System.out.println(logic.getEmployeeById(101));
		}catch(Exception ex) {}
		
		System.out.println(logic.getEmployeeById(101));
	}

}
