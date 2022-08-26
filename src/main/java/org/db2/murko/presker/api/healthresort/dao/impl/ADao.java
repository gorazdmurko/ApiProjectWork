package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IDao;
import org.db2.murko.presker.api.healthresort.entity.Blagajne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ADao implements IDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Object object) {
        Integer result = (Integer) hibernateTemplate.save(object);    // template saves the object into DB
        return result;
    }

    @Override
    public Object get(Integer id) {
        return hibernateTemplate.get(Object.class, id);
    }

    @Override
    public List<Object> getAll() {
        return hibernateTemplate.loadAll(Object.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}