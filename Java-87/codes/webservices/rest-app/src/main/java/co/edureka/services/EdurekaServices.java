package co.edureka.services;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;

@Path("/edureka")
public class EdurekaServices {
	@GET
	@Produces("text/html")
	public String localService() {
		return "<h2>India Customer Service Center</h2>";
	}

	@GET
	@Produces("text/html")
	@Path("/international")
	public String internationalService() {
		return "<h2>International Customer Service Center</h2>";
	}
	
	@GET
	@Produces("text/plain")
	@Path("/enquiry/{name}/{course}")
	public String enquiryByPathParameters(@PathParam("name") String name, @PathParam("course") String course) {
		//logic to get the course details
		String response = String.format("Hi %s,\nWe will be in touch with you with the %s course details", name, course);
		return response;
	}
	
	@GET
	@Produces("text/plain")
	@Path("/enquiry")
	public String enquiryByQueryParameters(@QueryParam("name") String name, @QueryParam("course") String course) {
		//logic to get the course details which we got with query parameters
		String response = String.format("Hi %s,\nPlease check the %s course details in your mail", name, course);
		return response;
	}	
}
