package com.ismek.kullanicitorole;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ismek.mulakat.Mulakat;

@Repository
@Transactional
public class KullaniciToRoleDaoImp  implements KullaniciToRoleDao{

	@Autowired
	private SessionFactory sessionFactory;
	
	@Override
	public long save(KullaniciToRole kullanicitorole) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public KullaniciToRole get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<KullaniciToRole> list() {
		Session session = sessionFactory.getCurrentSession();
		Criteria cr = session.createCriteria(KullaniciToRole.class);
		List<KullaniciToRole> kullaniciTorole = cr.list();
		return kullaniciTorole;
	}

	@Override
	public void update(long id, KullaniciToRole kullanicitorole) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<KullaniciToRole> getByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}

}
