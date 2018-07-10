package com.ismek.mulakatcevaplari;

import java.util.List;


public interface MulakatCevaplariDao {


	long save(MulakatCevaplari mulakat);
	MulakatCevaplari get(long id);
    List<MulakatCevaplari> list();
    void update(long id, MulakatCevaplari Update);
    void delete(long id);
}
