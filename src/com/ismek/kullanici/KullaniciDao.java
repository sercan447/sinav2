package com.ismek.kullanici;

import java.util.List;


public interface KullaniciDao {

	long save(Kullanici kullanici);

    Kullanici get(long id);

    List<Kullanici> listKullanici();

    void update(long id, Kullanici kullanici);

    void delete(long id);
    
    List<Kullanici> getByName(String name);
    
    Kullanici login(String mail,String tcno);
	
}
