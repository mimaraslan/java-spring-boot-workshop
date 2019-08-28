package com.mimaraslan.service;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.mimaraslan.model.Kullanici;

@Path("/kullanici")
public class KullaniciServis {
	
	// http://localhost:8080/_005_RESTfulJacksonJSON/rest/kullanici/bilgi/1/Cumali/Kızıl.xml

	
	/**
	 * 
	 * @author lolo
	 * @param id
	 * @param adi
	 * @since 2019
	 */
	@GET
	@Path("/bilgi/{id}/{adi}/{soyadi}.xml")
	@Produces(MediaType.APPLICATION_XML)
	public Response getKullaniciBilgisiXml(
			@PathParam("id") Integer id,
			@PathParam("adi") String adi,
			@PathParam("soyadi") String soyadi
			) {
		
		Kullanici kullaniciNesnesi = new Kullanici();
		
		kullaniciNesnesi.setKullaniciId(id);
		kullaniciNesnesi.setKullaniciAdi(adi);
		kullaniciNesnesi.setKullaniciSoyadi(soyadi);
		
		return Response.status(200).entity(kullaniciNesnesi).build();
	}

	// http://localhost:8080/_005_RESTfulJacksonJSON/kullanici/bilgi/1/Cumali/Kızıl.json
	@GET
	@Path("/bilgi/{id}/{adi}/{soyadi}.json")
	//@Produces (MediaType.APPLICATION_JSON + ";charset=utf-8")
    @Produces ("application/json"+";charset=utf-8")	
	public Response getKullaniciBilgisiJson(
			@PathParam("id") Integer id,
			@PathParam("adi") String adi,
			@PathParam("soyadi") String soyadi
			) {
		
		Kullanici kullaniciNesnesi = new Kullanici();
		
		kullaniciNesnesi.setKullaniciId(id);
		kullaniciNesnesi.setKullaniciAdi(adi);
		kullaniciNesnesi.setKullaniciSoyadi(soyadi);
		
		return Response.status(200).entity(kullaniciNesnesi).build();
	}
	
	
	
	// http://localhost:8080/_005_RESTfulJacksonJSON/kullanici/bilgi/1/Cumali/Kızıl

	@GET
	@Path("/bilgi/{id}/{adi}/{soyadi}")
	@Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
	public Response getKullaniciBilgisiXmlJson(
			@PathParam("id") Integer id, 
			@PathParam("adi") String adi,
			@PathParam("soyadi") String soyadi
			) {
		
		Kullanici kullaniciNesnesi = new Kullanici();
		
		kullaniciNesnesi.setKullaniciId(id);
		kullaniciNesnesi.setKullaniciAdi(adi);
		kullaniciNesnesi.setKullaniciSoyadi(soyadi);
		
		return Response.status(200).entity(kullaniciNesnesi).build();
	}
	
	
}
