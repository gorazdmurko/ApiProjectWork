package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeSobeDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijeSobe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RezervacijeSobeDaoImpl implements IRezervacijeSobeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(RezervacijeSobe rezervacija) {
        Integer res = (Integer) hibernateTemplate.save(rezervacija);
        return res;
    }

    @Override
    public RezervacijeSobe get(Integer id) {
        return hibernateTemplate.get(RezervacijeSobe.class, id);
    }

    @Override
    public List<RezervacijeSobe> getAll() {
        return hibernateTemplate.loadAll(RezervacijeSobe.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
