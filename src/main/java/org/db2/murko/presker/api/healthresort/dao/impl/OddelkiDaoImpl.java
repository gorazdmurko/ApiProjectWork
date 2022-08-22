package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IOddelkiDao;
import org.db2.murko.presker.api.healthresort.entity.Oddelki;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OddelkiDaoImpl implements IOddelkiDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Oddelki oddelek) {
        Integer res = (Integer) hibernateTemplate.save(oddelek);
        return res;
    }

    @Override
    public Oddelki get(Integer id) {
        return hibernateTemplate.get(Oddelki.class, id);
    }

    @Override
    public List<Oddelki> getAll() {
        return hibernateTemplate.loadAll(Oddelki.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
