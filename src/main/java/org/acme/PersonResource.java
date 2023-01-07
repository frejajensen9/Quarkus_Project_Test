package org.acme;

import data.Person;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("person")
public class PersonResource {

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Person getPerson() {
        Person person = new Person();
        person.setName("Freja");
        person.setAddress("Spaden");
        return person;
    }
}
