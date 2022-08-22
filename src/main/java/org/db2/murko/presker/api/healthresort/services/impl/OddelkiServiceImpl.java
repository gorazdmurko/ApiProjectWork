package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IOddelkiDao;
import org.db2.murko.presker.api.healthresort.entity.Oddelki;
import org.db2.murko.presker.api.healthresort.services.IOddelkiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OddelkiServiceImpl implements IOddelkiService {

    @Autowired
    private IOddelkiDao dao;

    @Override
    public int save(Oddelki oddelek) {
        return dao.create(oddelek);
    }

    @Override
    public Oddelki get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Oddelki> getAll() {
        return dao.getAll();
    }

    public IOddelkiDao getDao() {
        return dao;
    }

    public void setDao(IOddelkiDao dao) {
        this.dao = dao;
    }
}
