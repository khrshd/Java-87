package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {

	public static void main(String[] args)  throws Exception{
		Connection con = ConnectionFactory.getDBConnection();

		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");

		Scanner sc = new Scanner(System.in);

		String req = "Y";

		while (req.equalsIgnoreCase("Y"))
		{
			System.out.println("enter employee no, name & salary");
			int eno = sc.nextInt();
			String name = sc.next();
			float sal = sc.nextFloat();

			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);

			try {
				int rowsInserted = pst.executeUpdate();
				if (rowsInserted > 0)
					System.out.println("###--- Employee Saved ---###");
			} catch (Exception ex) {
				System.out.println("ERROR --> " + ex.getMessage());
			}
			System.out.println("-----------------------------------------------------------------");
			System.out.print("do you want to add more employee[Y/N]: ");
			req = sc.next();

			pst.clearParameters();
		}//while
		sc.close();
		pst.close();
		con.close();		

	}

}
