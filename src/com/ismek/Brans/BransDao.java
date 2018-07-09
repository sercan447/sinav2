package com.ismek.Brans;

import java.util.List;

public interface BransDao {

    long save(Brans brans);

    Brans get(long id);

    List<Brans> listBrans();

    void update(long id, Brans brans);

    void delete(long id);
	
    void addKullaniciToBrans(long kullaniciId, long bransId);

	void addSoruToBrans(long soruId, long bransId);
}
