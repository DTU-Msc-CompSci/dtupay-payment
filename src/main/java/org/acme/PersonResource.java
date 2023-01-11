package org.acme;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/person")
public class PersonResource {
	
	private PersonService service = new PersonService();
	
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPersonJson() {
    	return service.getPerson();
    }
    
    @GET
    @Produces(MediaType.APPLICATION_XML)
    public Person getPersonXml() {
    	return service.getPerson();
    }
    
    @PUT
    @Consumes(MediaType.APPLICATION_JSON)
    public void putPersonJSON(Person p) {
    	service.setPerson(p);
    }
    
    @PUT
    @Path("person")
    @Consumes(MediaType.APPLICATION_XML)
    public void putPersonXML(Person p) {
    	service.setPerson(p);
    }
}