package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdelkiStoritveDao;
import org.db2.murko.presker.api.healthresort.dao.IIzdelkiStoritveSobeDao;
import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritve;
import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritveSobe;
import org.db2.murko.presker.api.healthresort.services.IIzdelkiStoritveService;
import org.db2.murko.presker.api.healthresort.services.IIzdelkiStoritveSobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IzdelkiStoritveSobeServiceImpl implements IIzdelkiStoritveSobeService {

    @Autowired
    private IIzdelkiStoritveSobeDao dao;


    @Override
    public int save(IzdelkiStoritveSobe storitev) {
        return dao.create(storitev);
    }

    @Override
    public IzdelkiStoritveSobe get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<IzdelkiStoritveSobe> getAll() {
        return dao.getAll();
    }

    public IIzdelkiStoritveSobeDao getDao() {
        return dao;
    }

    public void setDao(IIzdelkiStoritveSobeDao dao) {
        this.dao = dao;
    }
}
