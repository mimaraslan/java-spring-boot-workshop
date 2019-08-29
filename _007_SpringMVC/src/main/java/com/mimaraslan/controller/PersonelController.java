package com.mimaraslan.controller;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.mimaraslan.model.Personel;


// http://localhost:8080/_006_SpringMVC/personel
@Controller
@RequestMapping("/personel")
public class PersonelController {
	
	static Set<Personel> personeller;
	
	static {
		// TODO burasi listede olabilirdi.
		personeller = new HashSet<Personel>();
		
		Personel personel = null;
		
		for (int i = 1; i < 10; i++) {
			personel = new Personel(i, 	"personel "+i);
			personeller.add(personel);
		}
		
	}
	
	// http://localhost:8080/_006_SpringMVC/personel/listele	
	@RequestMapping(value = "/listele", method = RequestMethod.GET, headers ="Accept=application/json", produces= "application/json")
	@ResponseBody
	public Set<Personel> getPersonelListesi() {
		
		return personeller;
		
	}

}
