package com.mimaraslan.dao;

import com.mimaraslan.model.Personel;

public interface IPersonelDao {
	
	public String getPersonelAdi();
	public Personel getPersonelGuncelle(Personel personel);
	
	public boolean getPersonelBilgisi(int personelId);
	

}
