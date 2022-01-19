package com.example.gestion_associations.web;


import com.example.gestion_associations.bean.association;
import com.example.gestion_associations.service.AssociationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(path="/api/association")

public class associationProvider {
    private final AssociationService associationService;

    @Autowired
    public associationProvider(AssociationService associationService){
        super();
        this.associationService=associationService;
    }
    @GetMapping

    public List<association> findAll() {
        return associationService.findAll();
    }

    public <S extends association> S save(S entity) {
        return associationService.save(entity);
    }

    public void deleteById(Long aLong) {
        associationService.deleteById(aLong);
    }
}
