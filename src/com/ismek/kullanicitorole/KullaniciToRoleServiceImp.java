package com.ismek.kullanicitorole;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class KullaniciToRoleServiceImp  implements KullaniciToRoleService{

	
	@Autowired
	private KullaniciToRoleDao kullaniciToRoleDao;
	
	@Override
	public long save(KullaniciToRole kullanicitorole) {
		
		return kullaniciToRoleDao.save(kullanicitorole);
	}

	@Override
	public KullaniciToRole get(long id) {
	
		return kullaniciToRoleDao.get(id);
	}

	@Override
	public List<KullaniciToRole> list() {
		
		return kullaniciToRoleDao.list();
	}

	@Override
	public void update(long id, KullaniciToRole kullanicitorole) {
		kullaniciToRoleDao.update(id, kullanicitorole);
		
	}

	@Override
	public void delete(long id) {
		kullaniciToRoleDao.delete(id);
		
	}

	@Override
	public List<KullaniciToRole> getByName(String name) {
		
		return kullaniciToRoleDao.getByName(name);
	}
	
	

}
