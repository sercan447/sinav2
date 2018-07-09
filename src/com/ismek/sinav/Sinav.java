package com.ismek.sinav;

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
    private int sinavId;

    @Column(name="sinav_adi",nullable=false)
    @Size(min = 2,max =25 ,message = "2 arası 25 karakterden fazla giremezsiniz ")
    private String sinavAdi;

    @CreationTimestamp
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
    private Date olusturmaTarihi;

    @ManyToOne(fetch = FetchType.EAGER)
    @JoinColumn(name="ogretmen_id")
    private Kullanici ogretmenId;

    @Column(name="is_aktif")
    private boolean isAktif;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="brans_id")
    private Brans bransId;


    @ManyToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "tbl_SinavToSorular", joinColumns = @JoinColumn(name = "soru_id"),inverseJoinColumns = @JoinColumn(name = "sinav_id"))
    private Set<Sorular> sorulars;



}
