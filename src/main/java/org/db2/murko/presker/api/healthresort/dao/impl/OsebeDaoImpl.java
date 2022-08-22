package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IOsebeDao;
import org.db2.murko.presker.api.healthresort.entity.Osebe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OsebeDaoImpl implements IOsebeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Osebe oseba) {
        Integer res = (Integer) hibernateTemplate.save(oseba);
        return res;
    }

    @Override
    public Osebe get(Integer id) {
        return hibernateTemplate.get(Osebe.class, id);
    }

    @Override
    public List<Osebe> getAll() {
        return hibernateTemplate.loadAll(Osebe.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
