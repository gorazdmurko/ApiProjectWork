package org.db2.murko.presker.api.healthresort.dao.impl;

import org.db2.murko.presker.api.healthresort.dao.IIzdelkiStoritveDao;
import org.db2.murko.presker.api.healthresort.entity.IzdelkiStoritve;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class IzdelkiStoritveDaoImpl implements IIzdelkiStoritveDao {

    @Autowired
    private HibernateTemplate hibernateTemplate;

    @Override
    public int create(IzdelkiStoritve storitev) {
        Integer res = (Integer) hibernateTemplate.save(storitev);
        return res;
    }

    @Override
    public IzdelkiStoritve get(Integer id) {
        return hibernateTemplate.get(IzdelkiStoritve.class, id);
    }

    @Override
    public List<IzdelkiStoritve> getAll() {
        return hibernateTemplate.loadAll(IzdelkiStoritve.class);
    }

    public HibernateTemplate getHibernateTemplate() {
        return hibernateTemplate;
    }

    public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
        this.hibernateTemplate = hibernateTemplate;
    }
}
