package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeDao;
import org.db2.murko.presker.api.healthresort.entity.Rezervacije;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervacijeServiceImpl implements IRezervacijeService {

    @Autowired
    private IRezervacijeDao dao;

    @Override
    public int save(Rezervacije rezervacija) {
        return dao.create(rezervacija);
    }

    @Override
    public Rezervacije get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Rezervacije> getAll() {
        return dao.getAll();
    }

    public IRezervacijeDao getDao() {
        return dao;
    }

    public void setDao(IRezervacijeDao dao) {
        this.dao = dao;
    }
}
