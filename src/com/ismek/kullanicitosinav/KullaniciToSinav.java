package com.ismek.kullanicitosinav;

import com.ismek.kullanici.Kullanici;
import com.ismek.mulakatcevaplari.MulakatCevaplari;
import com.ismek.sinav.Sinav;

import javax.persistence.*;
import javax.validation.constraints.Max;
import java.io.Serializable;

@Entity
@Table(name="tbl_KullaniciToSinav")
public class KullaniciToSinav implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kts_id")
    private int ktsId;

    @Column(name="ogr_cevap")
    @Max(value=100)
    private String ogrCevap;

    @Column(name="is_onay")
    private boolean isOnay;

    @Column(name="is_durum")
    private boolean isDurum;

    @Column(name="m_puan")
    private int mPuan;

    @Column(name="sinav_puan")
    private int sinavPuan;

    @Column(name="ip_adresi")
    @Max(value=20)
    private String ipAdresi;

    @ManyToOne(cascade=CascadeType.ALL,fetch=FetchType.EAGER)
    @JoinColumn(name="kullanici_id")
    private Kullanici kullaniciId;

    @ManyToOne(cascade=CascadeType.ALL,	fetch=FetchType.EAGER)
    @JoinColumn(name="sinav_id")
    private Sinav sinavId;
    


    public int getKtsId() {
        return ktsId;
    }

    public void setKtsId(int ktsId) {
        this.ktsId = ktsId;
    }

    public String getOgrCevap() {
        return ogrCevap;
    }

    public void setOgrCevap(String ogrCevap) {
        this.ogrCevap = ogrCevap;
    }

    public boolean isOnay() {
        return isOnay;
    }

    public void setOnay(boolean onay) {
        isOnay = onay;
    }

    public boolean isDurum() {
        return isDurum;
    }

    public void setDurum(boolean durum) {
        isDurum = durum;
    }

    public int getmPuan() {
        return mPuan;
    }

    public void setmPuan(int mPuan) {
        this.mPuan = mPuan;
    }

    public int getSinavPuan() {
        return sinavPuan;
    }

    public void setSinavPuan(int sinavPuan) {
        this.sinavPuan = sinavPuan;
    }

    public String getIpAdresi() {
        return ipAdresi;
    }

    public void setIpAdresi(String ipAdresi) {
        this.ipAdresi = ipAdresi;
    }

    public Kullanici getKullaniciId() {
        return kullaniciId;
    }

    public void setKullaniciId(Kullanici kullaniciId) {
        this.kullaniciId = kullaniciId;
    }

    public Sinav getSinavId() {
        return sinavId;
    }

    public void setSinavId(Sinav sinavId) {
        this.sinavId = sinavId;
    }

    
    
}
