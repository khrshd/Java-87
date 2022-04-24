package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/form4")
public class FormServlet4 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<body bgcolor=pink>");		
		out.println("<h2>");
		
		out.println("Name = " + request.getParameter("t1")+"<br>");
		out.println("Age = " + request.getParameter("t2")+"<br>");
		out.println("Address = " + request.getParameter("t3")+"<br>");
		out.println("Experience = " + request.getParameter("t4")+"<br>");
		out.println("Prog. Languages = " + request.getParameter("t5")+"<br>");
		out.println("Salary = " + request.getParameter("t6")+"<br>");
		
		out.println("</h2></body>");
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
