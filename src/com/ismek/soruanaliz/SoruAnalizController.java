package com.ismek.soruanaliz;

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


@RestController
@RequestMapping("/api/v1/soruanaliz")
public class SoruAnalizController {

    @Autowired
    private SoruAnalizService soruAnalizService;

    /*---Yeni Soru Analiz Ekle---*/
    @PostMapping("/")
    public ResponseEntity<?> save(@RequestBody SoruAnaliz soruAnaliz) {
        long id = soruAnalizService.save(soruAnaliz);
        return ResponseEntity.ok().body("Yeni soru analizi eklendi...  !" + id);
    }

    /*---Belirli bir tane Soru Analizi Don ---*/
    @GetMapping("/{id}")
    public ResponseEntity<SoruAnaliz> get(@PathVariable("id") long id) {
        SoruAnaliz soruAnaliz = soruAnalizService.get(id);
        return ResponseEntity.ok().body(soruAnaliz);
    }

    /*---Tum Soru listesini don---*/
    @GetMapping("/")
    public ResponseEntity<List<SoruAnaliz>> list() {
        List<SoruAnaliz> liste = soruAnalizService.list();
        return ResponseEntity.ok().body(liste);
    }

    /*---Bir kayit guncelle ---*/
    @PutMapping("/{id}")
    public ResponseEntity<?> update(@PathVariable("id") long id, @RequestBody SoruAnaliz soruAnaliz) {
        soruAnalizService.update(id, soruAnaliz);
        return ResponseEntity.ok().body("kayit basariyla guncellendi...  !");
    }

    /*---Belirli bir Kayit Silme---*/
    @DeleteMapping("/{id}")
    public ResponseEntity<?> delete(@PathVariable("id") long id) {
        soruAnalizService.delete(id);
        return ResponseEntity.ok().body("kayit basari ile silindi...  ! ");
    }
}