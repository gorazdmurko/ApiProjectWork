package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IObjektiDao;
import org.db2.murko.presker.api.healthresort.entity.Objekti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ObjektiDaoImpl implements IObjektiDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Objekti objekt) {
        Integer res = (Integer) hibernateTemplate.save(objekt);
        return res;
    }

    @Override
    public Objekti get(Integer id) {
        return hibernateTemplate.get(Objekti.class, id);
    }

    @Override
    public List<Objekti> getAll() {
        return hibernateTemplate.loadAll(Objekti.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
