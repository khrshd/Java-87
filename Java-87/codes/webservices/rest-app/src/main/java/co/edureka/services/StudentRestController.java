package co.edureka.services;

import javax.ws.rs.FormParam;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

@Path("/student")
public class StudentRestController {
	@POST
	@Produces("text/plain")
	@Path("/register")
	public String registerStudent(@FormParam("name_field") String name, @FormParam("age_field") Integer age, 
												@FormParam("addr_field") String address) {
		System.out.println("Name: "+ name);
		System.out.println("Age: " + age);
		System.out.println("Address: " + address);
		//logic to save student data in db
		String response = "Student Registration Success";
		return response;
	}
}
