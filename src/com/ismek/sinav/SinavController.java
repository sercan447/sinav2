package com.ismek.sinav;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ismek.Brans.BransService;
import com.ismek.kullanici.Kullanici;
import com.ismek.kullanici.KullaniciService;


@RestController
@RequestMapping("/api/v1/sinav")
public class SinavController {

	@Autowired
	private SinavService sinavservice;
	@Autowired
	private BransService bransService;
	@Autowired
	private KullaniciService kullaniciService;
	
	
	@GetMapping("/All")
	public ResponseEntity<List<Sinav>> list(){
		
		return ResponseEntity.ok(sinavservice.list());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<Sinav> get(@PathVariable("id") long id){
		
		Sinav sinav = sinavservice.get(id);
		return ResponseEntity.ok().body(sinav);
	}
	
/*	@PostMapping(value="/insert")
	public ResponseEntity save(@RequestBody Sinav sinav){
		Date d = new Date();
		
		Sinav s = new Sinav();
			s.setSinavAdi("Pascal Uygulama Geliþtirme");
			s.setSinavTarihi(d);
			s.setSinavSuresi(74);
			s.setSoruSayisi(32);
			s.setBsSaati(d);
			s.setSinavSalonu("8");
			s.setKatkiYuzdesi(9);
			s.setOlusturmaTarihi(d);
			s.setAktif(true);
			s.setOgretmenId(kullaniciService.get(2));
			s.setBransId(bransService.get(2));
			
		
		long id = sinavservice.save(sinav);
		return new ResponseEntity(sinav,HttpStatus.OK);
	}
	*/


}
