package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdelkiStoritveDao;
import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritve;
import org.db2.murko.presker.api.healthresort.services.IIzdelkiStoritveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IzdelkiStoritveServiceImpl implements IIzdelkiStoritveService {

    @Autowired
    private IIzdelkiStoritveDao dao;

    @Override
    public int save(IzdelkiStoritve storitev) {
        return dao.create(storitev);
    }

    @Override
    public IzdelkiStoritve get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<IzdelkiStoritve> getAll() {
        return dao.getAll();
    }

    public IIzdelkiStoritveDao getDao() {
        return dao;
    }

    public void setDao(IIzdelkiStoritveDao dao) {
        this.dao = dao;
    }
}
