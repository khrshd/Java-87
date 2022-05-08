package co.edureka.ems.services;

import co.edureka.ems.entity.Employee;

public interface EmployeeService {
	public void saveEmployee(Employee emp);
	
	public void updateEmployee(Employee emp);
	
	public void deleteEmployee(Integer eno);
	
	public Employee searchEmployeeByNo(Integer eno);
	
	public void getAllEmployees();
}
