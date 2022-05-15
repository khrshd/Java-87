package co.edureka.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import co.edureka.bindings.Employee;

@Path("/edureka/employee")
public class EmployeeRestController {
 @GET
 @Produces("application/json")
 @Path("/{empid}")
 public Employee findEmployeeById(@PathParam("empid") Integer empid) {
	 //logic to get employee details of employee with specific id from db
	 Employee emp = new Employee();
	 
	 emp.setEmployeeNo(empid);
	 emp.setEmployeeName("Sunil Joseph");
	 emp.setEmployeeSalary(75000.50f);
	 
	 return emp;
 }
 
 @GET
 @Produces("application/json")
 @Path("/all")
 public List<Employee> getAllEmployees() 
 {
    ArrayList<Employee> employeesList = new ArrayList<Employee>();
     	     
    employeesList.add(new Employee(101, "Sunil Joseph", 2500f));
    employeesList.add(new Employee(201, "Anirudh", 3500f));
    employeesList.add(new Employee(301, "Jefferey", 4500f));	     
 	    
    return employeesList;
 }
}
