package com.ismek.kullanici;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.annotation.JsonView;


@RestController
@RequestMapping("/api/v1/kullanici")
public class KullaniciController {

	@Autowired
	private KullaniciService kullaniciService;
	
	// Yeni Brans ekle
	@PostMapping("/")
	public ResponseEntity<?> save(@RequestBody Kullanici kullanici){
		long id = kullaniciService.save(kullanici);
		return ResponseEntity.ok().body("Yeni kullanici eklendi... "+ id);
	}
	
	// İstenen id'li kullanici'ı getir
	
	@GetMapping("/{id}")	
	public ResponseEntity<Kullanici> get(@PathVariable("id") long id){
		Kullanici kullanici = kullaniciService.get(id);
		return ResponseEntity.ok().body(kullanici);
	}
	
	// Bütün kullaniciı getir
	@GetMapping("/")
	public ResponseEntity<List<Kullanici>> getAll(){
		List<Kullanici> kullanicilar = kullaniciService.listKullanici();
		return ResponseEntity.ok().body(kullanicilar);
	}
	
	// İstenen id'li kullanici'ı güncelle
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody Kullanici kullanici){
		kullaniciService.update(id, kullanici);
		return ResponseEntity.ok().body("[" + id + "] li kullanici guncellendi...");
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable("id") long id){
		kullaniciService.delete(id);
		return ResponseEntity.ok().body("[" + id + "] li kullanici silindi...");
	}
	
	@GetMapping("/{mail}/{tcno}")
	public ResponseEntity<?> login(@PathVariable("mail")String mail,@PathVariable("tcno")String tcno){
		
		
		Kullanici kullanici = kullaniciService.login(mail, tcno);
		if(kullanici != null)
		{
			return ResponseEntity.ok().body(kullanici);
		}
			return ResponseEntity.ok().body("Bo�");
			
	}
}
