package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IRezervacijeDodatneStoritveDao;
import org.db2.murko.presker.api.healthresort.entity.RezervacijeDodatneStoritve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class RezervacijeDodatneStoritveDaoImpl implements IRezervacijeDodatneStoritveDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(RezervacijeDodatneStoritve rezervacija) {
        Integer res = (Integer) hibernateTemplate.save(rezervacija);
        return res;
    }

    @Override
    public RezervacijeDodatneStoritve get(Integer id) {
        return hibernateTemplate.get(RezervacijeDodatneStoritve.class, id);
    }

    @Override
    public List<RezervacijeDodatneStoritve> getAll() {
        return hibernateTemplate.loadAll(RezervacijeDodatneStoritve.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
