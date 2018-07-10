package com.ismek.mulakatcevaplari;

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
public class MulakatCevaplariDaoImp implements MulakatCevaplariDao{

	@Autowired
	private SessionFactory sessionfactory;
	
	@Override
	public long save(MulakatCevaplari mulakat) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public MulakatCevaplari get(long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<MulakatCevaplari> list() {
		Session session = sessionfactory.getCurrentSession();
		Criteria cr = session.createCriteria(MulakatCevaplari.class);
		List<MulakatCevaplari> mulakatcevaplarilist = cr.list();
		return mulakatcevaplarilist;
	}

	@Override
	public void update(long id, MulakatCevaplari Update) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(long id) {
		// TODO Auto-generated method stub
		
	}

}
