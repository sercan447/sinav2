package com.ismek.kullanicitorole;

import java.util.Set;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ismek.Role.Role;
import com.ismek.kullanici.Kullanici;

@Entity
@Table(name="tbl_KullaniciToRole")
public class KullaniciToRole {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ktr_id")
	private long ktrId;
	
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="kullanici_id")
	@JsonIgnore
	private Kullanici kullanici;
	
	@ManyToOne
	@JoinColumn(name="role_id")
	@JsonIgnore
	private Role role;

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

	public Role getRole() {
		return role;
	}

	public void setRole(Role role) {
		this.role = role;
	}
	
	

	
	

}
