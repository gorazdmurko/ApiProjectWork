package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.ISobeStatusiDao;
import org.db2.murko.presker.api.healthresort.entity.SobeStatusi;
import org.db2.murko.presker.api.healthresort.services.ISobeStatusiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SobeStatusiServiceImpl implements ISobeStatusiService {

    @Autowired
    private ISobeStatusiDao dao;

    @Override
    public int save(SobeStatusi soba) {
        return dao.create(soba);
    }

    @Override
    public SobeStatusi get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<SobeStatusi> getAll() {
        return dao.getAll();
    }

    public ISobeStatusiDao getDao() {
        return dao;
    }

    public void setDao(ISobeStatusiDao dao) {
        this.dao = dao;
    }
}
