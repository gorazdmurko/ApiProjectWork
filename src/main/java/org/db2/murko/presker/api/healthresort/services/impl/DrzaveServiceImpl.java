package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IDrzaveDao;
import org.db2.murko.presker.api.healthresort.entity.Drzave;
import org.db2.murko.presker.api.healthresort.services.IDrzaveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DrzaveServiceImpl implements IDrzaveService {

    @Autowired
    private IDrzaveDao dao;

    @Override
    public int save(Drzave drzava) {
        return dao.create(drzava);
    }

    @Override
    public Drzave get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Drzave> getAll() {
        return dao.getAll();
    }

    public IDrzaveDao getDao() {
        return dao;
    }

    public void setDao(IDrzaveDao dao) {
        this.dao = dao;
    }
}
