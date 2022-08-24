package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeDnevnikDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijeDnevnik;
import org.db2.murko.presker.api.healthresort.services.IRezervacijeDnevnikService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RezervacijeDnevnikServiceImpl implements IRezervacijeDnevnikService {

    @Autowired
    private IRezervacijeDnevnikDao dao;

    @Override
    public int save(RezervacijeDnevnik dnevnik) {
        return dao.create(dnevnik);
    }

    @Override
    public RezervacijeDnevnik getRezervacijeDnevnik(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<RezervacijeDnevnik> getRezervacijeDnevnikAll() {
        return dao.getAll();
    }

    public IRezervacijeDnevnikDao getDao() {
        return dao;
    }

    public void setDao(IRezervacijeDnevnikDao dao) {
        this.dao = dao;
    }
}
