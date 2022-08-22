package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IDodatneStoritvePostavkeDao;
import org.db2.murko.presker.api.healthresort.entity.DodatneStoritvePostavke;
import org.db2.murko.presker.api.healthresort.services.IDodatneStoritvePostavkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DodatneStoritvePostavkeServiceImpl implements IDodatneStoritvePostavkeService {

    @Autowired
    private IDodatneStoritvePostavkeDao dao;

    @Override
    public int save(DodatneStoritvePostavke storitev) {
        return dao.create(storitev);
    }

    @Override
    public DodatneStoritvePostavke get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<DodatneStoritvePostavke> getAll() {
        return dao.getAll();
    }

    public IDodatneStoritvePostavkeDao getDao() {
        return dao;
    }

    public void setDao(IDodatneStoritvePostavkeDao dao) {
        this.dao = dao;
    }
}
