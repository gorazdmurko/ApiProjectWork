package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IObjektiDao;
import org.db2.murko.presker.api.healthresort.entity.Objekti;
import org.db2.murko.presker.api.healthresort.services.IObjektiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ObjektiServiceImpl implements IObjektiService {

    @Autowired
    private IObjektiDao dao;

    @Override
    public int save(Objekti objekt) {
        return dao.create(objekt);
    }

    @Override
    public Objekti get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Objekti> getAll() {
        return dao.getAll();
    }

    public IObjektiDao getDao() {
        return dao;
    }

    public void setDao(IObjektiDao dao) {
        this.dao = dao;
    }
}
