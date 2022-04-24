package co.edureka.ems.service;

import java.util.List;

import co.edureka.ems.dao.EmployeeDao;
import co.edureka.ems.dao.EmployeeDaoImpl;
import co.edureka.ems.dto.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	private static EmployeeDao dao = null;
	
	public EmployeeServiceImpl() throws Exception{
		dao = new EmployeeDaoImpl();
	}
	
	public void saveEmployee(Employee emp) throws Exception {
		Integer n = dao.saveEmployee(emp);
		if(n > 0)
			System.out.println("###--- Employee Saved ---###");
	}

	public void updateEmployee(Employee emp) throws Exception {
		Integer n = dao.updateEmployee(emp);
		if(n > 0)
			System.out.println("###--- Employee Updated ---###");
		else
			System.out.println("###--- No Employee to Update ---###");
	}

	public void deleteEmployeeByNo(Integer eno) throws Exception {
		Integer n = dao.deleteEmployee(eno);
		if(n > 0 )
			System.out.println("###--- Employee Deleted ---###");
		else
			System.out.println("###--- No Employee to Delete ---###");
	}

	public Employee searchEmployeeByNo(Integer eno) throws Exception {
		return dao.findEmployeeByNo(eno);
	}

	public void getAllEmployees() throws Exception {
		List<Employee> emps = dao.findAllEmployees();
		for(Employee emp : emps) {
			System.out.println(emp);
			Thread.sleep(1000);
		}
	}

}
