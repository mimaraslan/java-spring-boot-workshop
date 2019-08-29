package com.mimaraslan.service;

import javax.inject.Inject;

import org.springframework.stereotype.Service;

import com.mimaraslan.model.Personel;


@Service
public class PersonelServis implements IPersonelServis {

	@Inject
	PersonelServis personelDao;
	
	@Override
	public String getPersonelAdi() {
		
		return personelDao.getPersonelAdi();
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
