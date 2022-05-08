var xhr;

function getEmployeeDetails(empno)
{
  xhr = new XMLHttpRequest();
  
  xhr.open("GET", "searchemployee?eno="+empno, true); //GET-HTTP method, true=asynchronous communication  	
  
  xhr.onreadystatechange = stateChanged;
  
  xhr.send();
}

function stateChanged()
{
	document.getElementById("emp-name").innerHTML='';
	document.getElementById("emp-sal").innerHTML='';
	
  	if(xhr.readyState == 4 && xhr.status==200)
  	{
		var responseData = xhr.responseText;
		//alert(responseData);
		
		var responseObj = JSON.parse(responseData);
		
		var name = responseObj.empname;
		var sal = responseObj.empsal;
		
		document.getElementById("emp-name").innerHTML = name;
		document.getElementById("emp-sal").innerHTML = sal;
	}
}