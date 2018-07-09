package com.ismek.mulakat;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Table(name="tbl_Mulakat")
public class Mulakat implements Serializable {


    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Id
    @Column(name="mulakat_id")
    private int mulakatId;

    @Column(name="m_sorulari")
    private String mSorulari;

    public int getMulakatId() {
        return mulakatId;
    }

    public void setMulakatId(int mulakatId) {
        this.mulakatId = mulakatId;
    }

    public String getmSorulari() {
        return mSorulari;
    }

    public void setmSorulari(String mSorulari) {
        this.mSorulari = mSorulari;
    }
}
