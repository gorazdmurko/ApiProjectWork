package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IKategorijeDao;
import org.db2.murko.presker.api.healthresort.entity.Kategorije;
import org.db2.murko.presker.api.healthresort.services.IKategorijeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class KategorijeServiceImpl implements IKategorijeService {

    @Autowired
    private IKategorijeDao dao;

    @Override
    public int save(Kategorije kategorija) {
        return dao.create(kategorija);
    }

    @Override
    public Kategorije get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Kategorije> getAll() {
        return dao.getAll();
    }

    public IKategorijeDao getDao() {
        return dao;
    }

    public void setDao(IKategorijeDao dao) {
        this.dao = dao;
    }
}
