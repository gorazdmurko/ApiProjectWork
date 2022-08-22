package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IZaposleniDao;
import org.db2.murko.presker.api.healthresort.entity.Zaposleni;
import org.db2.murko.presker.api.healthresort.services.IZaposleniService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ZaposleniServiceImpl implements IZaposleniService {

    @Autowired
    private IZaposleniDao dao;

    @Override
    public int save(Zaposleni zaposleni) {
        return dao.create(zaposleni);
    }

    @Override
    public Zaposleni get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Zaposleni> getAll() {
        return dao.getAll();
    }

    public IZaposleniDao getDao() {
        return dao;
    }

    public void setDao(IZaposleniDao dao) {
        this.dao = dao;
    }
}
