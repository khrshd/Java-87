package co.edureka.ems;

import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.entity.Employee;
import co.edureka.ems.services.EmployeeService;

public class EMSApp {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");		
		EmployeeService service = (EmployeeService)context.getBean("employee-service");
		
		while(true)
		{
			System.out.println("1. Save Employee");
			System.out.println("2. Update Employee");
			System.out.println("3. Search Employee");
			System.out.println("4. Delete Employee");
			System.out.println("5. All Employees");
			System.out.println("6. Exit");
			
			System.out.println("-----------------------------------------------------------------");
			
			System.out.print("enter an option: ");
			int opt = sc.nextInt();		
			
			switch(opt) {
			 case 1:
			   Employee emp = createEmployee();	
			   service.saveEmployee(emp);
			   break;
			 case 2:
				// logic employee updation 
				break;
			 case 3:
				System.out.print("search employee with employee no: ");
				int eno = sc.nextInt();
				Employee em = service.searchEmployeeByNo(eno);
				if(em != null)
					System.out.println(em);
				else
					System.out.println("$$$--- NO MATCHING EMPLOYEE WITH EMPNO -> "+ eno + " ---$$$");
				break;
			 case 4:
				System.out.print("delete employee with employee no: ");
				eno = sc.nextInt();
				service.deleteEmployee(eno);				 
				break;
			 case 5:
				service.getAllEmployees(); 
				break;
			 case 6:
				System.out.println("**** BYE **** BYE ****");
				sc.close();
				System.exit(0);
				break;
			 default:
				System.out.println("**** INVALID OPTION **** TRY AGAIN ****"); 
				break;						   
			}//switch
			System.out.println("=================================================================");
		}//while
	}//main
	
	private static Employee createEmployee() {
		System.out.print("enter employee no: ");
		int eno = sc.nextInt();
		
		System.out.print("enter employee name: ");
		String name = sc.next();
		
		System.out.print("enter employee salary: ");
		float sal = sc.nextFloat();
		
		return new Employee(eno, name, sal);
	}	



}
