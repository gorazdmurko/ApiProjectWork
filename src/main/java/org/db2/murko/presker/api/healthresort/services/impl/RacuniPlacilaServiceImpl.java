package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IRacuniPlacilaDao;
import org.db2.murko.presker.api.healthresort.entity.RacuniPlacila;
import org.db2.murko.presker.api.healthresort.services.IRacuniPlacilaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RacuniPlacilaServiceImpl implements IRacuniPlacilaService {

    @Autowired
    private IRacuniPlacilaDao dao;

    @Override
    public int save(RacuniPlacila racun) {
        return dao.create(racun);
    }

    @Override
    public RacuniPlacila get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<RacuniPlacila> getAll() {
        return dao.getAll();
    }

    public IRacuniPlacilaDao getDao() {
        return dao;
    }

    public void setDao(IRacuniPlacilaDao dao) {
        this.dao = dao;
    }
}
