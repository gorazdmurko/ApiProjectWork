package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.ISobeStatusiDao;
import org.db2.murko.presker.api.healthresort.entity.SobeStatusi;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class SobeStatusiDaoImpl implements ISobeStatusiDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(SobeStatusi soba) {
        Integer res = (Integer) hibernateTemplate.save(soba);
        return res;
    }

    @Override
    public SobeStatusi get(Integer id) {
        return hibernateTemplate.get(SobeStatusi.class, id);
    }

    @Override
    public List<SobeStatusi> getAll() {
        return hibernateTemplate.loadAll(SobeStatusi.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
