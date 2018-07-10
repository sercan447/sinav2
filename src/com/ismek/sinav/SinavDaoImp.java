package com.ismek.sinav;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
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
	public void update(long id, Sinav sinavUpdate) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
