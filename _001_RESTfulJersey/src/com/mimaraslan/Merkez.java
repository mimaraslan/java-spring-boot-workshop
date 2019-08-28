package com.mimaraslan;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;


// http://localhost:8080/_001_RESTfulJersey/rest/merkez
@Path(value = "/merkez")
public class Merkez {
	
	
//	
//	GET    --- READ
//	POST   --- INSERT
//	PUT    --- UPDATE
//	DELETE --- DELETE
//	
	
	// http://localhost:8080/_001_RESTfulJersey/rest/merkez/sorgu1
	@GET
	@Path(value = "/sorgu1")
	public String metot1() {
		System.out.println("metot1");
		return "metot1";
	}
	
	
	// http://localhost:8080/_001_RESTfulJersey/rest/merkez/sorgu2
	@GET
	@Path(value = "/sorgu2")
	@Produces(MediaType.TEXT_PLAIN)
	public String metot2() {
		System.out.println("metot2");
		return "metot2";
	}
	
	
	// http://localhost:8080/_001_RESTfulJersey/rest/merkez/sorgu3
	@GET
	@Path(value = "/sorgu3")
	@Produces("text/html")
	public String metot3() {
		System.out.println("metot3");
		return "<h1>metot3</h1>";
	}
	
	
	
	// http://localhost:8080/_001_RESTfulJersey/rest/merkez/sorgu4/{benimParametrem}
	@GET
	@Path(value = "/sorgu4/{benimParametrem}")
	@Produces(MediaType.TEXT_XML)
	public Response metot4(@PathParam("benimParametrem") String benimParametrem) {
		System.out.println("metot4 gelen parametre: "+ benimParametrem);

		String sonuc = "<?xml version=\"1.0\"?> <mesaj>" +benimParametrem+"</mesaj>";
			
		return Response.status(200).entity(sonuc).build();
	}
	
	
			

}
