package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.ITransakcijskiRacunPoslovneEnoteDao;
import org.db2.murko.presker.api.healthresort.entity.TransakcijskiRacunPoslovneEnote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class TransakcijskiRacuniPoslovneEnoteDaoImpl implements ITransakcijskiRacunPoslovneEnoteDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(TransakcijskiRacunPoslovneEnote racun) {
        Integer res = (Integer) hibernateTemplate.save(racun);
        return res;
    }

    @Override
    public TransakcijskiRacunPoslovneEnote get(Integer id) {
        return hibernateTemplate.get(TransakcijskiRacunPoslovneEnote.class, id);
    }

    @Override
    public List<TransakcijskiRacunPoslovneEnote> getAll() {
        return hibernateTemplate.loadAll(TransakcijskiRacunPoslovneEnote.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
