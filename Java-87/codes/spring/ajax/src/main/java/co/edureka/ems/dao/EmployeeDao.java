package co.edureka.ems.dao;


import co.edureka.ems.entity.Employee;

public interface EmployeeDao {	
	Employee findEmployeeByEmpNo(Integer eno);	
}
