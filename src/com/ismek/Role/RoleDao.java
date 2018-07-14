package com.ismek.Role;

import java.util.List;


public interface RoleDao {

	
	long save(Role Role);
    Role get(long id);
    List<Role> list();
    void update(long id, Role Update);
    void delete(long id);
	
}
