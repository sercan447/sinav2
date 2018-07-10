package com.ismek.mulakatcevaplari;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MulakatCevaplariServiceImp implements MulakatCevaplariService{

	
	@Autowired
	private MulakatCevaplariDao mulakatCevaplariDao;	
	
	
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
		
		return mulakatCevaplariDao.list();
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
