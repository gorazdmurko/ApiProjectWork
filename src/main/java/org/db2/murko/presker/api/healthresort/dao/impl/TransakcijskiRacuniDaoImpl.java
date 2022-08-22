package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.ITransakcijskiRacuniDao;
import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacuni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransakcijskiRacuniDaoImpl implements ITransakcijskiRacuniDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(TransakcijskiRacuni racun) {
        Integer res = (Integer) hibernateTemplate.save(racun);
        return res;
    }

    @Override
    public TransakcijskiRacuni get(Integer id) {
        return hibernateTemplate.get(TransakcijskiRacuni.class, id);
    }

    @Override
    public List<TransakcijskiRacuni> getAll() {
        return hibernateTemplate.loadAll(TransakcijskiRacuni.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
