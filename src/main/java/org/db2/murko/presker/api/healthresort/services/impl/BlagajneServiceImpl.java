package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IDao;
import org.db2.murko.presker.api.healthresort.dao.impl.BlagajneDaoImpl;
import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.db2.murko.presker.api.healthresort.services.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlagajneServiceImpl implements IService<Blagajne> {

    private IDao dao = getDao(new BlagajneDaoImpl());

    @Override
    public int save(Blagajne object) {
        return dao.create(object);
    }

    @Override
    public Blagajne get(Integer id) {
        return (Blagajne) dao.get(id);
    }

    @Override
    public List getAll() {
        return dao.getAll();
    }

    private IDao getDao(IDao dao) {
        return dao;
    }

//    @Autowired
//    private IDao dao;

//    @Override
//    public int save(Blagajne blagajne) {
//        return dao.create(blagajne);    // invokes the HibernateTemplate method create() which saves the model object into DB table
//    }
//
//    @Override
//    public Blagajne getBlagajne(Integer id) {
//        return dao.get(id);
//    }
//
//    @Override
//    public List<Blagajne> getBlagajneAll() {
//        return dao.getAll();
//    }
//
//    public IBlagajneDao getDao() {
//        return dao;
//    }
//
//    public void setDao(IBlagajneDao dao) {
//        this.dao = dao;
//    }
}
