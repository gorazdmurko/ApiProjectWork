package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdaniRacuniPostavkeDao;
import org.db2.murko.presker.api.healthresort.entity.IzdaniRacuniPostavke;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IzdaniRacuniPostavkeDaoImpl implements IIzdaniRacuniPostavkeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(IzdaniRacuniPostavke postavka) {
        Integer result = (Integer) hibernateTemplate.save(postavka);
        return result;
    }

    @Override
    public IzdaniRacuniPostavke get(Integer id) {
        return hibernateTemplate.get(IzdaniRacuniPostavke.class, id);
    }

    @Override
    public List<IzdaniRacuniPostavke> getAll() {
        return hibernateTemplate.loadAll(IzdaniRacuniPostavke.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
