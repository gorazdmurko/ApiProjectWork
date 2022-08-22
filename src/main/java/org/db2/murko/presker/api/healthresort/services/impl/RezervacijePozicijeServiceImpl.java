package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijePozicijeDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijePozicije;
import org.db2.murko.presker.api.healthresort.services.IRezervacijePozicijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervacijePozicijeServiceImpl implements IRezervacijePozicijeService {

    @Autowired
    private IRezervacijePozicijeDao dao;

    @Override
    public int save(RezervacijePozicije pozicija) {
        return dao.create(pozicija);
    }

    @Override
    public RezervacijePozicije get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<RezervacijePozicije> getAll() {
        return dao.getAll();
    }

    public IRezervacijePozicijeDao getDao() {
        return dao;
    }

    public void setDao(IRezervacijePozicijeDao dao) {
        this.dao = dao;
    }
}
