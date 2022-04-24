package co.edureka.ems.service;

import co.edureka.ems.dto.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp) throws Exception;
	
	public void updateEmployee(Employee emp) throws Exception;
	
	public void deleteEmployeeByNo(Integer eno) throws Exception;
	
	public Employee searchEmployeeByNo(Integer eno) throws Exception;
	
	public void getAllEmployees() throws Exception;
}
