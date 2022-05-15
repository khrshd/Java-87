<%!
 String uid, pwd;
%>
<h2>
<%
 uid = request.getParameter("txt_uid");
 pwd = request.getParameter("txt_pwd");
 
 out.println("User Name = " + uid + "<br>");
 out.println("Password = " + pwd);
%>
<hr>

Server Name = <%=request.getServerName()%> <br>
Server Port = <%=request.getServerPort() %> <br>
Method = <%=request.getMethod() %> <br>
URL = <%=request.getRequestURL() %> <br>
URI = <%=request.getRequestURI() %> <br> 
<hr>

Content Type = <%=request.getContentType() %> <br>
Content Size = <%=request.getContentLength() %>
</h2>