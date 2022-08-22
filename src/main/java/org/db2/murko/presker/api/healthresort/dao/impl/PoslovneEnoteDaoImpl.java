package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IPoslovneEnoteDao;
import org.db2.murko.presker.api.healthresort.entity.PoslovneEnote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PoslovneEnoteDaoImpl implements IPoslovneEnoteDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(PoslovneEnote enote) {
        Integer result = (Integer) hibernateTemplate.save(enote);    // template saves the object into DB
        return result;
    }

    @Override
    public PoslovneEnote getEnota(Integer id) {
        return hibernateTemplate.get(PoslovneEnote.class, id);
    }

    @Override
    public List<PoslovneEnote> getEnoteAll() {
        return hibernateTemplate.loadAll(PoslovneEnote.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
