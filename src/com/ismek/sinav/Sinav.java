	package com.ismek.sinav;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.ismek.Brans.Brans;
import com.ismek.kullanici.Kullanici;
import com.ismek.sorular.Sorular;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;
import java.util.Set;

@Entity
@Table(name="tbl_Sinav")
public class Sinav implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="sinav_id",nullable=false)
    private long sinavId;

    @Column(name="sinav_adi",nullable=false)
    @Size(min = 2,max =25 ,message = "2 arası 25 karakterden fazla giremezsiniz ")
    private String sinavAdi;

    @CreationTimestamp
    @JsonFormat(pattern = "YYYY-MM-dd")
    @Column(name="sinav_tarihi",nullable=false)
    private Date sinavTarihi;

    @Column(name="sinav_suresi",nullable=false)
    private int sinavSuresi;

    @Column(name="soru_sayisi",nullable=false)
    private int soruSayisi;

    @Temporal(value = TemporalType.TIME)
    @Column(name="bs_saati")
    private Date bsSaati;

    @Column(name="sinav_salonu")
    private String sinavSalonu;

    @Column(name="katki_yuzdesi")
    private float katkiYuzdesi;

    @Temporal(value = TemporalType.DATE)
    @Column(name="olusturma_tarihi")
    @JsonFormat(pattern = "YYYY-MM-dd")
    private Date olusturmaTarihi;
    
    @Column(name="is_aktif")
    private boolean isAktif;


   
    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ogretmen_id")
    //@JsonIgnore
    private Kullanici ogretmenId;
	
	@ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="brans_id")
	//@JsonBackReference
	private Brans bransId;

	    
	    
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "tbl_SinavToSorular", joinColumns = @JoinColumn(name = "soru_id"),inverseJoinColumns = @JoinColumn(name = "sinav_id"))
   // @JsonBackReference
    private Set<Sorular> sorulars;

	public long getSinavId() {
		return sinavId;
	}

	public void setSinavId(long sinavId) {
		this.sinavId = sinavId;
	}

	public String getSinavAdi() {
		return sinavAdi;
	}

	public void setSinavAdi(String sinavAdi) {
		this.sinavAdi = sinavAdi;
	}

	public Date getSinavTarihi() {
		return sinavTarihi;
	}

	public void setSinavTarihi(Date sinavTarihi) {
		this.sinavTarihi = sinavTarihi;
	}

	public int getSinavSuresi() {
		return sinavSuresi;
	}

	public void setSinavSuresi(int sinavSuresi) {
		this.sinavSuresi = sinavSuresi;
	}

	public int getSoruSayisi() {
		return soruSayisi;
	}

	public void setSoruSayisi(int soruSayisi) {
		this.soruSayisi = soruSayisi;
	}

	public Date getBsSaati() {
		return bsSaati;
	}

	public void setBsSaati(Date bsSaati) {
		this.bsSaati = bsSaati;
	}

	public String getSinavSalonu() {
		return sinavSalonu;
	}

	public void setSinavSalonu(String sinavSalonu) {
		this.sinavSalonu = sinavSalonu;
	}

	public float getKatkiYuzdesi() {
		return katkiYuzdesi;
	}

	public void setKatkiYuzdesi(float katkiYuzdesi) {
		this.katkiYuzdesi = katkiYuzdesi;
	}

	public Date getOlusturmaTarihi() {
		return olusturmaTarihi;
	}

	public void setOlusturmaTarihi(Date olusturmaTarihi) {
		this.olusturmaTarihi = olusturmaTarihi;
	}

	public Kullanici getOgretmenId() {
		return ogretmenId;
	}

	public void setOgretmenId(Kullanici ogretmenId) {
		this.ogretmenId = ogretmenId;
	}

	public boolean isAktif() {
		return isAktif;
	}

	public void setAktif(boolean isAktif) {
		this.isAktif = isAktif;
	}

	public Brans getBransId() {
		return bransId;
	}

	public void setBransId(Brans bransId) {
		this.bransId = bransId;
	}

	public Set<Sorular> getSorulars() {
		return sorulars;
	}

	public void setSorulars(Set<Sorular> sorulars) {
		this.sorulars = sorulars;
	}


}
