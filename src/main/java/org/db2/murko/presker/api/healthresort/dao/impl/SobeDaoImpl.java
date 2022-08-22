package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.ISobeDao;
import org.db2.murko.presker.api.healthresort.entity.Sobe;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SobeDaoImpl implements ISobeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(Sobe soba) {
        Integer res = (Integer) hibernateTemplate.save(soba);
        return res;
    }

    @Override
    public Sobe get(Integer id) {
        return hibernateTemplate.get(Sobe.class, id);
    }

    @Override
    public List<Sobe> getAll() {
        return hibernateTemplate.loadAll(Sobe.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
