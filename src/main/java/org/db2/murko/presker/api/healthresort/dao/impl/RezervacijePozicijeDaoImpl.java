package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijePozicijeDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijePozicije;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RezervacijePozicijeDaoImpl implements IRezervacijePozicijeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(RezervacijePozicije rezervacija) {
        Integer res = (Integer) hibernateTemplate.save(rezervacija);
        return res;
    }

    @Override
    public RezervacijePozicije get(Integer id) {
        return hibernateTemplate.get(RezervacijePozicije.class, id);
    }

    @Override
    public List<RezervacijePozicije> getAll() {
        return hibernateTemplate.loadAll(RezervacijePozicije.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
