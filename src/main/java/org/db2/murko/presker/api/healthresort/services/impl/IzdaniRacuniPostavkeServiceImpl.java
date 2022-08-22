package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdaniRacuniPostavkeDao;
import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuniPostavke;
import org.db2.murko.presker.api.healthresort.services.IIzdaniRacuniPostavkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IzdaniRacuniPostavkeServiceImpl implements IIzdaniRacuniPostavkeService {

    @Autowired
    private IIzdaniRacuniPostavkeDao dao;

    @Override
    public int save(IzdaniRacuniPostavke postavka) {
        return dao.create(postavka);
    }

    @Override
    public IzdaniRacuniPostavke get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<IzdaniRacuniPostavke> getAll() {
        return dao.getAll();
    }

    public IIzdaniRacuniPostavkeDao getDao() {
        return dao;
    }

    public void setDao(IIzdaniRacuniPostavkeDao dao) {
        this.dao = dao;
    }
}
