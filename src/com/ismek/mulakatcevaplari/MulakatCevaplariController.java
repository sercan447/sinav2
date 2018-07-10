package com.ismek.mulakatcevaplari;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.ismek.mulakatcevaplari.MulakatCevaplari;


@RestController
@RequestMapping("/api/v1/mulakatcevaplari")
public class MulakatCevaplariController {
	
	
	@Autowired
	private MulakatCevaplariService mulakatcevaplariservice;
	
	@GetMapping("/All")
	public ResponseEntity<List<MulakatCevaplari>> list(){
		
		return ResponseEntity.ok(mulakatcevaplariservice.list());
	}

}
