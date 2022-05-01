package co.edureka.web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;


//@WebFilter("/*")
public class MaintenanceFilter implements Filter {

	public void destroy() {
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		out.println("<p style=text-align:center;font-size:40px;color:red;line-height:3>");
		out.println("Server is under maintenance!!!<br>Will be up and running by 12.00PM</p>");
	}

	public void init(FilterConfig fConfig) throws ServletException {

	}

}
