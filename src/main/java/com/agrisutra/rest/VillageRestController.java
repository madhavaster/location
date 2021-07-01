package com.agrisutra.rest;

import com.agrisutra.model.Village;
import com.agrisutra.repo.VillageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/village")
public class VillageRestController {

    @Autowired
    private VillageRepository repository;

    @GetMapping("/all")
    public ResponseEntity<?> getAllVillages(@RequestParam Integer page, @RequestParam Integer size){
        Pageable pageable = PageRequest.of(page,size);
        Page<Village> all = repository.findAll(pageable);
        return ResponseEntity.ok(all.getContent());
    }
}
