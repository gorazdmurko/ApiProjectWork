package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IDnevnikBlagajneDao;
import org.db2.murko.presker.api.healthresort.entity.DnevnikBlagajne;
import org.db2.murko.presker.api.healthresort.services.IDnevnikBlagajneService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class DnevnikBlagajneServiceImpl implements IDnevnikBlagajneService {

    @Autowired
    private IDnevnikBlagajneDao dao;

    @Override
    public int save(DnevnikBlagajne dnevnik) {
        return dao.create(dnevnik);
    }

    @Override
    public DnevnikBlagajne getDnevnikBlagajne(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<DnevnikBlagajne> getDnevnikBlagajneAll() {
        return dao.getAll();
    }

    public IDnevnikBlagajneDao getDao() {
        return dao;
    }

    public void setDao(IDnevnikBlagajneDao dao) {
        this.dao = dao;
    }
}
