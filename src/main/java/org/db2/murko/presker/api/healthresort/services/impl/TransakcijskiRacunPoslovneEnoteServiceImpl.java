package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.ITransakcijskiRacunPoslovneEnoteDao;
import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacunPoslovneEnote;
import org.db2.murko.presker.api.healthresort.services.ITransakcijskiRacunPoslovneEnoteServis;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransakcijskiRacunPoslovneEnoteServiceImpl implements ITransakcijskiRacunPoslovneEnoteServis {

    @Autowired
    private ITransakcijskiRacunPoslovneEnoteDao dao;

    @Override
    public int save(TransakcijskiRacunPoslovneEnote enota) {
        return dao.create(enota);
    }

    @Override
    public TransakcijskiRacunPoslovneEnote get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<TransakcijskiRacunPoslovneEnote> getAll() {
        return dao.getAll();
    }

    public ITransakcijskiRacunPoslovneEnoteDao getDao() {
        return dao;
    }

    public void setDao(ITransakcijskiRacunPoslovneEnoteDao dao) {
        this.dao = dao;
    }
}
