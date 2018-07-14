package com.ismek.kullanici;

import java.util.List;

public interface KullaniciService {


	long save(Kullanici kullanici);

    Kullanici get(long id);

    List<Kullanici> listKullanici();

    void update(long id, Kullanici kullanici);

    void delete(long id);
    
    Kullanici login(String mail,String tcno);
	
}
