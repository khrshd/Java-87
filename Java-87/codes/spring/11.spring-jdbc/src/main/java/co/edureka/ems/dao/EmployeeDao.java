package co.edureka.ems.dao;

import java.util.List;

import co.edureka.ems.entity.Employee;

public interface EmployeeDao {
	Integer saveEmployee(Employee emp);
	
	Integer updateEmployee(Employee emp);
	
	Integer deleteEmployeeByEmpNo(Integer eno);
	
	Employee findEmployeeByEmpNo(Integer eno);
	
	List<Employee> findAllEmployees();
}
