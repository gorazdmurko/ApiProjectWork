package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IPaketiPozicijeDao;
import org.db2.murko.presker.api.healthresort.entity.PaketiPozicije;
import org.db2.murko.presker.api.healthresort.services.IPaketiPozicijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaketiPozicijeServiceImpl implements IPaketiPozicijeService {

    @Autowired
    private IPaketiPozicijeDao dao;

    @Override
    public int save(PaketiPozicije paket) {
        return dao.create(paket);
    }

    @Override
    public PaketiPozicije get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<PaketiPozicije> getAll() {
        return dao.getAll();
    }

    public IPaketiPozicijeDao getDao() {
        return dao;
    }

    public void setDao(IPaketiPozicijeDao dao) {
        this.dao = dao;
    }
}
