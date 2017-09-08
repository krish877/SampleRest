package com.sai;

import javax.ws.rs.Consumes;
import javax.ws.rs.DefaultValue;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Response;

import org.apache.cxf.rs.security.cors.CrossOriginResourceSharing;

@Path("/myapp")
@CrossOriginResourceSharing(allowAllOrigins=true)
public class Service {
	private NameService nameService;
	private PersonService personService;
	private ContactService contactService;

	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	@GET
	@Path("/nameservice")
	public String getName(@QueryParam("id") @DefaultValue("1") int id) {
		return nameService.getName(id);
	}

	@PUT
	@Path("/nameservice")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public void addName(String name) {
		nameService.addName(name);
	}

	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	@GET
	@Path("/nameservice/listAll")
	public String listAllNames() {
		return nameService.listAllNames();
	}

	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	@GET
	@Path("/personservice")
	public Person getPerson(@QueryParam("key") @DefaultValue("1") int id) {
		return personService.getName(id);
	}

	@PUT
	@Path("/personservice")
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	public Response addPerson(Person person) {
		personService.addName(person);
		return Response.status(200).entity(person).build();
	}

	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	@GET
	@Path("/personservice/listAll")
	public String listAllPersons() {
		return personService.listAllNames();
	}
	
	@Consumes({ "application/json" })
	@Produces({ "application/json" })
	@GET
	@Path("/contactService")
	public Contact getContact(@QueryParam("name") @DefaultValue("1") String name){
		return contactService.getContact(name);
	}

	public ContactService getContactService() {
		return contactService;
	}

	public void setContactService(ContactService contactService) {
		this.contactService = contactService;
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
