package com.ismek.kullanicitorole;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1/kullanicitorole")
public class KullaniciToRoleController {

	@Autowired
	private KullaniciToRoleService kullaniciToRoleService;
	
	
	@GetMapping("/")
	public ResponseEntity<List<KullaniciToRole>> list(){
		
		return ResponseEntity.ok(kullaniciToRoleService.list());
	}
	
	
	@GetMapping("/{id}")
	public ResponseEntity<KullaniciToRole> get(@PathVariable("id") long id){
		
		KullaniciToRole mulakatTorole = kullaniciToRoleService.get(id);
		return ResponseEntity.ok().body(mulakatTorole);
	}
	
	
}
