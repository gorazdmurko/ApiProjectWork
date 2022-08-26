package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IBlagajneDao;
import org.db2.murko.presker.api.healthresort.dao.IDao;
import org.db2.murko.presker.api.healthresort.dao.impl.ADao;
import org.db2.murko.presker.api.healthresort.dao.impl.BlagajneDaoImpl;
import org.db2.murko.presker.api.healthresort.services.IService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AService implements IService {

    private IDao getDao(IDao dao) {
        return dao;
    }

    @Override
    public int save(Object object) {
        return getDao(new ADao()).create(object);
    }

    @Override
    public Object get(Integer id) {
        // return dao.get(id);
        return null;
    }

    @Override
    public List getAll() {
        // return dao.getAll();
        return null;
    }
}
