<%!
  String name = "edureka";

  public int add(int x, int y){
	return x + y;
  }
%>
<h2>
<%
 out.println("My Name = " + name);
%>
<br>
<%
 out.println("Sum = " + add(10,12));
%>
</h2>