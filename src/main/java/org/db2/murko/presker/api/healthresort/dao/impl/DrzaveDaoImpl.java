package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IDrzaveDao;
import org.db2.murko.presker.api.healthresort.entity.Drzave;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DrzaveDaoImpl implements IDrzaveDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Drzave drzava) {
        Integer result = (Integer) hibernateTemplate.save(drzava);
        return result;
    }

    @Override
    public Drzave get(Integer id) {
        return hibernateTemplate.get(Drzave.class, id);
    }

    @Override
    public List<Drzave> getAll() {
        return hibernateTemplate.loadAll(Drzave.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
