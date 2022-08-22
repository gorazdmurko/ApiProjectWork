package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IDodatneStoritvePostavkeDao;
import org.db2.murko.presker.api.healthresort.entity.DavcneStopnje;
import org.db2.murko.presker.api.healthresort.entity.DodatneStoritvePostavke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DodatneStoritvePostavkeDaoImpl implements IDodatneStoritvePostavkeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;


    @Override
    public int create(DodatneStoritvePostavke postavka) {
        Integer result = (Integer) hibernateTemplate.save(postavka);
        return result;
    }

    @Override
    public DodatneStoritvePostavke get(Integer id) {
        return hibernateTemplate.get(DodatneStoritvePostavke.class, id);
    }

    @Override
    public List<DodatneStoritvePostavke> getAll() {
        return hibernateTemplate.loadAll(DodatneStoritvePostavke.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
