<%@page import="java.util.Date" info="JSP example for page directive" %>
<h2 style="text-align:center">
<%
 Date today = new Date();
 out.println(today);
%>
</h2>
<h2>
<%=getServletInfo() %>
</h2>