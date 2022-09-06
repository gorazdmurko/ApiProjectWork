package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IOsebeDao;
import org.db2.murko.presker.api.healthresort.entity.Osebe;
import org.db2.murko.presker.api.healthresort.services.IOsebeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class OsebeServiceImpl implements IOsebeService {

    @Autowired
    private IOsebeDao dao;

    @Override
    @Transactional
    public int save(Osebe oseba) {
        return dao.create(oseba);
    }

    @Override
    public Osebe get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Osebe> getAll() {
        return dao.getAll();
    }

    public IOsebeDao getDao() {
        return dao;
    }

    public void setDao(IOsebeDao dao) {
        this.dao = dao;
    }
}
