package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeDodatneStoritveDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijeDodatneStoritve;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeDodatneStoritveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervacijeDodatneStoritveServiceImpl implements IRezervacijeDodatneStoritveService {

    @Autowired
    IRezervacijeDodatneStoritveDao dao;

    @Override
    public int save(RezervacijeDodatneStoritve storitev) {
        return dao.create(storitev);
    }

    @Override
    public RezervacijeDodatneStoritve get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<RezervacijeDodatneStoritve> getAll() {
        return dao.getAll();
    }

    public IRezervacijeDodatneStoritveDao getDao() {
        return dao;
    }

    public void setDao(IRezervacijeDodatneStoritveDao dao) {
        this.dao = dao;
    }
}
