package com.ismek.sinavtosorular;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.ismek.sinav.Sinav;
import com.ismek.sorular.Sorular;

import java.util.*;
/*
@Entity
@Table(name="tbl_SinavToSorular")
public class SinavToSorular {

	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long sts_id;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Sinav> sinavId;
	
	@ManyToOne(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
	private Set<Sorular> soruId;
	
	
	
}
*/
