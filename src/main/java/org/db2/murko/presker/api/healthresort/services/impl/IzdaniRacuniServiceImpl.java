package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdaniRacuniDao;
import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuni;
import org.db2.murko.presker.api.healthresort.services.IIzdaniRacuniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IzdaniRacuniServiceImpl implements IIzdaniRacuniService {

    @Autowired
    private IIzdaniRacuniDao dao;

    @Override
    public int save(IzdaniRacuni racun) {
        return dao.create(racun);
    }

    @Override
    public IzdaniRacuni get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<IzdaniRacuni> getAll() {
        return dao.getAll();
    }

    public IIzdaniRacuniDao getDao() {
        return dao;
    }

    public void setDao(IIzdaniRacuniDao dao) {
        this.dao = dao;
    }
}
