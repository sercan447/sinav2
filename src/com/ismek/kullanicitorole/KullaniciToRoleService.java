package com.ismek.kullanicitorole;

import java.util.List;

public interface KullaniciToRoleService {
	
	
	long save(KullaniciToRole kullanicitorole);

	KullaniciToRole get(long id);

    List<KullaniciToRole> list();

    void update(long id, KullaniciToRole kullanicitorole);

    void delete(long id);
    
    List<KullaniciToRole> getByName(String name);

}
