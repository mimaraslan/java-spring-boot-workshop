package com.mimaraslan.dao;

import org.springframework.stereotype.Repository;

import com.mimaraslan.model.Personel;

@Repository
public class PersonelDao implements IPersonelDao {

	@Override
	public String getPersonelAdi() {
		return null;
	}

	@Override
	public Personel getPersonelGuncelle(Personel personel) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean getPersonelBilgisi(int personelId) {
		// TODO Auto-generated method stub
		return false;
	}

}
