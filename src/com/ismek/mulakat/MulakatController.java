package com.ismek.mulakat;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/v1/mulakat")
public class MulakatController {

	
	@Autowired
	private MulakatService mulakatservice;
	
	@GetMapping("/All")
	public ResponseEntity<List<Mulakat>> list(){
		
		return ResponseEntity.ok(mulakatservice.list());
	}
	
}
