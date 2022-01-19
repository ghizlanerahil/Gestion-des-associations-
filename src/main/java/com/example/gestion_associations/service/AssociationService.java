package com.example.gestion_associations.service;

import com.example.gestion_associations.bean.association;
import com.example.gestion_associations.dao.associationDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class AssociationService {
    @Autowired
    private associationDao associationDao;

    public List<association> findAll() {
        return associationDao.findAll();
    }

    public <S extends association> S save(S entity) {
        return associationDao.save(entity);
    }

    public void deleteById(Long aLong) {
        associationDao.deleteById(aLong);
    }



}
