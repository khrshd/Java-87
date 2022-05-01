<%!
  String name = "edureka";

  public int add(int x, int y){
	return x + y;
  }
%>
<h2>
 My Name = <%=name %>
<br>
<%="Sum = " + add(10,34) %>
</h2>