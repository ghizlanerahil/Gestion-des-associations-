package com.example.gestion_associations.web;

import com.example.gestion_associations.bean.don;
import com.example.gestion_associations.service.DonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(path="/api/don")
public class donProvider {
    private final DonService donService;


    @Autowired
    public donProvider(DonService donService){
        super();
        this.donService= donService;
    }
    @GetMapping

    public List<don> findAll() {
        return donService.findAll();
    }

    public don getById(Long aLong) {
        return donService.getById(aLong);
    }

    public <S extends don> S save(S entity) {
        return donService.save(entity);
    }

    public void deleteById(Long aLong) {
        donService.deleteById(aLong);
    }
}
