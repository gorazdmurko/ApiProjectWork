package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdaniRacuniDao;
import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuni;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IzdaniRacuniDaoImpl implements IIzdaniRacuniDao{

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(IzdaniRacuni racun) {
        Integer result = (Integer) hibernateTemplate.save(racun);
        return result;
    }

    @Override
    public IzdaniRacuni get(Integer id) {
        return hibernateTemplate.get(IzdaniRacuni.class, id);
    }

    @Override
    public List<IzdaniRacuni> getAll() {
        return hibernateTemplate.loadAll(IzdaniRacuni.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
