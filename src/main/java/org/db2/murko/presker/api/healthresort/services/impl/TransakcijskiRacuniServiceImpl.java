package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.ITransakcijskiRacuniDao;
import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacuni;
import org.db2.murko.presker.api.healthresort.services.ITransakcijskiRacuniServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransakcijskiRacuniServiceImpl implements ITransakcijskiRacuniServis {

    @Autowired
    private ITransakcijskiRacuniDao dao;

    @Override
    public int save(TransakcijskiRacuni racun) {
        return dao.create(racun);
    }

    @Override
    public TransakcijskiRacuni get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<TransakcijskiRacuni> getAll() {
        return dao.getAll();
    }

    public ITransakcijskiRacuniDao getDao() {
        return dao;
    }

    public void setDao(ITransakcijskiRacuniDao dao) {
        this.dao = dao;
    }
}
