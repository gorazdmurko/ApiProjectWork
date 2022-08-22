package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IVrstePlacilDao;
import org.db2.murko.presker.api.healthresort.entity.VrstePlacil;
import org.db2.murko.presker.api.healthresort.services.IVrstePlacilService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VrstePlacilServiceImpl implements IVrstePlacilService {

    @Autowired
    private IVrstePlacilDao dao;

    @Override
    public int save(VrstePlacil vrsta) {
        return dao.create(vrsta);
    }

    @Override
    public VrstePlacil get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<VrstePlacil> getAll() {
        return dao.getAll();
    }

    public IVrstePlacilDao getDao() {
        return dao;
    }

    public void setDao(IVrstePlacilDao dao) {
        this.dao = dao;
    }
}
