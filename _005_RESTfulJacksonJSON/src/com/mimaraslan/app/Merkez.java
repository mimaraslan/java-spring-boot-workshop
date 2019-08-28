package com.mimaraslan.app;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//import com.sun.jersey.api.client.Client;
//import com.sun.jersey.api.client.ClientResponse;
//import com.sun.jersey.api.client.WebResource;

// TODO  bu kismi kodlamayi unutma
public class Merkez {

	public static void main(String[] args) {

		int id = 1;
		String adi = "Cumali";
		String soyadi = "KIZIL";
		// http://localhost:8080/_005_RESTfulJacksonJSONServer/kullanici/bilgi/1/Cumali/Kızıl
	
		try {
			
			URL url = new URL("http://localhost:8080/_005_RESTfulJacksonJSONServer/rest/kullanici/bilgi/"+id+"/"+adi+"/"+soyadi);
			//URL url = new URL("http://localhost:8080/_005_RESTfulJacksonJSONServer/rest/kullanici/bilgi/1/Cumali/Kizil");

			HttpURLConnection connection = (HttpURLConnection) url.openConnection();
			connection.setRequestMethod("GET");
			connection.setRequestProperty("Accept", "application/json"+";charset=utf-8");
			
			if (connection.getResponseCode() != 200) {
				throw new RuntimeException(" GELEN HTTP CODE : " + connection.getResponseCode());
			}
			
			
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(connection.getInputStream()));
			String sonuc = bufferedReader.readLine();
			System.out.println(sonuc);
	
			
			connection.disconnect();
			
		} catch (MalformedURLException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		/*
		try {
			Client client = Client.create();
			WebResource resource = client.resource("http://localhost:8080/_005_RESTfulJacksonJSONServer/kullanici/bilgi/"+id+"/"+adi+"/"+soyadi);
			ClientResponse response = resource.accept("application/xml").get(ClientResponse.class);
			
			if (response.getStatus() != 200) {
				throw new RuntimeException("GELEN HTTP CODE: "+response.getStatus());
			}else {
				String sonuc = response.getEntity(String.class);
				System.out.println(sonuc);
			}
			
			
			
		} catch (Exception e) {
			System.err.println("HATA: "+ e);
			e.printStackTrace();
		}
		*/
	}
}













