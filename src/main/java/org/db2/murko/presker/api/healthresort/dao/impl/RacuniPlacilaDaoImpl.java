package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IRacuniPlacilaDao;
import org.db2.murko.presker.api.healthresort.entity.RacuniPlacila;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RacuniPlacilaDaoImpl implements IRacuniPlacilaDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(RacuniPlacila racun) {
        Integer res = (Integer) hibernateTemplate.save(racun);
        return res;
    }

    @Override
    public RacuniPlacila get(Integer id) {
        return hibernateTemplate.get(RacuniPlacila.class, id);
    }

    @Override
    public List<RacuniPlacila> getAll() {
        return hibernateTemplate.loadAll(RacuniPlacila.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
