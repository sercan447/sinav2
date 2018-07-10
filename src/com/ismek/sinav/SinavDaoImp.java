package com.ismek.sinav;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
@Transactional
public class SinavDaoImp implements SinavDao{

	
	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public long save(Sinav sinav) {
	sessionfactory.getCurrentSession().save(sinav);
		return sinav.getSinavId();
	}

	@Override
	public Sinav get(long id) {
		
		return sessionfactory.getCurrentSession().get(Sinav.class,id);
	}

	@Override
	public List<Sinav> list() {
		
		Session session = sessionfactory.getCurrentSession();
		Criteria cr = session.createCriteria(Sinav.class);
		List<Sinav> sinavlist = cr.list();
		return sinavlist;
	}

	@Override
	public void update(long id, Sinav update) {
		
		Session session = sessionfactory.getCurrentSession();
		Sinav sinav2 = session.load(Sinav.class, id);
		
		try {

		sinav2.setAktif(update.isAktif());
		sinav2.setBransId(update.getBransId());
		sinav2.setBsSaati(update.getBsSaati());
		sinav2.setKatkiYuzdesi(update.getKatkiYuzdesi());
		sinav2.setOgretmenId(update.getOgretmenId());
		sinav2.setOlusturmaTarihi(update.getOlusturmaTarihi());
		sinav2.setSinavAdi(update.getSinavAdi());
		sinav2.setSinavSalonu(update.getSinavSalonu());
		sinav2.setSinavSuresi(update.getSinavSuresi());
		sinav2.setSinavTarihi(update.getSinavTarihi());
		sinav2.setSorulars(update.getSorulars());
		sinav2.setSoruSayisi(update.getSoruSayisi());
		
		
		}catch(Exception e) {
			
		}finally {
			session.flush();
		}
		
		
	}

	@Override
	public void delete(long id) {
		Session session = sessionfactory.getCurrentSession();
		Sinav sinav = session.load(Sinav.class, id);
		
		session.delete(sinav);
		session.flush();
	}

}
