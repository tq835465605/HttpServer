package com.foxhis.httpsever.resource;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("helloworld")
public class HelloWorldResource {

	private final static String REBACK="hello world";
	
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public String gethello(){
		return REBACK;
	}
}
