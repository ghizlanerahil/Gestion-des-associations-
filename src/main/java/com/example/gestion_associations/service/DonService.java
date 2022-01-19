package com.example.gestion_associations.service;

import com.example.gestion_associations.bean.don;
import com.example.gestion_associations.dao.donDao;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class DonService {
    @Autowired
    private donDao donDao;

    public List<don> findAll() {
        return donDao.findAll();
    }

    public don getById(Long aLong) {
        return donDao.getById(aLong);
    }

    public <S extends don> S save(S entity) {
        return donDao.save(entity);
    }

    public void deleteById(Long aLong) {
        donDao.deleteById(aLong);
    }
}
