package com.ismek.kullanicitorole;

import java.util.Set;

import javax.persistence.*;

import com.ismek.Role.Role;
import com.ismek.kullanici.Kullanici;

@Entity
@Table(name="tbl_KullaniciToRole")
public class KullaniciToRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="ktr_id")
	private long ktrId;
	
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="kullanici_id")
	private Kullanici kullanici;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	@JoinColumn(name="role_id")
	private Role roleId;

	public long getKtrId() {
		return ktrId;
	}

	public void setKtrId(long ktrId) {
		this.ktrId = ktrId;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullaniciId(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public Role getRoleId() {
		return roleId;
	}

	public void setRoleId(Role roleId) {
		this.roleId = roleId;
	}
	
	

	
	

}
