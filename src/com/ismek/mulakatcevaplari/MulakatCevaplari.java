package com.ismek.mulakatcevaplari;


import com.ismek.kullanicitosinav.KullaniciToSinav;
import com.ismek.mulakat.Mulakat;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tbl_Mulakat_Cevaplari")
public class MulakatCevaplari implements Serializable {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="m_cevap_id")
    private int mCevapId;

    @Column(name="cevap")
    private String cevap;

    @OneToOne(fetch=FetchType.EAGER)
    @JoinColumn(name="kts_id")
    private KullaniciToSinav ktsId;

    @OneToOne(fetch= FetchType.EAGER)
    @JoinColumn(name="mulakat_id")
    private Mulakat mulakatId;


    public int getmCevapId() {
        return mCevapId;
    }

    public void setmCevapId(int mCevapId) {
        this.mCevapId = mCevapId;
    }

    public String getCevap() {
        return cevap;
    }

    public void setCevap(String cevap) {
        this.cevap = cevap;
    }

    public KullaniciToSinav getKtsId() {
        return ktsId;
    }

    public void setKtsId(KullaniciToSinav ktsId) {
        this.ktsId = ktsId;
    }

    public Mulakat getMulakatId() {
        return mulakatId;
    }

    public void setMulakatId(Mulakat mulakatId) {
        this.mulakatId = mulakatId;
    }
}
