package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IDnevnikBlagajneDao;
import org.db2.murko.presker.api.healthresort.entity.DnevnikBlagajne;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DnevnikBlagajneDaoImpl implements IDnevnikBlagajneDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(DnevnikBlagajne dnevnik) {
        Integer result = (Integer) hibernateTemplate.save(dnevnik);
        return result;
    }

    @Override
    public DnevnikBlagajne get(Integer id) {
        return hibernateTemplate.get(DnevnikBlagajne.class, id);
    }

    @Override
    public List<DnevnikBlagajne> getAll() {
        return hibernateTemplate.loadAll(DnevnikBlagajne.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
