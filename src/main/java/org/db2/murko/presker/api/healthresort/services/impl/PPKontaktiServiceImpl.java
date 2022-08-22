package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IPPKontaktiDao;
import org.db2.murko.presker.api.healthresort.entity.PPKontakti;
import org.db2.murko.presker.api.healthresort.services.IPPKontaktiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PPKontaktiServiceImpl implements IPPKontaktiService {

    @Autowired
    private IPPKontaktiDao dao;

    @Override
    public int save(PPKontakti kontakt) {
        return dao.create(kontakt);
    }

    @Override
    public PPKontakti get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<PPKontakti> getAll() {
        return dao.getAll();
    }

    public IPPKontaktiDao getDao() {
        return dao;
    }

    public void setDao(IPPKontaktiDao dao) {
        this.dao = dao;
    }
}
