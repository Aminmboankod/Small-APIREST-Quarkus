package edu.craptocraft;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.eclipse.microprofile.config.inject.ConfigProperty;

@Path("/hello")
public class HelloResource {

    @ConfigProperty(name = "greetings.message")
    String msg;

    @GET
    @Produces(MediaType.TEXT_PLAIN)
    public String hello() {
        return msg;
    }
}