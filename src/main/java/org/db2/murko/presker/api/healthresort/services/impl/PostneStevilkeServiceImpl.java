package org.db2.murko.presker.api.healthresort.services.impl;

import org.db2.murko.presker.api.healthresort.dao.IPostneStevilkeDao;
import org.db2.murko.presker.api.healthresort.entity.PostneStevilke;
import org.db2.murko.presker.api.healthresort.services.IPostneStevilkeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostneStevilkeServiceImpl implements IPostneStevilkeService {

    @Autowired
    private IPostneStevilkeDao dao;

    @Override
    public int save(PostneStevilke stevilka) {
        return dao.create(stevilka);
    }

    @Override
    public PostneStevilke get(Integer id) {
        return dao.getPostne(id);
    }

    @Override
    public List<PostneStevilke> getAll() {
        return dao.getPostneAll();
    }

    public IPostneStevilkeDao getDao() {
        return dao;
    }

    public void setDao(IPostneStevilkeDao dao) {
        this.dao = dao;
    }
}
