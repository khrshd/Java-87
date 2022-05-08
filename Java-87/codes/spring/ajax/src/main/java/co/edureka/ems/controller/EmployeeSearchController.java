package co.edureka.ems.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.ems.entity.Employee;
import co.edureka.ems.services.EmployeeService;

public class EmployeeSearchController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private EmployeeService service = null;
	
	public void init(ServletConfig config) throws ServletException {
		ApplicationContext context = new ClassPathXmlApplicationContext("ems-beans.xml");
		service = (EmployeeService) context.getBean("employee-service");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("application/json");
		PrintWriter out = response.getWriter();
		
		Integer empno = Integer.parseInt(request.getParameter("eno"));
		
		Employee emp = service.searchEmployeeByNo(empno);
		
		if(emp != null) {
			String name= emp.getEmpName();
			Float sal = emp.getEmpSal();
			
			JSONObject obj = new JSONObject();
			obj.put("empname", name);
			obj.put("empsal", sal);
			
			out.print(obj);
		}
		else {
			out.print("");
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
