package com.ismek.Brans;

import com.fasterxml.jackson.annotation.JsonView;
import com.ismek.kullanici.Kullanici;
import com.ismek.sorular.Sorular;

import javax.persistence.*;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name="tbl_Brans")
public class Brans implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="brans_id")
    private long bransId;
    
 
    @Column(name="brans_adi")
    @Size(max =60 ,message = "2 arası 25 karakterden fazla giremezsiniz ")
    private String bransAdi;

    @Column(name="kontenjan")
    private int kontenjan;
    
   
    @ManyToMany(mappedBy = "branslar",fetch = FetchType.EAGER)
    private Set<Kullanici> kullanicilar;

    
    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
    @JoinTable(name = "tbl_BransToSorular", joinColumns = @JoinColumn(name = "soru_id"),
            inverseJoinColumns = @JoinColumn(name = "brans_id"))
    private Set<Sorular> sorulars;

    public Brans() {}
    
    public long getBransId() {
        return bransId;
    }

    public void setBransId(long bransId) {
        this.bransId = bransId;
    }

    public String getBransAdi() {
        return bransAdi;
    }

    public void setBransAdi(String bransAdi) {
        this.bransAdi = bransAdi;
    }

    public int getKontenjan() {
        return kontenjan;
    }

    public void setKontenjan(int kontenjan) {
        this.kontenjan = kontenjan;
    }

    public Set<Kullanici> getKullanicilar() {
        return kullanicilar;
    }

    public void setKullanicilar(Set<Kullanici> kullanicilar) {
        this.kullanicilar = kullanicilar;
    }

    public Set<Sorular> getSorulars() {
        return sorulars;
    }

    public void setSorulars(Set<Sorular> sorulars) {
        this.sorulars = sorulars;
    }

	
    
    
}
