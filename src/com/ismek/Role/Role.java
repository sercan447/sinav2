package com.ismek.Role;

import com.ismek.kullanici.*;
import com.ismek.kullanicitorole.KullaniciToRole;
import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;


@Entity(name = "tbl_Role")
@Table
public class Role {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "role_id")
    private long roleId;
    
    @Column(name = "roles")
    private String roles;

    @ManyToMany(cascade = CascadeType.ALL,mappedBy = "kullanici",fetch = FetchType.EAGER)
    private Set<KullaniciToRole> kullanicilar;

    public Role() {}

  

    public Set<KullaniciToRole> getKullanicilar() {
		return kullanicilar;
	}


	public void setKullanicilar(Set<KullaniciToRole> kullanicilar) {
		this.kullanicilar = kullanicilar;
	}



	public long getRoleId() {
        return roleId;
    }

    public void setRoleId(long roleId) {
        this.roleId = roleId;
    }

    public String getRoles() {
        return roles;
    }

    public void setRoles(String roles) {
        this.roles = roles;
    }

	
    
    
}


