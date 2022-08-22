package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IPPKontaktiDao;
import org.db2.murko.presker.api.healthresort.entity.PPKontakti;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PPKontaktiDaoImpl implements IPPKontaktiDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(PPKontakti kontakt) {
        Integer res = (Integer) hibernateTemplate.save(kontakt);
        return res;
    }

    @Override
    public PPKontakti get(Integer id) {
        return hibernateTemplate.get(PPKontakti.class, id);
    }

    @Override
    public List<PPKontakti> getAll() {
        return hibernateTemplate.loadAll(PPKontakti.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
