package com.mimaraslan.service;

import com.mimaraslan.model.Personel;

public interface IPersonelServis {
	
	public String getPersonelAdi();
	public Personel getPersonelGuncelle(Personel personel);
	
	public boolean getPersonelBilgisi(int personelId);
	

}
