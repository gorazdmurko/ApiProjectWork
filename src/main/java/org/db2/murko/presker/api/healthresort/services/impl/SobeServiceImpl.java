package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.ISobeDao;
import org.db2.murko.presker.api.healthresort.entity.Sobe;
import org.db2.murko.presker.api.healthresort.services.ISobeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SobeServiceImpl implements ISobeService {

    @Autowired
    private ISobeDao dao;

    @Override
    public int save(Sobe soba) {
        return dao.create(soba);
    }

    @Override
    public Sobe get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Sobe> getAll() {
        return dao.getAll();
    }

    public ISobeDao getDao() {
        return dao;
    }

    public void setDao(ISobeDao dao) {
        this.dao = dao;
    }
}
