package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IDavcneStopnjeDao;
import org.db2.murko.presker.api.healthresort.entity.DavcneStopnje;
import org.db2.murko.presker.api.healthresort.services.IDavcneStopnjeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class DavcneStopnjeServiceImpl implements IDavcneStopnjeService {

    @Autowired
    private IDavcneStopnjeDao dao;

    @Override
    public int save(DavcneStopnje stopnja) {
        return dao.create(stopnja);
    }

    @Override
    public DavcneStopnje get(Integer id) {
        return dao.get(id);
    }

    @Override
    public List<DavcneStopnje> getAll() {
        return dao.getAll();
    }

    public IDavcneStopnjeDao getDao() {
        return dao;
    }

    public void setDao(IDavcneStopnjeDao dao) {
        this.dao = dao;
    }
}
