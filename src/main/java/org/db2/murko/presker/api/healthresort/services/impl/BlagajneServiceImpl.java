package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IBlagajneDao;
import org.db2.murko.presker.api.healthresort.dao.IDao;
import org.db2.murko.presker.api.healthresort.dao.impl.BlagajneDaoImpl;
import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.db2.murko.presker.api.healthresort.services.IBlagajneService;
import org.db2.murko.presker.api.healthresort.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlagajneServiceImpl implements IBlagajneService {

    @Autowired
    private IBlagajneDao dao;

    @Override
    public int save(Blagajne blagajne) {
        return dao.create(blagajne);    // invokes the HibernateTemplate method create() which saves the model object into DB table
    }

    @Override
    public Blagajne getBlagajne(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<Blagajne> getBlagajneAll() {
        return dao.getAll();
    }

    public IBlagajneDao getDao() {
        return dao;
    }

    public void setDao(IBlagajneDao dao) {
        this.dao = dao;
    }
}
