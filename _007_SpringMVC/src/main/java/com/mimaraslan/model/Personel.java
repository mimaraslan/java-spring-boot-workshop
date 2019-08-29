package com.mimaraslan.model;

import org.codehaus.jackson.annotate.JsonAutoDetect;

@JsonAutoDetect
public class Personel {
	
	int id;
	String adi;
	
	public Personel() {
		this.id = 1;
		this.adi = "PersonelAdi";
	}
	
	public Personel(int id, String adi) {
		this.id = id;
		this.adi = adi;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAdi() {
		return adi;
	}

	public void setAdi(String adi) {
		this.adi = adi;
	}

	@Override
	public String toString() {
		return "Personel [id=" + id + ", adi=" + adi + "]";
	}
	

}
