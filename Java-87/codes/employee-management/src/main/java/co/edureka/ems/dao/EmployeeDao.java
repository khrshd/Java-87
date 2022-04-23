package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.dto.Employee;

public interface EmployeeDao {
	public Integer saveEmployee(Employee emp) throws Exception;
	
	public Integer updateEmployee(Employee emp) throws Exception;
	
	public Integer deleteEmployee(Integer eno) throws Exception;
	
	public Employee findEmployeeByNo(Integer eno) throws Exception;
	
	public List<Employee> findAllEmployees() throws Exception;
}
