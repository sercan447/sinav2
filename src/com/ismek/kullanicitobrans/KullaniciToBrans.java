package com.ismek.kullanicitobrans;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ismek.Brans.Brans;
import com.ismek.kullanici.Kullanici;

import java.util.*;

@Entity
@Table(name="tbl_KullaniciToBrans")
public class KullaniciToBrans {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="ktb_id")
	private long ktbId;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="kullanici_id")
	@JsonIgnore
	private Kullanici kullanici;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name="brans_id")
	@JsonBackReference
	private Brans brans;

	public long getKtbId() {
		return ktbId;
	}

	public void setKtbId(long ktbId) {
		this.ktbId = ktbId;
	}

	public Kullanici getKullanici() {
		return kullanici;
	}

	public void setKullanici(Kullanici kullanici) {
		this.kullanici = kullanici;
	}

	public Brans getBrans() {
		return brans;
	}

	public void setBrans(Brans brans) {
		this.brans = brans;
	}

	
	
	
	
}
