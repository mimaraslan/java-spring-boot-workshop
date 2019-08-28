package com.mimaraslan;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;


// http://localhost:8080/_004_RESTfulXml/rest/merkez
@Path(value = "/merkez")
public class Merkez {
	
	
	// http://localhost:8080/_004_RESTfulXml/rest/merkez/musteri/1
	@GET
	@Path(value = "/musteri/{id}")
	@Produces(MediaType.APPLICATION_XML)
	public Musteri getMusteriBilgi(@PathParam("id") int id) {

		// Servis.getFindMusId(id)
		
		Musteri musteriNesnesi = new Musteri();
		musteriNesnesi.setMusteriId(id);
		musteriNesnesi.setMusteriAdi("Hakan");
		musteriNesnesi.setMusteriSoyadi("Aydan");
			
		return musteriNesnesi;
	}
	
	
}
