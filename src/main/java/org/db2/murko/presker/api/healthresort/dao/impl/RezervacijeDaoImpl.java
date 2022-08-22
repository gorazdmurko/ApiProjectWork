package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeDao;
import org.db2.murko.presker.api.healthresort.entity.Rezervacije;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RezervacijeDaoImpl implements IRezervacijeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Rezervacije rezervacija) {
        Integer res = (Integer) hibernateTemplate.save(rezervacija);
        return res;
    }

    @Override
    public Rezervacije get(Integer id) {
        return hibernateTemplate.get(Rezervacije.class, id);
    }

    @Override
    public List<Rezervacije> getAll() {
        return hibernateTemplate.loadAll(Rezervacije.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
