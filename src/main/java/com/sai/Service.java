package com.sai;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.FormParam;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;
import javax.xml.bind.annotation.XmlAccessorType;

@Path("/myapp")
public class Service {
	private NameService nameService;
	private PersonService personService;

	@Produces({ "application/json" } )
	@GET
	@Path("/nameservice")
	public String getName(@QueryParam("id") @DefaultValue("1") int id) {
		return nameService.getName(id);
	}

	@PUT
	@Path("/nameservice")
	public void addName(@FormParam("name") String name) {
		nameService.addName(name);
	}
	
	@Produces({ "application/json" } )
	@GET
	@Path("/nameservice/listAll")
	public String listAllNames(){
		return nameService.listAllNames();
	}
	
	@Produces({ "application/json" } )
	@GET
	@Path("/personservice")
	public Person getPerson(@QueryParam("key") @DefaultValue("1") int id) {
		return personService.getName(id);
	}

	@PUT
	@Path("/personservice")
	public Response addPerson(@FormParam("name") String name,
			@FormParam("dateOfbirth") String dateOfbirth,
			@FormParam("mobile") String mobile,
			@FormParam("aadharNum") String aadharNum) {
		Person peson=new Person(name, dateOfbirth, mobile, aadharNum);
		personService.addName(peson);
		return Response.status(200).entity("new person is added").build();
		
	}
	
	@PUT
	@Path("/personservice/json")
	@Consumes({ "application/json" } )
	public Response addPersonJson(Person person) {
		personService.addName(person);
		return Response.status(200).entity("new person is added").build();
		
	}
	
	@Produces({ "application/json" } )
	@GET
	@Path("/personservice/listAll")
	public String listAllPersons(){
		return personService.listAllNames();
	}

	public NameService getNameService() {
		return nameService;
	}

	public void setNameService(NameService nameService) {
		this.nameService = nameService;
	}

	public PersonService getPersonService() {
		return personService;
	}

	public void setPersonService(PersonService personService) {
		this.personService = personService;
	}
}
