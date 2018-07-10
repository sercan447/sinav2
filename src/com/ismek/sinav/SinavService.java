package com.ismek.sinav;

import java.util.List;

public interface SinavService {
	
	long save(Sinav sinav);
    Sinav get(long id);
    List<Sinav> list();
    void update(long id, Sinav sinavUpdate);
    void delete(long id);

}
