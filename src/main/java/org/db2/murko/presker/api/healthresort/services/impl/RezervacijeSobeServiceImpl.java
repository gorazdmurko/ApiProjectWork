package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeSobeDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijeSobe;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeSobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervacijeSobeServiceImpl implements IRezervacijeSobeService {

    @Autowired
    private IRezervacijeSobeDao dao;

    @Override
    public int save(RezervacijeSobe soba) {
        return dao.create(soba);
    }

    @Override
    public RezervacijeSobe get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<RezervacijeSobe> getAll() {
        return dao.getAll();
    }

    public IRezervacijeSobeDao getDao() {
        return dao;
    }

    public void setDao(IRezervacijeSobeDao dao) {
        this.dao = dao;
    }
}
