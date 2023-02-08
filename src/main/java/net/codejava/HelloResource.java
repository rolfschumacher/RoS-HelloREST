package net.codejava;

import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;

@Path("/bonjour")
public class HelloResource {

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String direBonjour() {
		return "{\"name\":\"greeting\", \"message\":\"Bonjour tout le monde!\"}";	}
}
