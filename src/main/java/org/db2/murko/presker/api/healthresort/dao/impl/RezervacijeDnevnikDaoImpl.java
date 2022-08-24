package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeDnevnikDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijeDnevnik;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RezervacijeDnevnikDaoImpl implements IRezervacijeDnevnikDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(RezervacijeDnevnik dnevnik) {
        Integer result = (Integer) hibernateTemplate.save(dnevnik);
        return result;
    }

    @Override
    public RezervacijeDnevnik get(Integer id) {
        return hibernateTemplate.get(RezervacijeDnevnik.class, id);
    }

    @Override
    public List<RezervacijeDnevnik> getAll() {
        return hibernateTemplate.loadAll(RezervacijeDnevnik.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
