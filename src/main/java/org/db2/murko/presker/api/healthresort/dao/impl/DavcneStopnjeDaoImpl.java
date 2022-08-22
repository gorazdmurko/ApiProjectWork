package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IDavcneStopnjeDao;
import org.db2.murko.presker.api.healthresort.entity.DavcneStopnje;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class DavcneStopnjeDaoImpl implements IDavcneStopnjeDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(DavcneStopnje stopnja) {
        Integer result = (Integer) hibernateTemplate.save(stopnja);
        return result;
    }

    @Override
    public DavcneStopnje get(Integer id) {
        return hibernateTemplate.get(DavcneStopnje.class, id);
    }

    @Override
    public List<DavcneStopnje> getAll() {
        return hibernateTemplate.loadAll(DavcneStopnje.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
