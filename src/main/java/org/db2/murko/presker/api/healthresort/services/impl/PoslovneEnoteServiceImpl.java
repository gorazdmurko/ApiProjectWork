package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IPoslovneEnoteDao;
import org.db2.murko.presker.api.healthresort.entity.PoslovneEnote;
import org.db2.murko.presker.api.healthresort.services.IPoslovneEnoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PoslovneEnoteServiceImpl implements IPoslovneEnoteService {

    @Autowired
    private IPoslovneEnoteDao dao;

    @Override
    public int save(PoslovneEnote enote) {
        return dao.create(enote);
    }

    @Override
    public PoslovneEnote getEnota(Integer id) {
        return dao.getEnota(id);
    }

    @Override
    public List<PoslovneEnote> getEnoteAll() {
        return dao.getEnoteAll();
    }
}
