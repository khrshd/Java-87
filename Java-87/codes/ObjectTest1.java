class Employee 
{
	int empno;
	String name;
	float sal;
	
	void setDetails(){
		name = "Praveen";
		sal = 5500f;
	}

	void getDetails(){
		System.out.println(empno + " | " + name + " | " +sal);
	}
}

class ObjectTest1
{
	public static void main(String[] args) 
	{
		//-- create an instance of Employee type
		Employee emp = new Employee();

		//-- get the state of instance by using reference
		System.out.println(emp.empno + " | " + emp.name + " | " + emp.sal);

		//-- get the state of instance using method
		emp.getDetails();

		//-- change the state of object using reference
		emp.empno = 101;
		emp.name = "Sunil Joseph";
		emp.sal = 2500f;

		emp.getDetails();

		//-- change the state of object using method
		emp.setDetails();
		emp.getDetails();
	}
}
